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

public class CFLibUsageException extends IllegalStateException {
	TBD: Clone CFLibMustOverrideException when migrated as base template for this exception class

	protected String localMessage = null;

	public CFLibUsageException(
		String msg )
	{
		super( msg );
		this.localMessage = msg;
	}

	public CFLibUsageException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUsageException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUsageException(
		String fieldName,
		String msg )
	{
		super( fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUsageException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUsageException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUsageException()
	{
		super(String.format(Inz.s("cflib.CFLibUsageException.default"), ""));
		this.localMessage = String.format(Inz.x("cflib.CFLibUsageException.default"), "");
	}

	public CFLibUsageException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUsageException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUsageException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " ));
	}

	public CFLibUsageException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibUsageException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUsageException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " ));
	}

	public CFLibUsageException(
		String fieldName,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibUsageException.default"),
				fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUsageException.default"),
				fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() ": " " ));
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
