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
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
				argNo,
				enArgName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
				argNo,
				((xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
				argNo,
				enArgName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
				argNo,
				((xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
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
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		String enMsg,
		String xMsg )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
				argNo,
				enArgName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
				argNo,
				((xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
				argNo,
				enArgName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
				argNo,
				((xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibUniqueIndexViolationException()
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"), "" ).trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"), "" ).trim();
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName )
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))).trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )))).trim();
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))).trim(),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUniqueIndexViolation.default"),
				throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )))).trim();
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enArgIndexName,
		String xArgIndexName,
		Object argKey )
	{
		super( (argKey != null) ? String.format(Inz.s("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
					enArgIndexName,
					argKey.toString())
				: String.format(Inz.s("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
					enArgIndexName));
		this.localMessage = (argKey != null) ? String.format(Inz.x("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName,
					argKey.toString())
				: String.format(Inz.x("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName);
		this.indexKey = argKey;
	}

	public CFLibUniqueIndexViolationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enArgIndexName,
		String xArgIndexName,
		Object argKey,
		Throwable th )
	{
		super( (argKey != null) ? String.format(Inz.s("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
					enArgIndexName,
					argKey.toString())
				: String.format(Inz.s("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
					enArgIndexName));
		this.localMessage = (argKey != null) ? String.format(Inz.x("cflib.CFLibUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName,
					argKey.toString())
				: String.format(Inz.x("cflib.CFLibUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
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
