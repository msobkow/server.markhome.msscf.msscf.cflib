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

public class CFLibFireOnInstanceOf {
	
	protected Class<?> instOf = null;

    public CFLibFireOnInstanceOf() {
    	setInstanceOf( Object.class );
    }

    public void setInstanceOf(Class<?> value) {
    	final String S_ProcName = "setInstanceOf";
        if( value == null ) {
            throw new CFLibNullArgumentException( getClass(),
                S_ProcName,
                1,
                "value" );
        }
        instOf = value;
    }

	public Class<?> getInstanceOf() {
        return( instOf );
    }

    public boolean isInstanceOf( ICFLibAnyObj obj ) {
    	if( obj == null ) {
    		return( false );
    	}

    	if( instOf == null ) {
    		return( false );
    	}

    	return( instOf.isInstance( obj ) );
    }

    public void onInstanceOf( ICFLibAnyObj obj ) {
        final String S_ProcName = "onInstanceOf";
        if( obj == null ) {
            return;
        }
        throw new CFLibNotImplementedYetException( getClass(),
        	S_ProcName );
    }

    public final void fireOnInstanceOf( ICFLibAnyObj obj ) {
    	if( obj == null ) {
    		return;
    	}
        if( isInstanceOf( obj ) ) {
            onInstanceOf( obj );
        }
    }
}
