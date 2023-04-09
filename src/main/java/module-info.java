module com.example.javafxretry {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector;


    opens com.example.javafxretry to javafx.fxml;
    exports com.example.javafxretry;
}