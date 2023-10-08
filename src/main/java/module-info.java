module ao.workshop.javafx.jdbc {
    requires javafx.controls;
    requires javafx.fxml;

    opens ao.workshop.javafx.jdbc to javafx.fxml;
    exports ao.workshop.javafx.jdbc;
}
