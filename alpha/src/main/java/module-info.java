module com.inventorycontrolsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.inventorycontrolsystem to javafx.fxml;
    exports com.inventorycontrolsystem;
}
