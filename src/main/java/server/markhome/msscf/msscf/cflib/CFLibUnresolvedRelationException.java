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

public class CFLibUnresolvedRelationException extends IllegalStateException {

	TBD: Copy in constructor patterns from existing code, bring in accessors and attributes from DependentsDetectedException, etc.
	
	protected String localMessage = null;

	public CFLibUnresolvedRelationException(
		String msg )
	{
		super( msg );
		this.localMessage = msg;
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty())	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty())	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty())	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty())	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnresolvedRelationException(
		String fieldName,
		String msg )
	{
		super( fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnresolvedRelationException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnresolvedRelationException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibUnresolvedRelationException()
	{
		super(String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"), ""));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"), "");
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : "" )));
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : "" ));
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : "" )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibUnresolvedRelationException.default"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : "" ));
	}

	public CFLibUnresolvedRelationException(
		String fieldName,
		String methName,
		Throwable th )
	{
		super( String.format(Inz.s("cflib.CFLibUnresolvedRelationException.default"),
					fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : "" )),
				th );
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		String relationType,
		String relationName,
		String targetName,
		Object argKey )
	{
		super( (argKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					relationType,
					relationName,
					argKey.toString(),
					targetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					relationType,
					relationName,
					targetName ));
		this.localMessage = (argKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					relationType,
					relationName,
					argKey.toString(),
					targetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					relationType,
					relationName,
					targetName );
	}

	public CFLibUnresolvedRelationException(
		Class<?> throwingClass,
		String methName,
		String relationType,
		String relationName,
		String targetName,
		Object argKey,
		Throwable th )
	{
		super( (argKey != null) ? String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					relationType,
					relationName,
					argKey.toString(),
					targetName)
				: String.format(Inz.s("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					relationType,
					relationName,
					targetName ),
				th );
		this.localMessage = (argKey != null) ? String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullkey"),//%1$s%2$s relation %3$s key %4%s referencing %5$s could not be resolved
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					relationType,
					relationName,
					argKey.toString(),
					targetName)
				: String.format(Inz.x("cflib.CFLibUnresolvedRelationException.fullnokey"),//%1$s%2$s relation %3$s referencing %4$s could not be resolved
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					relationType,
					relationName,
					targetName );
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
