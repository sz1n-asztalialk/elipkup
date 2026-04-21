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

    void startCalc(){
        
        double radius1 = Double.parseDouble(radius1field.getText());
        double radius2 = Double.parseDouble(radius2field.getText());
        double height = Double.parseDouble(heightfield.getText());

        double volume = Cone.calcVolume(radius1, radius2, height);

        volumefield.setText(String.valueOf(volume));
    }

}
