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

/**
 * CFLibUnrecognizedAttributeException is primarily thrown by the manufacted XML parsers.
 */
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
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	// public CFLibUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	public CFLibUnrecognizedAttributeException(
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

	public CFLibUnrecognizedAttributeException(
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
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	// public CFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("cflib.CFLibArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("cflib.CFLibArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	public CFLibUnrecognizedAttributeException(
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

	public CFLibUnrecognizedAttributeException(
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

	public CFLibUnrecognizedAttributeException()
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				"").trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				"").trim();
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}



	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public CFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
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
