module com.example.tp_domino_grupo11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp_domino_grupo11 to javafx.fxml;
    exports com.example.tp_domino_grupo11;
}