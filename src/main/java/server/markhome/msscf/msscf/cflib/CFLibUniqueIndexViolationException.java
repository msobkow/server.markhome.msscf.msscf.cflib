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
 * CFLibUniqueIndexViolationException is thrown when there is a violation of a unique index other than the primary key index for an underlying table.
 */
public class CFLibUniqueIndexViolationException extends IllegalStateException {

	protected String localMessage = null;
	protected Object indexKey = null;

	public CFLibUniqueIndexViolationException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibUniqueIndexViolationException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibUniqueIndexViolationException(
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

	public CFLibUniqueIndexViolationException(
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
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUniqueIndexViolationException(
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
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUniqueIndexViolationException(
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
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUniqueIndexViolationException()
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"), "" ).trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"), "" ).trim();
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )).trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )).trim();
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )).trim(),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )).trim();
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String enArgIndexName,
		String xArgIndexName,
		Object argKey )
	{
		super( (argKey != null) ? String.format(Inz.s("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enArgIndexName,
					argKey.toString())
				: String.format(Inz.s("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enArgIndexName));
		this.localMessage = (argKey != null) ? String.format(Inz.x("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName,
					argKey.toString())
				: String.format(Inz.x("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName);
		this.indexKey = argKey;
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String enArgIndexName,
		String xArgIndexName,
		Object argKey,
		Throwable th )
	{
		super( (argKey != null) ? String.format(Inz.s("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enArgIndexName,
					argKey.toString())
				: String.format(Inz.s("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					enArgIndexName));
		this.localMessage = (argKey != null) ? String.format(Inz.x("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName,
					argKey.toString())
				: String.format(Inz.x("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName);
		this.indexKey = argKey;
	}

	public Object getIndexKey() {
		return( indexKey );
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
