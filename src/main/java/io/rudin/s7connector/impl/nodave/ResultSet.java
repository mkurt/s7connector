/*
 Part of S7Connector, a connector for S7 PLC's
 
 (C) Thomas Rudin (thomas@rudin-informatik.ch) 2012.

 S7Connector is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 3, or (at your option)
 any later version.

 S7Connector is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Visual; see the file COPYING.  If not, write to
 the Free Software Foundation, 675 Mass Ave, Cambridge, MA 02139, USA.  
*/
package io.rudin.s7connector.impl.nodave;

/**
 * @author Thomas Hergenhahn
 * 
 */
public class ResultSet
{
	private int errorState, numResults;
	public Result[] results;

	public void setErrorState(int error)
	{
		errorState = error;
	}

	public int getErrorState()
	{
		return errorState;
	};

	public void setNumResults(int nr)
	{
		numResults = nr;
	}

	public int getNumResults()
	{
		return numResults;
	};
}