module javafx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports com.javafx to javafx.graphics;
}