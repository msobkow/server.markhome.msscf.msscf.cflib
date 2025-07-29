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

public class CFLibUniqueIndexViolationException extends IllegalStateException {

	protected String localMessage = null;

	public CFLibUniqueIndexViolationException(
		String msg )
	{
		super( msg );
		localMessage = msg;
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUniqueIndexViolationException(
		String fieldName,
		String msg )
	{
		super( fieldName + " "
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ));
		this.localMessage = fieldName + " "
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUniqueIndexViolationException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUniqueIndexViolationException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUniqueIndexViolationException()
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"), "" ));
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"), "" );
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ));
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ));
	}

	public CFLibUniqueIndexViolationException(
		String fieldName,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ));
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String argIndexName,
		Object argKey )
	{
		super( (argKey != null) ? String.format(Inz.s("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argIndexName,
					argKey.toString())
				: String.format(Inz.s("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + (( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argIndexName));
		this.localMessage = (argKey != null) ? String.format(Inz.x("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argIndexName,
					argKey.toString())
				: String.format(Inz.x("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + (( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argIndexName);
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String argIndexName,
		Object argKey,
		Throwable th )
	{
		super( (argKey != null) ? String.format(Inz.s("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argIndexName,
					argKey.toString())
				: String.format(Inz.s("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + (( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argIndexName),
				th );
		this.localMessage = (argKey != null) ? String.format(Inz.x("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argIndexName,
					argKey.toString())
				: String.format(Inz.x("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + (( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argIndexName);
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
