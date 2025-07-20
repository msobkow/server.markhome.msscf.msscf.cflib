/*
 *	MSS Code Factory CFLib
 *
 *	Copyright (c) 2025 Mark Stephen Sobkow
 *
 *	This file is part of MSS Code Factory 3.0.
 *
 *	MSS Code Factory 3.0 is free software: you can redistribute it and/or modify
 *	it under the terms of the Apache v2.0 License as published by the Apache Foundation.
 *
 *	MSS Code Factory 3.0 is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 *	You should have received a copy of the Apache v2.0 License along with
 *	MSS Code Factory.  If not, see https://www.apache.org/licenses/LICENSE-2.0
 *
 *	Contact Mark Stephen Sobkow at mark.sobkow@gmail.com for commercial licensing or
 *  customization.
 */

package server.markhome.msscf.msscf.cflib;

import java.io.*;
import java.util.*;

/**
 *	Implement the OmfMessageLogInterface over a Log4J Logger.
 */
public class CFLibConsoleMessageLog
implements ICFLibMessageLog {

	/**
	 *	Handle for the current file output stream.
	 */
	private PrintStream	logFile = null;

	/**
	 *	What is the current indent level for logging?
	 */
	private int		   	indent = 0;
	
	/**
	 *	Default constructor.
	 */
	public CFLibConsoleMessageLog() {
		indent = 0;
	}
	
	/**
	 *	Get the current log indent level.
	 */
	public int getMessageLogIndent() {
		return( indent );
	}
	
	/**
	 *	Indent the logging messages another level
	 */
	public synchronized void dedent() {
		if( indent > 0 ) {
			indent --;
		}
		else {
			indent = 0;
		}
	}
	
	/**
	 *	Indent the logging messages another level
	 */
	public synchronized void indent() {
		indent ++;
	}

	/**
	 *	Get an PrintStream that wraps this log
	 */
	public PrintStream getPrintStream() {
		return( logFile );
	}
	
	/**
	 *	Log a message
	 *
	 *	@param		msg		String
	 */
	public synchronized void message( String msg ) {

		if( msg == null ) {
			return;
		}

		StringBuffer buff = new StringBuffer();

		Calendar cal = Calendar.getInstance();
		String stamp = String.format( "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL ", cal );
		buff.append( stamp );

		int			i;
		for( i = 0; i < indent; i ++ ) {
			buff.append( "\t" );
		}
		buff.append( msg );
		if( ! msg.endsWith( "\n" ) ) {
			buff.append( "\n" );
		}

		boolean wroteSomewhere = false;

		if( logFile != null ) {
			logFile.append( buff.toString() );
			logFile.flush();
		}

		if( ! wroteSomewhere ) {
			System.out.append( buff.toString() );
			System.out.flush();
		}
	}

//	OLD API's that need to go away

	/**
	 *	Open the specified file for logging
	 *
	 *	@param	fileName	The name of the file to open as a log.
	 */
	public void openLogFile( String fileName )
		throws FileNotFoundException
	{
		assert ( fileName != null ) && ( fileName.length() > 0 ) : "File name must be specified";
		assert logFile == null : "Log file is already open";
		logFile = new PrintStream( fileName );
	}
	
	/**
	 *	Close the log file.
	 */
	public void closeLogFile() {
		if( logFile != null ) {
			PrintStream old = logFile;
			logFile = null;
			
			old.flush();
			old.close();
		}
	}

}
