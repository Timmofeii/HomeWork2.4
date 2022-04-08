package com.example.messenger;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MessengerController {
    @FXML
    private TextArea messageArea;
    @FXML
    private TextField messageField;


    @FXML
    private void checkButtonClick(ActionEvent actionEvent) {
        final String message = messageField.getText();
        if (message.isEmpty()) {
            return;
        }
       final String text= String.format(message);
        messageArea.appendText(text + "\n");
        messageField.clear();
        messageField.requestFocus();
    }
}