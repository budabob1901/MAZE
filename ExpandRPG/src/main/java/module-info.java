module com.example.expandrpg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.expandrpg to javafx.fxml;
    exports com.example.expandrpg;
}