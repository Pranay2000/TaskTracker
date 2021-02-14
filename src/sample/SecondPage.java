package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class SecondPage implements Initializable {

    public SecondPage() {

    }

    @FXML
    private Button btntracking;
    @FXML
    private Button btnView;


    public void UserTrack(ActionEvent event) throws IOException {
        OpenWebcam();
    }
    public void OpenWebcam() throws IOException {
        try {
            Stage stage2 = new Stage();
            Pane myPane1 = null;
            myPane1 = FXMLLoader.load(getClass().getResource("Webcam.fxml"));
            Scene scene2 = new Scene(myPane1);
            stage2.setScene(scene2);
            stage2.show();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void UserView(ActionEvent event) throws IOException {
        // TODO
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}