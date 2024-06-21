/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code is Uni-Direction binding the two properties pb and pi.
 *   Project:  propertyMainController
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *	 Build id: 20240307-1437
 ********************************************************************************************/

package application;				//Uni-Directional

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class MainController implements Initializable {
    final MyNumber myNum = new MyNumber();

    @FXML
    private Label lblstatus;

    @FXML
    private ProgressBar pb;

    @FXML
    private ProgressIndicator pi;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myNum.setNumber(0);
        myNum.numberProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable,
					Object oldValue,Object newValue) {
				lblstatus.setText(new BigDecimal(myNum.getNumber()).toString());
				pb.progressProperty().bind(myNum.numberProperty());
				pi.progressProperty().bind(myNum.numberProperty());
				}
			
        } );
    }
		

    @FXML
    public void BtnClick(ActionEvent event) {
        myNum.setNumber(myNum.getNumber() + 0.1);
        }

@FXML
public void Btn2Click(ActionEvent event) {
    myNum.setNumber(myNum.getNumber() - 0.1);
    }
}