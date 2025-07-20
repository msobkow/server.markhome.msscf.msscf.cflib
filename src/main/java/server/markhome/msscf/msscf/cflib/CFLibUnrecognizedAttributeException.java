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

public class CFLibUnrecognizedAttributeException extends NoSuchElementException {

	public CFLibUnrecognizedAttributeException(
		String msg )
	{
		super( msg );
	}

	@SuppressWarnings("rawtypes")
	public CFLibUnrecognizedAttributeException(
		Class throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName()
					+ ( ( ( methName != null ) && ( methName.length() > 0 ))
						? "." + methName
						: "" )
					+ "() "
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )
						? msg
						: "" ) );
	}

	public CFLibUnrecognizedAttributeException(
		String fieldName,
		String msg )
	{
		super( fieldName + "() "
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )
						? msg
						: "" ) );
	}

	public CFLibUnrecognizedAttributeException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName
					+ ( ( ( methName != null ) && ( methName.length() > 0 ))
						? "." + methName
						: "" )
					+ "() "
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )
						? msg
						: "" ) );
	}

	public CFLibUnrecognizedAttributeException()
	{
		super( "Unrecognized attribute" );
	}

	@SuppressWarnings("rawtypes")
	public CFLibUnrecognizedAttributeException(
		Class throwingClass,
		String methName )
	{
		super( throwingClass.getName()
					+ ( ( ( methName != null ) && ( methName.length() > 0 ))
						? "." + methName
						: "" )
					+ "() Unrecognized attribute" );
	}

	@SuppressWarnings("rawtypes")
	public CFLibUnrecognizedAttributeException(
		Class throwingClass,
		String methName,
		String locInfo,
		String attrName )
	{
		super( throwingClass.getName()
					+ ( ( ( methName != null ) && ( methName.length() > 0 ))
						? "." + methName
						: "" )
					+ "() "
					+ ((( locInfo != null ) && ( locInfo.length() > 0 ))
						? locInfo + " "
						: "" )
					+ "Unrecognized attribute "
					+ ( (( attrName != null ) && ( attrName.length() > 0 ))
							? "\"" + attrName + "\""
							: "null" ) );
		}
}
