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

public class CFLibInvalidArgumentException extends CFLibArgumentException {

	public CFLibInvalidArgumentException(
		String msg )
	{
		super( msg );
	}

	public CFLibInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass, methName, msg );
	}

	public CFLibInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, msg, th );
	}

	public CFLibInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( throwingClass, methName, argNo, argName, msg );
	}

	public CFLibInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName, msg, th );
	}

	public CFLibInvalidArgumentException(
		String fieldName,
		String msg )
	{
		super( fieldName, msg );
	}

	public CFLibInvalidArgumentException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName, methName, msg );
	}

	public CFLibInvalidArgumentException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, msg, th );
	}

	public CFLibInvalidArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( fieldName, methName, argNo, argName, msg );
	}

	public CFLibInvalidArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName, msg, th );
	}

	public CFLibInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName )
	{
		super(String.format(Inz.s("cflib.CFLibInvalidArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName));
		this.localMessage = String.format(Inz.x("cflib.CFLibInvalidArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName);
	}

	public CFLibInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibInvalidArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibInvalidArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName);
	}

	public CFLibInvalidArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibInvalidArgumentException.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibInvalidArgumentException.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName);
	}
}
