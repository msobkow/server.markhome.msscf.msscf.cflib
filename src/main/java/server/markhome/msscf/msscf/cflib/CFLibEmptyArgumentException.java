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

public class CFLibEmptyArgumentException extends CFLibArgumentException {

	// Inherited constructor patterns

	public CFLibEmptyArgumentException(
		String enMsg,
		String xMsg )
	{
		super(enMsg, xMsg);
	}

	public CFLibEmptyArgumentException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, xMsg, th);
	}

	public CFLibEmptyArgumentException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg )
	{
		super(throwingClass, enMethName, xMethName, enMsg, xMsg);
	}

	public CFLibEmptyArgumentException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(throwingClass, enMethName, xMethName, enMsg, xMsg, th);
	}

	public CFLibEmptyArgumentException(
	 	Class<?> throwingClass,
	 	String enMethName,
		String xMethName,
	 	int argNo,
	 	String enArgName,
		String xArgName,
	 	String enMsg,
	 	String xMsg )
	{
	 	super(throwingClass, enMethName, xMethName, argNo, enArgName, xArgName, enMsg, xMsg);
	}

	public CFLibEmptyArgumentException(
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
	 	super(throwingClass, enMethName, xMethName, argNo, enArgName, xArgName, enMsg, xMsg, th);
	}

	public CFLibEmptyArgumentException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, enMsg, xMsg);
	}

	public CFLibEmptyArgumentException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, enMethName, xMethName, enMsg, xMsg);
	}

	public CFLibEmptyArgumentException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(enFieldName, xFieldName, enMethName, xMethName, enMsg, xMsg, th);
	}

	public CFLibEmptyArgumentException(
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
	 	super(enFieldName, xFieldName, enMethName, xMethName, argNo, enArgName, xArgName, enMsg, xMsg);
	}

	public CFLibEmptyArgumentException(
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
	 	super(enFieldName, xFieldName, enMethName, xMethName, argNo, enArgName, xArgName, enMsg, xMsg, th);
	}

	// Custom/most-often-used constructors

	public CFLibEmptyArgumentException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName )
	{
		super(String.format(Inz.s("cflib.CFLibEmptyArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
				argNo,
				enArgName),
			String.format(Inz.x("cflib.CFLibEmptyArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( (xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ( ( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )),
				argNo,
				(xArgName != null && !xArgName.isEmpty())? xArgName : enArgName));
	}

	public CFLibEmptyArgumentException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibEmptyArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( enMethName != null ) && !enMethName.isEmpty()) ? "." + enMethName + "()" : "" ),
				argNo,
				enArgName),
			String.format(Inz.x("cflib.CFLibEmptyArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( (xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ( ( enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )),
				argNo,
				(xArgName != null && !xArgName.isEmpty())? xArgName : enArgName),
			th);
	}

	public CFLibEmptyArgumentException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName)
	{
		super(String.format(Inz.s("cflib.CFLibEmptyArgumentException.FldArgMsg"),
				enFieldName + ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()"	: "" ),
				argNo,
				enArgName),
			String.format(Inz.x("cflib.CFLibEmptyArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ( (enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )),
				argNo,
				(xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName));
	}

	public CFLibEmptyArgumentException(
		String enFieldName,
		String xFieldName,
		String enMethName,
		String xMethName,
		int argNo,
		String enArgName,
		String xArgName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibEmptyArgumentException.FldArgMsg"),
				enFieldName + ( ( enMethName != null && !enMethName.isEmpty()) ? "." + enMethName + "()"	: "" ),
				argNo,
				enArgName),
			String.format(Inz.x("cflib.CFLibEmptyArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ( (enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )),
				argNo,
				(xArgName != null && !xArgName.isEmpty()) ? xArgName : enArgName),
				th );
	}
}
