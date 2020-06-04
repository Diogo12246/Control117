module org.diogo12246 {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.diogo12246 to javafx.fxml;
    exports org.diogo12246;
}