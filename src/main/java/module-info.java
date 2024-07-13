module com.vocab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vocab to javafx.fxml;
    exports com.vocab;
}
