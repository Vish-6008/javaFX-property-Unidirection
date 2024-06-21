/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose: Encapsulates a numerical value (number) using JavaFX properties.
 *   Project:  MyNumber
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *	 Build id: 20240307-1437
 ********************************************************************************************/

package application;

import javafx.beans.property.*;

public class MyNumber {
	private DoubleProperty number;

	public final double getNumber() {
		if (number != null) {
			return number.get();

		} else {
			return 0;
		}

	}

	public void setNumber(double number) {
		this.numberProperty().set(number);
	}

	public final DoubleProperty numberProperty() {
		if (number == null) {
			number = new SimpleDoubleProperty(0);
		}
		return number;
	}

}
