module com.example.examenfinaldi_trimestre2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.examenfinaldi_trimestre2 to javafx.fxml;
    exports com.example.examenfinaldi_trimestre2;
}