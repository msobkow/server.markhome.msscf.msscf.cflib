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

public class CFLibNullArgumentException extends CFLibArgumentException {

	public CFLibNullArgumentException(
		String msg )
	{
		super( msg );
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass, methName, msg );
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, msg, th );
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( throwingClass, methName, argNo, argName, msg );
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName, msg, th );
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName )
	{
		super( throwingClass, methName, argNo, argName,
			"is null" );
	}

	public CFLibNullArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"is null",
			th );
	}

	public CFLibNullArgumentException(
		String fieldName,
		String msg )
	{
		super( fieldName, msg );
	}

	public CFLibNullArgumentException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName, methName, msg );
	}

	public CFLibNullArgumentException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, msg, th );
	}

	public CFLibNullArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( fieldName, methName, argNo, argName, msg );
	}

	public CFLibNullArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName, msg, th );
	}

	public CFLibNullArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName )
	{
		super( fieldName, methName, argNo, argName,
			"is null" );
	}

	public CFLibNullArgumentException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"is null",
			th );
	}
}
