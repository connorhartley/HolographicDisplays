/*
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package com.gmail.filoghost.holographicdisplays.util.reflection;

public class ReflectionUtils {

	/**
	 * If you only need one stack trace element this is faster than Throwable.getStackTrace()[element],
	 * it doesn't generate the full stack trace (except as fallback).
	 */
	public static StackTraceElement getStackTraceElement(final int index) {
		// Patched out: taking stack traces every time you call getId() is extremely expensive with lots of holograms.
		return null;
	}
}
