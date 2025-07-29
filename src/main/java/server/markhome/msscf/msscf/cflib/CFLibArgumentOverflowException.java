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

import java.util.Calendar;

import server.markhome.msscf.msscf.cflib.inz.Inz;

import java.math.*;

public class CFLibArgumentOverflowException extends CFLibArgumentException {

	public CFLibArgumentOverflowException(
		String msg )
	{
		super( msg );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass, methName, msg );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, msg, th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( throwingClass, methName, argNo, argName, msg );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName, msg, th );
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
					th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String msg )
	{
		super( fieldName, msg );
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName, methName, msg );
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, msg, th );
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( fieldName, methName, argNo, argName, msg );
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName, msg, th );
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue);
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentOverflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString());
	}
}
