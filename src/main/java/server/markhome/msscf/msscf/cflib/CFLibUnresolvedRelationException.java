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

public class CFLibUnresolvedRelationException extends IllegalStateException {
	protected String localMessage = null;

	protected String enRelnType = null;
	protected String xRelnType = null;

	protected String enRelnName = null;
	protected String xRelnName = null;

	protected String enRelnTarget = null;
	protected String xRelnTarget = null;

	protected Object indexKey = null;

	public CFLibUnresolvedRelationException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibUnresolvedRelationException(
		String enMsg, String xMsg, Throwable cause) {
			super(enMsg, cause);
			this.localMessage = xMsg;
	}

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException(
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

	public CFLibUnresolvedRelationException()
	{
		super(String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"), ""));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"), "");
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
					th);
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
	}

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
				enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" )),
			th);
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ));
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey)
	{
		super( (indexKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
					enRelationType,
					enRelationName,
					indexKey.toString(),
					enTargetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
					enRelationType,
					enRelationName,
					enTargetName ));
		this.localMessage = (indexKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					indexKey.toString(),
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName);
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey,
		Throwable th )
	{
		super( (indexKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
					enRelationType,
					enRelationName,
					indexKey.toString(),
					enTargetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
					enRelationType,
					enRelationName,
					enTargetName ),
			th);
		this.localMessage = (indexKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					indexKey.toString(),
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName);
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey)
	{
		super( (indexKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
					enRelationType,
					enRelationName,
					indexKey.toString(),
					enTargetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
					enRelationType,
					enRelationName,
					enTargetName ));
		this.localMessage = (indexKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					indexKey.toString(),
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName);
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public CFLibUnresolvedRelationException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		String enRelationType,
		String xRelationType,
		String enRelationName,
		String xRelationName,
		String enTargetName,
		String xTargetName,
		Object indexKey,
		Throwable th)
	{
		super( (indexKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
					enRelationType,
					enRelationName,
					indexKey.toString(),
					enTargetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					enFieldName + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
					enRelationType,
					enRelationName,
					enTargetName ),
			th);
		this.localMessage = (indexKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					indexKey.toString(),
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" ))),
					(xRelationType != null && !xRelationType.isEmpty()) ? xRelationType : enRelationType,
					(xRelationName != null && !xRelationName.isEmpty()) ? xRelationName : enRelationName,
					(xTargetName != null && !xTargetName.isEmpty()) ? xTargetName : enTargetName);
		enRelnType = enRelationType;
		xRelnType = xRelationType;
		enRelnName = enRelationName;
		xRelnName = xRelationName;
		enRelnTarget = enTargetName;
		xRelnTarget = xTargetName;
		this.indexKey = indexKey;
	}

	public String getRelationType() {
		return( enRelnType );
	}
	
	public String getRelationName() {
		return( enRelnName );
	}
	
	public String getRelationTarget() {
		return( enRelnTarget );
	}

	public String getLocalizedRelationType() {
		return( (xRelnType != null && !xRelnType.isEmpty()) ? xRelnType : enRelnType );
	}
	
	public String getLocalizedRelationName() {
		return( (xRelnName != null && !xRelnName.isEmpty()) ? xRelnName : enRelnName );
	}
	
	public String getLocalizedRelationTarget() {
		return( (xRelnTarget != null && !xRelnTarget.isEmpty()) ? xRelnTarget : enRelnTarget );
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
