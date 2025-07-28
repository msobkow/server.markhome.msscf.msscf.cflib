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

import server.markhome.msscf.msscf.cflib.inz.Inz;

public class CFLibArgumentException extends IllegalArgumentException {

	protected String localMessage = null;

	public CFLibArgumentException(
		String msg )
	{
		super( msg );
		this.localMessage = msg;
	}

	public CFLibArgumentException(
		String msg, Throwable cause) {
			super(msg, cause);
			this.localMessage = msg;
	}

	public CFLibArgumentException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ));
	}

	public CFLibArgumentException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ));
	}

	public CFLibArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg	: "" ) );
	}

	public CFLibArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg	: "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg	: "" ) );
	}

	public CFLibArgumentException(
		String fieldName,
		String msg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				fieldName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				fieldName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg	: "" ) );
	}

	public CFLibArgumentException(
		String fieldName,
		String methName,
		String msg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
	}

	public CFLibArgumentException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
	}

	public CFLibArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
	}

	public CFLibArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
	}

	@Override
	public String getLocalizedMessage() {
		if (localMessage != null) {
			return localMessage;
		}
		else {
			return getMessage();
		}
	}
}