package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import  javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public LoginController() {

    }

    @FXML
    private Button btnlogin;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField Usernametxt;
    @FXML
    private PasswordField enterpassword;


    public void UserLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {

        if (Usernametxt.getText().toString().equals("Tracker01") && enterpassword.getText().toString().equals("Tracker@123")) {
            wrongLogin.setText("Success!!");
            Stage stage = new Stage();
            Pane myPane = null;
            myPane = FXMLLoader.load(getClass().getResource("AfterLogin.fxml"));
            Scene scene = new Scene(myPane);
            stage.setScene(scene);
            stage.show();
        } else if (Usernametxt.getText().isEmpty() && enterpassword.getText().isEmpty()) {
            wrongLogin.setText("Please enter your details.");
        }
        else
            {
            wrongLogin.setText("Wrong Username or password!");
            }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}

