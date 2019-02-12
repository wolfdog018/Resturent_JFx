package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    Pane hometab, foodtab, delivarytab, contentArea;

    @FXML
    ImageView closetab, minitab;

    @FXML
    void close(MouseEvent event) {
        System.exit(0);

    }

    @FXML
    void mini(MouseEvent event) {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setIconified(true);

    }



    @FXML
    void delivarytab(MouseEvent event) {

    }

    @FXML
    void foodtab(MouseEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("foodtab.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);

    }

    @FXML
    void hometab(MouseEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("hometab.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);


    }
}
