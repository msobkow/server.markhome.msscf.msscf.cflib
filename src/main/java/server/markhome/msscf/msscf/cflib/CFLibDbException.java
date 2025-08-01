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

public class CFLibDbException extends CFLibRuntimeException {

	protected Object indexKey = null;

	public CFLibDbException(
		String enMsg,
		String xMsg )
	{
		super( enMsg, xMsg );
	}

	public CFLibDbException(
		String enMsg,
		String xMsg,
		Object indexKey )
	{
		super( enMsg, xMsg );
		this.indexKey = indexKey;
	}

	public CFLibDbException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg )
	{
		super( throwingClass, enMethName, xMethName, enMsg, xMsg );
	}

	public CFLibDbException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg,
		Object indexKey )
	{
		super( throwingClass, enMethName, xMethName, enMsg, xMsg );
		this.indexKey = indexKey;
	}

	public CFLibDbException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( throwingClass, enMethName, xMethName, enMsg, xMsg, th );
	}

	public CFLibDbException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		String enMsg,
		String xMsg,
		Object indexKey,
		Throwable th )
	{
		super( throwingClass, enMethName, xMethName, enMsg, xMsg, th );
		this.indexKey = indexKey;
	}

	public CFLibDbException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		Throwable th )
	{
		super(	String.format(Inz.s("cflib.CFLibDbException.sqlexcept"),
					(throwingClass.getName() + (( enMethName != null && !enMethName.isEmpty())? ("." + enMethName + "()") : "")),
					th.getMessage()),
				String.format(Inz.x("cflib.CFLibDbException.sqlexcept"),
					(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))),
					th.getMessage()),
				th);
	}

	public CFLibDbException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		Object indexKey )
	{
		super( ((indexKey != null)
					? String.format(Inz.s("cflib.CFLibDbException.pkey"),
						(throwingClass.getName() + ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibDbException.default"),
						(throwingClass.getName() + ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )))),
				((indexKey != null)
					? String.format(Inz.x("cflib.CFLibDbException.pkey"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibDbException.default"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))))));
		this.indexKey = indexKey;
	}

	public CFLibDbException(
		Class<?> throwingClass,
		String enMethName,
		String xMethName,
		Object indexKey,
		Throwable th)
	{
		super( ((indexKey != null)
					? String.format(Inz.s("cflib.CFLibDbException.pkey"),
						(throwingClass.getName() + ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibDbException.default"),
						(throwingClass.getName() + ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : "" )))),
				((indexKey != null)
					? String.format(Inz.x("cflib.CFLibDbException.pkey"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))),
						indexKey.toString())
					: String.format(Inz.s("cflib.CFLibDbException.default"),
						(throwingClass.getName() + ((xMethName != null && !xMethName.isEmpty()) ? ("." + xMethName + "()") : ((enMethName != null && !enMethName.isEmpty()) ? ("." + enMethName + "()") : ""))))),
				th);
		this.indexKey = indexKey;
	}

	public Object getIndexKey() {
		return( indexKey );
	}
}
