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

public class CFLibDependentsDetectedException extends CFLibRuntimeException {

	protected String relnType = null;
	protected String relnName = null;
	protected String relnTarget = null;
	protected Object pkey = null;

	public CFLibDependentsDetectedException(
		String msg )
	{
		super( msg );
	}
	
	@SuppressWarnings("rawtypes")
	public CFLibDependentsDetectedException(
		Class throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass, methName, msg );
	}

	@SuppressWarnings("rawtypes")
	public CFLibDependentsDetectedException(
		Class throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, msg, th );
	}

	@SuppressWarnings("rawtypes")
	public CFLibDependentsDetectedException(
		Class throwingClass,
		String methName,
		String relationType,
		String relationName,
		String targetName,
		Object argKey )
	{
		super( throwingClass, methName,
			(argKey != null) ?
				String.format(Inz.x("cflib.CFLibDependentsDetectedException.pkey"),
					relationType, relationName, targetName, argKey.toString())
				: String.format(Inz.x("cflib.CFLibDependentsDetectedException.default"),
					relationType, relationName, targetName));
		relnType = relationType;
		relnName = relationName;
		relnTarget = targetName;
		pkey = argKey;
	}

	@SuppressWarnings("rawtypes")
	public CFLibDependentsDetectedException(
		Class throwingClass,
		String methName,
		String relationType,
		String relationName,
		String targetName,
		Object argKey,
		Throwable th )
	{
		super( throwingClass, methName,
			(argKey != null) ?
				String.format(Inz.x("cflib.CFLibDependentsDetectedException.pkey"),
					relationType, relationName, targetName, argKey.toString())
				: String.format(Inz.x("cflib.CFLibDependentsDetectedException.default"),
					relationType, relationName, targetName),
			th );
		relnType = relationType;
		relnName = relationName;
		relnTarget = targetName;
		pkey = argKey;
	}

	public String getRelationType() {
		return( relnType );
	}
	
	public String getRelationName() {
		return( relnName );
	}
	
	public Object getPrimaryKey() {
		return( pkey );
	}
}
