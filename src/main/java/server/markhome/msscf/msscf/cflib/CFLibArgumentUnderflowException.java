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

public class CFLibArgumentUnderflowException extends CFLibArgumentException {

	public CFLibArgumentUnderflowException(
		String msg )
	{
		super( msg );
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass, methName, msg );
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, msg, th );
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( throwingClass, methName, argNo, argName, msg );
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName, msg, th );
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString());
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString());
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString());
	}

	public CFLibArgumentUnderflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString());
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String msg )
	{
		super( fieldName, msg );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName, methName, msg );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, msg, th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( fieldName, methName, argNo, argName, msg );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName, msg, th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString());
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString());
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue);
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString());
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentUnderflowException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString());
	}
}
