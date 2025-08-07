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

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;

public class CFLibBigDecimalUtil {

	public final static int MAX_DIGITS = 31;
	public final static int MAX_PRECISION = 30;
	
	final static String S_Hashes = "###############################";
	final static String S_Zeroes = "0000000000000000000000000000000";
	final static String S_Nines =  "9999999999999999999999999999999";

	public static Format getNumberFormat( String enFieldName, String xFieldName, int argDigits, int argPrecis ) {
		final String S_ProcName = "getNumberFormat";

		if( ( enFieldName == null ) || ( enFieldName.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( CFLibBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName" );
		}

		if( argDigits < 1 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1 );
		}
		else if( argDigits > MAX_DIGITS ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS );
		}

		if( argPrecis < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0 );
		}
		else if( argPrecis > MAX_PRECISION ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION );
		}

		if( argPrecis >= argDigits ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1 );
		}

		int integerDigits = argDigits - argPrecis;
		
		String usePrefixHash = S_Hashes.substring( 0, integerDigits - 1 );
		
		String useSuffix;
		if( argPrecis > 0 ) {
			useSuffix = "." + S_Zeroes.substring( 0, argPrecis );
		}
		else {
			useSuffix = "";
		}
		
		Format numberFormat = new DecimalFormat(
			usePrefixHash + "0" + useSuffix + ";-" + usePrefixHash + "0" + useSuffix );
		
		return( numberFormat );
	}

	public static BigDecimal getAbsoluteMinValue( String enFieldName, String xFieldName, int argDigits, int argPrecis ) {
		final String S_ProcName = "getAbsoluteMinValue";

		if( ( enFieldName == null ) || ( enFieldName.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( CFLibBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName" );
		}

		if( argDigits < 1 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1 );
		}
		else if( argDigits > MAX_DIGITS ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS );
		}

		if( argPrecis < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0 );
		}
		else if( argPrecis > MAX_PRECISION ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION );
		}

		if( argPrecis >= argDigits ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1 );
		}

		int integerDigits = argDigits - argPrecis;

		String strval;
		if( argPrecis == 0 ) {
			strval = "-" + S_Nines.substring( 0, integerDigits );
		}
		else {
			strval = "-" + S_Nines.substring( 0, integerDigits ) + "." + S_Nines.substring( 0, argPrecis );
		}
		
		BigDecimal absoluteMinValue = new BigDecimal( strval );
		
		return( absoluteMinValue );
	}

	public static BigDecimal getAbsoluteMaxValue( String enFieldName, String xFieldName, int argDigits, int argPrecis ) {
		final String S_ProcName = "getAbsoluteMaxValue";

		if( ( enFieldName == null ) || ( enFieldName.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( CFLibBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName" );
		}

		if( argDigits < 1 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1 );
		}
		else if( argDigits > MAX_DIGITS ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS );
		}

		if( argPrecis < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0 );
		}
		else if( argPrecis > MAX_PRECISION ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION );
		}

		if( argPrecis >= argDigits ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1 );
		}

		int integerDigits = argDigits - argPrecis;

		String strval;
		if( argPrecis == 0 ) {
			strval = S_Nines.substring( 0, integerDigits );
		}
		else {
			strval = S_Nines.substring( 0, integerDigits ) + "." + S_Nines.substring( 0, argPrecis );
		}
		
		BigDecimal absoluteMaxValue = new BigDecimal( strval );
		
		return( absoluteMaxValue );
	}

	public static BigDecimal coerce( String enFieldName, String xFieldName, int argDigits, int argPrecis, BigDecimal value ) {
		final String S_ProcName = "coerce";

		if( ( enFieldName == null ) || ( enFieldName.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( CFLibBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName" );
		}

		if( value == null ) {
			throw new CFLibNullArgumentException( enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value" );
		}
		
		if( argDigits < 1 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1 );
		}
		else if( argDigits > MAX_DIGITS ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS );
		}

		if( argPrecis < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0 );
		}
		else if( argPrecis > MAX_PRECISION ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION );
		}

		if( argPrecis >= argDigits ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1 );
		}

		BigDecimal minValue = getAbsoluteMinValue( enFieldName, xFieldName, argDigits, argPrecis );
		if( value.compareTo( minValue ) < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				value,
				minValue );
		}
		
		BigDecimal maxValue = getAbsoluteMaxValue( enFieldName, xFieldName, argDigits, argPrecis );
		if( value.compareTo( maxValue ) > 0 ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				value,
				maxValue );
		}

		String coercedString = getNumberFormat( enFieldName, xFieldName, argDigits, argPrecis ).format( value );
		
		BigDecimal coercedValue = new BigDecimal( coercedString );
		
		return( coercedValue );
	}

	public static BigDecimal parse( String enFieldName, String xFieldName, int argDigits, int argPrecis, String value ) {
		final String S_ProcName = "parse";

		if( ( enFieldName == null ) || ( enFieldName.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( CFLibBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName" );
		}

		if( ( value == null ) || ( value.length() <= 0 ) ) {
			return( null );
		}
		
		if( argDigits < 1 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1 );
		}
		else if( argDigits > MAX_DIGITS ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS );
		}

		if( argPrecis < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0 );
		}
		else if( argPrecis > MAX_PRECISION ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION );
		}

		if( argPrecis >= argDigits ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1 );
		}
		
		BigDecimal rawValue = new BigDecimal( value );
		BigDecimal minValue = getAbsoluteMinValue( enFieldName, xFieldName, argDigits, argPrecis );
		BigDecimal maxValue = getAbsoluteMaxValue( enFieldName, xFieldName, argDigits, argPrecis );

		if( rawValue.compareTo( minValue ) < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				rawValue,
				minValue );
		}
		
		if( rawValue.compareTo( maxValue ) > 0 ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				rawValue,
				maxValue );
		}

		String coercedString = getNumberFormat( enFieldName, xFieldName, argDigits, argPrecis ).format( rawValue );
		
		BigDecimal coercedValue = new BigDecimal( coercedString );
		
		return( coercedValue );
	}

	public static String format( String enFieldName, String xFieldName, int argDigits, int argPrecis, BigDecimal value ) {
		final String S_ProcName = "format";

		if( ( enFieldName == null ) || ( enFieldName.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( CFLibBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName" );
		}

		if( value == null ) {
			throw new CFLibNullArgumentException( enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value" );
		}
		
		if( argDigits < 1 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1 );
		}
		else if( argDigits > MAX_DIGITS ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS );
		}

		if( argPrecis < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0 );
		}
		else if( argPrecis > MAX_PRECISION ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION );
		}

		if( argPrecis >= argDigits ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1 );
		}

		BigDecimal minValue = getAbsoluteMinValue( enFieldName, xFieldName, argDigits, argPrecis );
		if( value.compareTo( minValue ) < 0 ) {
			throw new CFLibArgumentUnderflowException( enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				value,
				minValue );
		}
		
		BigDecimal maxValue = getAbsoluteMaxValue( enFieldName, xFieldName, argDigits, argPrecis );
		if( value.compareTo( maxValue ) > 0 ) {
			throw new CFLibArgumentOverflowException( enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				value,
				maxValue );
		}

		String coercedString = getNumberFormat( enFieldName, xFieldName, argDigits, argPrecis ).format( value );
		
		return( coercedString );
	}
}
