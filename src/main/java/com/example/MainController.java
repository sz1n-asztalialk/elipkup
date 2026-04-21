package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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
        
        double radius1 = Double.parseDouble(radius1field.getText());
        double radius2 = Double.parseDouble(radius2field.getText());
        double height = Double.parseDouble(heightfield.getText());

        double volume = Cone.calcVolume(radius1, radius2, height);

        volumefield.setText(String.valueOf(volume));

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
