module com.example.circleenlarger {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.circleenlarger to javafx.fxml;
    exports com.example.circleenlarger;
}