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

public class CFLibUnrecognizedAttributeException extends NoSuchElementException {

	protected String localMessage = null;

	public CFLibUnrecognizedAttributeException(
		String msg )
	{
		super( msg );
		this.localMessage = msg;
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnrecognizedAttributeException(
		String fieldName,
		String msg )
	{
		super( fieldName + " "+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + " "+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}
	
	public CFLibUnrecognizedAttributeException(
		String fieldName,
		String msg,
		Throwable th )
	{
		super( fieldName + " "+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ), th );
		this.localMessage = fieldName + " "+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnrecognizedAttributeException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnrecognizedAttributeException()
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				""));
		this.localMessage = String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				"");
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ));
	}

	public CFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && locInfo.length() > 0) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " ),
							locInfo,
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " ),
							attrName)
					: String.format(Inz.s("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " ))));
		this.localMessage = (locInfo != null && locInfo.length() > 0) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " ),
							locInfo,
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " ),
							attrName)
					: String.format(Inz.x("cflib.CFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() ": " " )));
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
