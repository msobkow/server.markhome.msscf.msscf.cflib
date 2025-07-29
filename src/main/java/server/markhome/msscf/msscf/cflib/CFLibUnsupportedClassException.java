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

public class CFLibUnsupportedClassException extends IllegalStateException {

	protected String localMessage = null;

	public CFLibUnsupportedClassException(
		String msg )
	{
		super( msg );
		this.localMessage = msg;
	}

	public CFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnsupportedClassException(
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

	public CFLibUnsupportedClassException(
		String fieldName,
		String msg )
	{
		super( fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnsupportedClassException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnsupportedClassException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnsupportedClassException()
	{
		super(String.format(Inz.s("cflib.CFLibUnsupportedClassException.default"), ""));//%1$sUnsupported class
		this.localMessage = String.format(Inz.x("cflib.CFLibUnsupportedClassException.default"), "");
	}

	public CFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibUnsupportedClassException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnsupportedClassException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ));
	}

	public CFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibUnsupportedClassException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUnsupportedClassException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ));
	}

	public CFLibUnsupportedClassException(
		String fieldName,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibUnsupportedClassException.default"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUnsupportedClassException.default"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ));
	}

	public CFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		String argObjName,
		Object argObj,
		String argExpectedClasses )
	{
		super( (argObj != null) ? String.format(Inz.s("cflib.CFLibUnsupportedClassException.objwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argObjName,
					argObj.getClass().getName(),
					argExpectedClasses )
				: String.format(Inz.s("cflib.CFLibUnsupportedClassException.nullwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argObjName,
					argExpectedClasses ) );
		this.localMessage = (argObj != null) ? String.format(Inz.x("cflib.CFLibUnsupportedClassException.objwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argObjName,
					argObj.getClass().getName(),
					argExpectedClasses )
				: String.format(Inz.x("cflib.CFLibUnsupportedClassException.nullwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argObjName,
					argExpectedClasses );
	}

	public CFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		String argObjName,
		Object argObj,
		String argExpectedClasses,
		Throwable th )
	{
		super( (argObj != null) ? String.format(Inz.s("cflib.CFLibUnsupportedClassException.objwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argObjName,
					argObj.getClass().getName(),
					argExpectedClasses )
				: String.format(Inz.s("cflib.CFLibUnsupportedClassException.nullwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argObjName,
					argExpectedClasses ),
			th );
		this.localMessage = (argObj != null) ? String.format(Inz.x("cflib.CFLibUnsupportedClassException.objwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argObjName,
					argObj.getClass().getName(),
					argExpectedClasses )
				: String.format(Inz.x("cflib.CFLibUnsupportedClassException.nullwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ),
					argObjName,
					argExpectedClasses );
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
