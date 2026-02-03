import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UppercaseConverter extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create input field
        TextField inputField = new TextField();
        inputField.setPromptText("Enter text here");

        // Create output label
        Label outputLabel = new Label("Uppercase will appear here");
        outputLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: blue;");

        // Create button
        Button convertButton = new Button("Convert to UPPERCASE");
        convertButton.setStyle("-fx-font-weight: bold; -fx-padding: 10;");

        // Button click handler
        convertButton.setOnAction(e -> {
            String inputText = inputField.getText();
            String uppercaseText = inputText.toUpperCase();
            outputLabel.setText(uppercaseText);
        });

        // Create layout
        VBox root = new VBox(15);
        root.getChildren().addAll(
                new Label("Enter Text:"),
                inputField,
                convertButton,
                new Label("Uppercase Result:"),
                outputLabel);

        // Set scene and show stage
        Scene scene = new Scene(root, 400, 250);
        primaryStage.setTitle("Uppercase Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}