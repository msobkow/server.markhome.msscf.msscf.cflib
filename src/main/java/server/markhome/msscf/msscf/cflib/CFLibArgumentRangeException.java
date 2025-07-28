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

public class CFLibArgumentRangeException extends CFLibArgumentException {

	public CFLibArgumentRangeException(
		String msg )
	{
		super( msg );
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass, methName, msg );
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, msg, th );
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( throwingClass, methName, argNo, argName, msg );
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName, msg, th );
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		short maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		int maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		long maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		float maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		double maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		String maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentRangeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName : "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String msg )
	{
		super( fieldName, msg );
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName, methName, msg );
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, msg, th );
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( fieldName, methName, argNo, argName, msg );
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName, msg, th );
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		short maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short minValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		int maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int minValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		long maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long minValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.decimal.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		float maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float minValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		double maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double minValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.float.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar minValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		String maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String minValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue,
				minValue,
				maxValue);
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()));
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString());
	}

	public CFLibArgumentRangeException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal minValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString()),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibArgumentRangeException.string.FldArgMsg"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName	: "" ),
				argNo,
				argName,
				argValue.toString(),
				minValue.toString(),
				maxValue.toString());
	}
}
