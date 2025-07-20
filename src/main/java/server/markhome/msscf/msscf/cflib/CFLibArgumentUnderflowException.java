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
import java.math.*;

public class CFLibArgumentUnderflowException extends CFLibArgumentException {

	public CFLibArgumentUnderflowException(
		String msg )
	{
		super( msg );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass, methName, msg );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, msg, th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( throwingClass, methName, argNo, argName, msg );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName, msg, th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Short.toString( argValue )
				+ " must be at least "
				+ Short.toString( maxValue ) );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Short.toString( argValue )
				+ " must be at least "
				+ Short.toString( maxValue ),
			th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Integer.toString( argValue )
				+ " must be at least "
				+ Integer.toString( maxValue ) );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Integer.toString( argValue )
				+ " must be at least "
				+ Integer.toString( maxValue ),
			th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Long.toString( argValue )
				+ " must be at least "
				+ Long.toString( maxValue ) );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Long.toString( argValue )
				+ " must be at least "
				+ Long.toString( maxValue ),
			th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Float.toString( argValue )
				+ " must be at least "
				+ Float.toString( maxValue ) );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Float.toString( argValue )
				+ " must be at least "
				+ Float.toString( maxValue ),
			th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Double.toString( argValue )
				+ " must be at least "
				+ Double.toString( maxValue ) );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Double.toString( argValue )
				+ " must be at least "
				+ Double.toString( maxValue ),
			th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString() );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString(),
			th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString() );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString(),
			th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString() );
	}

	@SuppressWarnings("rawtypes")
	public CFLibArgumentUnderflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
				"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString(),
			th );
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
		short maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Short.toString( argValue )
				+ " must be at least "
				+ Short.toString( maxValue ) );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Short.toString( argValue )
				+ " must be at least "
				+ Short.toString( maxValue ),
			th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Integer.toString( argValue )
				+ " must be at least "
				+ Integer.toString( maxValue ) );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Integer.toString( argValue )
				+ " must be at least "
				+ Integer.toString( maxValue ),
			th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Long.toString( argValue )
				+ " must be at least "
				+ Long.toString( maxValue ) );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Long.toString( argValue )
				+ " must be at least "
				+ Long.toString( maxValue ),
			th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Float.toString( argValue )
				+ " must be at least "
				+ Float.toString( maxValue ) );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Float.toString( argValue )
				+ " must be at least "
				+ Float.toString( maxValue ),
			th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Double.toString( argValue )
				+ " must be at least "
				+ Double.toString( maxValue ) );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Double.toString( argValue )
				+ " must be at least "
				+ Double.toString( maxValue ),
			th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString() );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString(),
			th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString() );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString(),
			th );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString() );
	}

	public CFLibArgumentUnderflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
				"value " + argValue.toString()
				+ " must be at least "
				+ maxValue.toString(),
			th );
	}
}
