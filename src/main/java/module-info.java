module javafx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;
    requires jid3lib;
    requires javafx.web;
    requires javafx.media;

    exports com.javafx to javafx.graphics;
    exports com.javafx.login to javafx.fxml, javafx.graphics;
    opens com.javafx.media to javafx.fxml;
//    opens com.javafx.login to javafx.fxml;
}