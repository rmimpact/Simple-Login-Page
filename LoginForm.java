import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.PasswordField;

public class LoginForm extends Application {

    @Override
    public void start (Stage primaryStage) {

        //Username Row
        HBox usernameRow = new HBox();
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        usernameRow.getChildren().addAll(usernameLabel, usernameField);

        //Password Row
        HBox passwordRow = new HBox();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        passwordRow.getChildren().addAll(passwordLabel, passwordField);

        //Button Row
        HBox buttonRow = new HBox();
        Button loginButton = new Button("Login");
        buttonRow.getChildren().addAll(loginButton);

        //Status Row
        HBox statusRow = new HBox();
        Label statusLabel = new Label("");
        statusRow.getChildren().addAll(statusLabel);

        //Main Layout
        VBox box = new VBox(10);
        box.getChildren().addAll(usernameRow, passwordRow, buttonRow, statusRow);

        //Button Action
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (username.equals("sam") && password.equals("mypassword")) {
                statusLabel.setText("Password corect!");
            }
            else {statusLabel.setText("Password incorrect!");}
        });

        
        //Scene and Stage
        Scene scene = new Scene(box, 300, 200);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main (String[] args) {
        launch(args);
    }
}



