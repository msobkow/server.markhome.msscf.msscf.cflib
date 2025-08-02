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

import org.springframework.context.annotation.Primary;

import server.markhome.msscf.msscf.cflib.inz.Inz;

public class CFLibPrimaryKeyNotNewException extends IllegalStateException {
	TBD: Remove xMethName, xArgName

	protected String localMessage = null;
	protected Object indexKey = null;

	public CFLibPrimaryKeyNotNewException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibPrimaryKeyNotNewException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		String xMethName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ))),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		String xMethName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ))),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				enArgName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ))),
				argNo,
				((xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				enArgName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ))),
				argNo,
				((xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public CFLibPrimaryKeyNotNewException(
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

	public CFLibPrimaryKeyNotNewException(
		String enFieldName,
		String xFieldName,
		String methName,
		String xMethName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ))),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibPrimaryKeyNotNewException(
		String enFieldName,
		String xFieldName,
		String methName,
		String xMethName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ))),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibPrimaryKeyNotNewException(
		String enFieldName,
		String xFieldName,
		String methName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		String enMsg,
		String xMsg )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				enArgName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ))),
				argNo,
				((xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibPrimaryKeyNotNewException(
		String enFieldName,
		String xFieldName,
		String methName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibArgumentException.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				enArgName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ))),
				argNo,
				((xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public CFLibPrimaryKeyNotNewException()
	{
		super( String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.default"), "") );
		this.localMessage = String.format(Inz.x("cflib.CFLibPrimaryKeyNotNewException.default"), "");
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName )
	{
		super( String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.default"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )));
		this.localMessage = String.format(Inz.x("cflib.CFLibPrimaryKeyNotNewException.default"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ));
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.default"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibPrimaryKeyNotNewException.default"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ));
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		String xMethName,
		Object indexKey )
	{
		super( ((indexKey != null)
					? String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))));
		this.localMessage = ((indexKey != null)
					? String.format(Inz.x("cflib.CFLibPrimaryKeyNotNewException.pkey"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""))),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.default"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))));
		this.indexKey = indexKey;
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		String xMethName,
		Object indexKey,
		Throwable th)
	{
		super( ((indexKey != null)
					? String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))),
			th);
		this.localMessage = ((indexKey != null)
					? String.format(Inz.x("cflib.CFLibPrimaryKeyNotNewException.pkey"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""))),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.default"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))));
		this.indexKey = indexKey;
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		Object argKey )
	{
		super( String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.pkey"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
				argKey.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibPrimaryKeyNotNewException.pkey"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
				argKey.toString());
		indexKey = argKey;
	}

	public CFLibPrimaryKeyNotNewException(
		Class<?> throwingClass,
		String methName,
		Object argKey,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibPrimaryKeyNotNewException.pkey"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
				argKey.toString()),
			th );
		this.localMessage = String.format(Inz.x("cflib.CFLibPrimaryKeyNotNewException.pkey"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
				argKey.toString());
		indexKey = argKey;
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
