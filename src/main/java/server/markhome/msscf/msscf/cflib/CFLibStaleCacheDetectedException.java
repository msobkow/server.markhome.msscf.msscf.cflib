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

public class CFLibStaleCacheDetectedException extends IllegalStateException {

	protected String localMessage = null;

	public CFLibStaleCacheDetectedException(
		String msg )
	{
		super( msg );
		this.localMessage = msg;
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibStaleCacheDetectedException(
		String fieldName,
		String msg )
	{
		super( fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + " " + ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibStaleCacheDetectedException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName  + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ) );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName  + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibStaleCacheDetectedException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName  + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" ),
				th );
		this.localMessage = fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName  + "() " : " " )
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) ) ? msg : "" );
	}

	public CFLibStaleCacheDetectedException()
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"), ""));
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )));
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " ));
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 ))	? "." + methName + "() " : " " ));
	}

	public CFLibStaleCacheDetectedException(
		String fieldName,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.default"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.default"),
				fieldName + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " " ));

	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String msgCause,
		String targetTable,
		Object argKey )
	{
		super( ((targetTable != null && targetTable.length() > 0) ?
					((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							targetTable,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							targetTable))
					: ((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause))));
		this.localMessage = ((targetTable != null && targetTable.length() > 0) ?
					((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							targetTable,
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							targetTable))
					: ((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause)));
	}

	public CFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String msgCause,
		String targetTable,
		Object argKey,
		Throwable th )
	{
		super( ((targetTable != null && targetTable.length() > 0) ?
					((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							targetTable,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							targetTable))
					: ((argKey != null) ? String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							argKey.toString())
						: String.format(Inz.s("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause))),
				th );
		this.localMessage = ((targetTable != null && targetTable.length() > 0) ?
					((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							targetTable,
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							targetTable))
					: ((argKey != null) ? String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause,
							argKey.toString())
						: String.format(Inz.x("cflib.CFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( methName != null ) && ( methName.length() > 0 )) ? "." + methName + "() " : " "),
							msgCause)));
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
