module com.example.fechacaixa {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires java.desktop;

    opens com.example.fechacaixa to javafx.fxml;
    exports com.example.fechacaixa;
}