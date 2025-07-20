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

public class CFLibCachedMessageLog
implements ICFLibMessageLog {

	private StringBuffer cacheContents = new StringBuffer();
	private int		   	indent = 0;
	
	/**
	 *	Default constructor.
	 */
	public CFLibCachedMessageLog() {
		indent = 0;
	}

	public void clearCache() {
		cacheContents.setLength( 0 );
	}

	public String getCacheContents() {
		return( cacheContents.toString() );
	}
	
	public int getMessageLogIndent() {
		return( indent );
	}
	
	public synchronized void dedent() {
		if( indent > 0 ) {
			indent --;
		}
		else {
			indent = 0;
		}
	}
	
	public synchronized void indent() {
		indent ++;
	}
	
	public synchronized void message( String msg ) {

		if( msg == null ) {
			return;
		}

		int			i;
		for( i = ( ( cacheContents.length() <= 0 ) ? 1 : 0 ); i < indent; i ++ ) {
			cacheContents.append( "\t" );
		}
		cacheContents.append( msg );
		if( ! msg.endsWith( "\n" ) ) {
			cacheContents.append( "\n" );
		}
	}

//	OLD API's that need to go away

	public PrintStream getPrintStream() {
		return( null );
	}

	public void openLogFile( String fileName )
		throws FileNotFoundException
	{
		// Do-nothing stub; cached message logs don't write to files
	}
	
	public void closeLogFile() {
		// Do-nothing stub; cached message logs don't write to files
	}
}
