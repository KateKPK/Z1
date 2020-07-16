package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button rezultButton;

    @FXML
    private Button cleanButton;

    @FXML
    private TextField xField;

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField rezField;

    @FXML
    private Button exitButton;

    @FXML
    void initialize() {
        exitButton.setOnAction(actionEvent -> {
            System.exit(1);
        });
        cleanButton.setOnAction(actionEvent -> {
            xField.clear();
            aField.clear();
            bField.clear();
            rezField.clear();
        });

        rezultButton.setOnAction(actionEvent -> {
            double x=Double.valueOf(xField.getText());
            double a=Double.valueOf(aField.getText());
            double b=Double.valueOf(bField.getText());

            double y=0;
            if (x <= 7) {
                y = (x + 4) / (a*a + b*b);
            } else {
                y= x* (a+b) * (a+b);
            }

            rezField.setText(Double.toString(y));
        });

    }
}