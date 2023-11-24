module com.beadando.javaeabeadando {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.beadando.javaeabeadando to javafx.fxml;
    exports com.beadando.javaeabeadando;
}