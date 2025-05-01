module com.example.chord_scalememorizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chord_scalememorizer to javafx.fxml;
    exports com.example.chord_scalememorizer;
}