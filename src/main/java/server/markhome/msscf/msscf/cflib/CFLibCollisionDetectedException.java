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

public class CFLibCollisionDetectedException extends CFLibRuntimeException {

	protected Object indexKey = null;

	public CFLibCollisionDetectedException(
		String enMsg,
		String xMsg )
	{
		super( enMsg, xMsg );
	}

	public CFLibCollisionDetectedException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg )
	{
		super( throwingClass, enMethName, xMethName, enMsg, xMsg );
	}

	public CFLibCollisionDetectedException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( throwingClass, enMethName, xMethName, enMsg, xMsg, th );
	}

	public CFLibCollisionDetectedException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		Object argKey )
	{
		super( ((argKey != null)
					? String.format(Inz.s("cflib.CFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )),
						argKey.toString())
					: String.format(Inz.s("cflib.CFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )))),
				((argKey != null)
					? String.format(Inz.x("cflib.CFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))),
						argKey.toString())
					: String.format(Inz.s("cflib.CFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))))));
		indexKey = argKey;
	}

	public CFLibCollisionDetectedException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		Object argKey,
		Throwable th )
	{
		super( ((argKey != null)
					? String.format(Inz.s("cflib.CFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )),
						argKey.toString())
					: String.format(Inz.s("cflib.CFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )))),
				((argKey != null)
					? String.format(Inz.x("cflib.CFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))),
						argKey.toString())
					: String.format(Inz.s("cflib.CFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))))),
				th);
		indexKey = argKey;
	}

	public Object getIndexKey() {
		return( indexKey );
	}
}
