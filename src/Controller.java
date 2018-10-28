import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by khwan on 08-Apr-17.
 */
public class Controller {
    Main main = new Main();
    @FXML
    private Label XXX;
    @FXML
    private Label XXX2;
    @FXML
    private TextField name;
    private String a = "kuy";

    //    @FXML private AnchorPane rootPane;
    @FXML
    private void onButtonMouseClicked(ActionEvent event) throws IOException {
        main.student1.setName(name.getText());
        System.out.printf(main.student1.getName());
        Parent root = FXMLLoader.load(getClass().getResource("showData.fxml"));

        Scene scene = new Scene(root);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();


    }

    @FXML
    private void onButtonMouseClicked2(ActionEvent event) throws IOException {
        XXX2.setText(main.student1.getName());
        System.out.println(main.student1.toString());


    }
}


