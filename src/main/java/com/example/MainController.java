/*
* File: MainController.java
* Author: Dóra Boglárka
* Copyright: 2026, Dóra Boglárka
* Group: SZ-I-N
* Date: 2026-04-21
* Github: https://github.com/kalae1337/
* Licenc: MIT
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class MainController {

    @FXML
    private TextField heightfield;

    @FXML
    private TextField radius1field;

    @FXML
    private TextField radius2field;

    @FXML
    private TextField volumefield;

    @FXML
    void onClickCountButton(ActionEvent event) {
        this.startCalc();
    }

        @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    void startCalc(){
        DecimalFormat df = new DecimalFormat("#.###");
        
        double radius1 = Double.parseDouble(radius1field.getText());
        double radius2 = Double.parseDouble(radius2field.getText());
        double height = Double.parseDouble(heightfield.getText());

        double volume = (Cone.calcVolume(radius1, radius2, height));
        
        String volumeDF = df.format(volume);

        volumefield.setText(volumeDF);

        String line = makeLine(
            radius1field.getText(),
            radius2field.getText(),
            heightfield.getText(),
            volumefield.getText());

        WriteToFile.write(line);
    }

    String makeLine(String a, String b, String c, String d){
        return a + "; " + b + "; " + c + "; " + d + "\n";
    }

}
