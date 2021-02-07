open module javafx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports com.javafx to javafx.graphics;
    exports com.javafx.login to javafx.fxml, javafx.graphics;
//    opens com.javafx.login to javafx.fxml;
}