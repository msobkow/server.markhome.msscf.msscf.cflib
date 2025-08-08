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

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *	The performance of exception handling in a high-volume Java system cannot
 *	be underestimated.  Anything you can do to speed up exception
 *	instantiation and initialization will dramatically improve the
 *	performance of the system under real life workloads, where users
 *	do input bad data.
 *	<p>
 *	The exception factory model eliminates the resolution of NLS translations
 *	of key system implementation error conditions using a plug-in/registry
 *	model instead of tolerating the resource load overhead of the default
 *	Java NLS string resource approach.
 */
public class CFLib {
	public final static String LinkName = "CFLib";
	public final static String LinkVersion = "2.13.11195";

	public final static TimeZone UTC_TIMEZONE = TimeZone.getTimeZone( "+0000" );

	/**
     * Plays an alert sound using the 'alert.wav' resource file.
     * <p>
     * This method attempts to load and play a WAV audio file from the classpath.
     * If the resource is not found or an error occurs, the method fails silently.
     */
	public static void beep() {
		Clip clip = null;
		// The audio is courtesy of a whole whack of articles from stackoverflow.com, each of which got me one line closer to working
		try {
			InputStream resource = CFLib.class.getResourceAsStream("/server.markhome.msscf.msscf.cflib/sounds/alert.wav");
			if( resource != null ) {
				AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( new BufferedInputStream( resource ) );
				DataLine.Info info = new DataLine.Info( Clip.class, audioInputStream.getFormat() );
				clip = (Clip)AudioSystem.getLine( info );
				clip.open( audioInputStream );
				clip.start();
				clip.drain();
			}
		} catch (LineUnavailableException e) {
		} catch (UnsupportedAudioFileException e) {
		} catch (IOException e) {
		} catch (NullPointerException e) {
		} catch (IllegalArgumentException e) {
		}
	}

    /**
     * Creates a GregorianCalendar instance in UTC time zone with the specified date and time.
     *
     * @param year   the year
     * @param month  the month (0-based, January is 0)
     * @param day    the day of month
     * @param hour   the hour of day
     * @param minute the minute
     * @param second the second
     * @return a Calendar object set to the specified UTC date and time
     */
	public static Calendar getUTCGregorianCalendar(
		int year,
		int month,
		int day,
		int hour,
		int minute,
		int second )
	{
		Calendar cal = new GregorianCalendar( UTC_TIMEZONE );
		cal.clear();
		cal.set( year, month, day, hour, minute, second );
        cal.getTimeInMillis(); // Force calendar resync based on input values
		return( cal );
	}

	/**
     * Returns the link name of the library.
     *
     * @return the link name string
     */
	public String getLinkName() {
		return( LinkName );
	}
	
    /**
     * Returns the link version of the library.
     *
     * @return the link version string
     */
	public String getLinkVersion() {
		return( LinkVersion );
	}
}
