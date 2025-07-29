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

/**
 *	The performance of exception handling in a high-volume Java system cannot
 *	be underestimated.  Anything you can do to speed up exception
 *	instantiation and initialization will dramatically improve the
 *	performance of the system under real life workloads, where users
 *	do input bad data.
 */
public class CFLibRuntimeException extends RuntimeException {

	protected String localMessage = null;

	public CFLibRuntimeException(
		String msg )
	{
		super( msg );
		localMessage = msg;
	}

	public CFLibRuntimeException(
		String msg,
		Throwable th )
	{
		super( msg, th );
		localMessage = msg;
	}

	public CFLibRuntimeException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" ) );
		localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" );
	}

	public CFLibRuntimeException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" ),
					th );
		localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" );
	}

	public CFLibRuntimeException(
		String fieldName,
		String msg )
	{
		super( fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibRuntimeException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" ) );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" );
	}

	public CFLibRuntimeException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" ),
					th );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" );
	}

	@Override
	public String getLocalizedMessage() {
		if (localMessage != null) {
			return localMessage;
		}
		else {
			return this.getMessage();
		}
	}
}
