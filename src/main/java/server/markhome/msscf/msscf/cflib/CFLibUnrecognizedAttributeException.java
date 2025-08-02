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

import java.util.*;

import server.markhome.msscf.msscf.cflib.inz.Inz;

public class CFLibUnrecognizedAttributeException extends NoSuchElementException {
	protected String localMessage = null;
	protected String locInfo = null;
	protected String attrName = null;

	public CFLibUnrecognizedAttributeException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibUnrecognizedAttributeException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	// public CFLibUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String enMethName,
	// 	String xMethName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	// public CFLibUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String enMethName,
	// 	String xMethName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	public CFLibUnrecognizedAttributeException(
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

	public CFLibUnrecognizedAttributeException(
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

	// public CFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
	// 			enFieldName,
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
	// 			(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	// }

	// public CFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMethName,
	// 	String xMethName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	// public CFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMethName,
	// 	String xMethName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ( ( ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : (( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	public CFLibUnrecognizedAttributeException(
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

	public CFLibUnrecognizedAttributeException(
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

	public CFLibUnrecognizedAttributeException()
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				"").trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				"").trim();
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName )
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}



	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName )
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
	}

	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							(enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							(enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							(enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							(enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							enFieldName + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? "." + xMethName + "()" : ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )))));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}


	public String getLocInfo() {
		return locInfo;
	}

	public String getAttrName() {
		return attrName;
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
