module com.example.javaassignment1200521365 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javaassignment1200521365 to javafx.fxml;
    exports com.example.javaassignment1200521365;
}