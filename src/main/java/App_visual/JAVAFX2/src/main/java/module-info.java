module javafx2 {
    requires javafx.controls;
    requires javafx.fxml;
    opens App_visual to javafx.fxml;
    exports App_visual;
}
