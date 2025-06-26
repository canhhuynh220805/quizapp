module com.htc.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.htc.demo to javafx.fxml;
    exports com.htc.demo;
}
