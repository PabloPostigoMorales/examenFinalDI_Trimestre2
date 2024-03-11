package com.example.examenfinaldi_trimestre2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class MetabolismoController {
    @javafx.fxml.FXML
    private RadioButton rbHombre;
    @javafx.fxml.FXML
    private ToggleGroup sexo;
    @javafx.fxml.FXML
    private RadioButton rbMujer;
    @javafx.fxml.FXML
    private TextField lbKilos;
    @javafx.fxml.FXML
    private TextField lbNombre;
    @javafx.fxml.FXML
    private TextField lbEdad;
    @javafx.fxml.FXML
    private TextField lblTalla;
    @javafx.fxml.FXML
    private ChoiceBox cbActividad;
    @javafx.fxml.FXML
    private TextArea lblObser;
    @javafx.fxml.FXML
    private Button btnGuardar;
    @javafx.fxml.FXML
    private Label lbInfo;

    Cliente cliente;
    @javafx.fxml.FXML
    public void guardar(ActionEvent actionEvent) {
        if (lbNombre!=null && lbEdad!=null&&lbKilos!=null&&lblTalla!=null&&cbActividad!=null&&(rbHombre.isPressed() || rbMujer.isPressed())){
            String sexo = "";

            if (rbHombre.isPressed()){
                sexo = "Hombre";
            }else sexo = "Mujer";
            //cliente.metGer(lbEdad,lblTalla,lbKilos,sexo);
        }
        lbInfo.setText("No");
    }
}
