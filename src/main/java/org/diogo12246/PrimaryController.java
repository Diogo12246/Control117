package org.diogo12246;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import org.diogo12246.appUtils.Delta;

public class PrimaryController implements Initializable {

    private final Delta delta = new Delta();

    @FXML
    private AnchorPane parent;

    @FXML
    private HBox top;

    @FXML
    private Pane content;



    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void min_app(){

    }

    @FXML
    private void close_app() {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
