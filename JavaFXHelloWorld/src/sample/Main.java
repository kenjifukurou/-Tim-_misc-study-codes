package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("application initialized");
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);

//        Label greeting = new Label("Welcome to Mars!");
//        Label firstName = new Label("First Name: ");
//        Label lastName = new Label("Last Name: ");
//        Label fullName = firstName + lastName;

//        greeting.setTextFill(Color.DARKTURQUOISE);
//        Font titleFont = Font.font("Times New Roman", FontWeight.BOLD, 35);
////        titleFont.font("Times New Roman", FontWeight.BOLD, 35);
//        greeting.setFont(titleFont);

//        root.getChildren().add(greeting);
//        root.getChildren().add(firstName);
//        root.getChildren().add(lastName);
//        System.out.println(root.getChildren().getClass());

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 375));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("application stopped");
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
