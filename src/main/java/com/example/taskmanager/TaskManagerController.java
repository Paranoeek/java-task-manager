package com.example.taskmanager;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TaskManagerController {
    @FXML private ListView<String> taskList;
    @FXML private TextField input;

    @FXML
    public void addTask() {
        String text = input.getText();
        if (!text.isEmpty()) {
            taskList.getItems().add(text);
            input.clear();
        }
    }
}
