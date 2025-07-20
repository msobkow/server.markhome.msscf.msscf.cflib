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

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *	MessageLog implementations support indented application messaging.
 *	A given log implementation might also implement the ErrorLog interface,
 *	allowing it to display an interleaved mix of application and error
 *	messages.
 *	<p>
 *	All methods of the interface are expected to be synchronized.
 */
public interface ICFLibMessageLog {

	/**
	 *	Get an PrintStream that wraps this log
	 */
	public PrintStream getPrintStream();
	
	/**
	 *	Get the current log indent level.
	 */
	public int getMessageLogIndent();
	
	/**
	 *	Increase the log indentation.
	 */
	public void indent();
	
	/**
	 *	Decrease the log indentation.
	 */
	public void dedent();
	
	/**
	 *	Log an application message.
	 */
	public void message( String msg );
	
	/**
	 *	Open the specified file for logging
	 *
	 *	@param	fileName	The name of the file to open as a log.
	 */
	public void openLogFile( String fileName )
		throws FileNotFoundException;
	
	/**
	 *	Close the log file.
	 */
	public void closeLogFile();
}
