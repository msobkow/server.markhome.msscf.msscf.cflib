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

public class CFLibStaleCacheDetectedException extends IllegalStateException {
	protected String localMessage = null;
	protected String enMsgCause = null;
	protected String xMsgCause = null;
	protected String enTargetTable = null;
	protected String xTargetTable = null;
	protected Object indexKey = null;

	public CFLibStaleCacheDetectedException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public CFLibStaleCacheDetectedException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException(
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

	public CFLibStaleCacheDetectedException()
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"), "").trim());
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"), "").trim();
	}

	public CFLibStaleCacheDetectedException(Throwable th)
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"), "").trim(), th);
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"), "").trim();
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName )
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + ( ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))),
			th);
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ))));
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsgCause,
		String xMsgCause,
		String enTargetTable,
		String xTargetTable,
		Object argKey )
	{
		super( ((enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "() " : " "),
							enMsgCause,
							enTargetTable,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "() " : " "),
							enMsgCause,
							enTargetTable))
					: ((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "() " : " "),
							enMsgCause,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "() " : " "),
							enMsgCause))));
		this.localMessage = (((xTargetTable != null && !xTargetTable.isEmpty()) || (enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "")),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable,
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "")),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable))
					: ((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "")),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "")),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause)))));
		this.enMsgCause = enMsgCause;
		this.xMsgCause = xMsgCause;
		this.enTargetTable = enTargetTable;
		this.xTargetTable = xTargetTable;
		this.indexKey = argKey;
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsgCause,
		String xMsgCause,
		String enTargetTable,
		String xTargetTable,
		Object argKey,
		Throwable th )
	{
		super( ((enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "() " : " "),
							enMsgCause,
							enTargetTable,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "() " : " "),
							enMsgCause,
							enTargetTable))
					: ((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "() " : " "),
							enMsgCause,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "() " : " "),
							enMsgCause))),
			th);
		this.localMessage = (((xTargetTable != null && !xTargetTable.isEmpty()) || (enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "")),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable,
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "")),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable))
					: ((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "")),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "")),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause)))));
		this.enMsgCause = enMsgCause;
		this.xMsgCause = xMsgCause;
		this.enTargetTable = enTargetTable;
		this.xTargetTable = xTargetTable;
		this.indexKey = argKey;
	}

	public Object getIndexKey() {
		return indexKey;
	}

	public String getMsgCause() {
		return enMsgCause;
	}

	public String getLocalizedMsgCause() {
		if (xMsgCause != null && !xMsgCause.isEmpty())
			return xMsgCause;
		else
			return enMsgCause;
	}

	public String getTargetTable() {
		return enTargetTable;
	}

	public String getLocalizedTargetTable() {
		if (xTargetTable != null && !xTargetTable.isEmpty())
			return xTargetTable;
		else
			return enTargetTable;
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
