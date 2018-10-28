import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.HashMap;


/**
 * Created by khwan on 08-Apr-17.
 */
public class Main extends Application {
    public static String kuy = "...";
    Student student1 = new Student(2);
    Student student2 = new Student(2);


        public static   1void main (String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("try.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        ScreenController screenController = new ScreenController(scene);
        primaryStage.show();
    }

    public String getKuy() {
        return kuy;
    }

    public void setKuy(String kuy) {
        this.kuy = kuy;
    }
}

