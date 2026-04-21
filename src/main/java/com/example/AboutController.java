package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {

    @FXML
    void onClickGoBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
