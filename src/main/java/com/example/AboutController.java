/*
* File: AboutController.java
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

public class AboutController {

    @FXML
    void onClickGoBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
