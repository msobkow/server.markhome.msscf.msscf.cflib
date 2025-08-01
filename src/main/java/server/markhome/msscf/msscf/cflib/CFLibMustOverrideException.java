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

public class CFLibMustOverrideException extends IllegalStateException {

	protected String localizedMessage = null;

	TBD: replicate CFLibInvalidArgumentException with base CFLibArgumentException base implementation incorporated.

	public CFLibMustOverrideException(
		String msg )
	{
		super( msg );
		this.localizedMessage = msg;
	}

	public CFLibMustOverrideException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" ) );
		this.localizedMessage = throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" );
	}

	public CFLibMustOverrideException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" ),
				th );
		this.localizedMessage = throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" );
	}

	public CFLibMustOverrideException(
		String fieldName,
		String msg )
	{
		super( fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localizedMessage = fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibMustOverrideException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" ) );
		this.localizedMessage = fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" );
	}

	public CFLibMustOverrideException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" ),
				th );
		this.localizedMessage = fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )	? msg : "" );
	}

	public CFLibMustOverrideException()
	{
		super( "Method must be overridden by implementation" );
	}

	public CFLibMustOverrideException(
		Class<?> throwingClass,
		String methName )
	{
		super( String.format(Inz.s("cflib.CFLibMustOverrideException.default"),
			throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty())	? "." + methName + "() " : " " )));
		this.localizedMessage = String.format(Inz.x("cflib.CFLibMustOverrideException.default"),
			throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty())	? "." + methName + "() " : " " ));
	}

	public CFLibMustOverrideException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibMustOverrideException.default"),
			throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty())	? "." + methName + "() " : " " )),
			th );
	}

	public CFLibMustOverrideException(
		String fieldName,
		String methName,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibMustOverrideException.default"),
			fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )),
			th );
		this.localizedMessage = String.format(Inz.x("cflib.CFLibMustOverrideException.default"),
			fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ));
	}

	@Override
	public String getLocalizedMessage() {
		if (localizedMessage != null) {
			return localizedMessage;
		}
		else {
			return getMessage();
		}
	}
}
