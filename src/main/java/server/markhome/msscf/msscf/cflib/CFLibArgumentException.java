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

/**
 * CFLibArgumentException provides the base implementation for a number of argument exceptions, including CFLibArgumentOverflowException,
 * CFLibArgumentRangeExxception, CFLibArgumentUnderflowException, CFLibEmptyArgumentExeption, CFLibInvalidArgumentException, and CFLibNullArgumentException.
 * 
 * There is a rich set of constructors for the class, with variations that accept the class object for the caller and a method name, and versions that accept nationalized field names and method names.
 */
public class CFLibArgumentException extends IllegalArgumentException {

	protected String localMessage = null;

	public CFLibArgumentException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibArgumentException(
		String enMsg, String xMsg, Throwable cause) {
			super(enMsg, cause);
			this.localMessage = xMsg;
	}

	public CFLibArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" )),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibArgumentException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
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