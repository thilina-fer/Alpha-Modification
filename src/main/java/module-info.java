module lk.ijse.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static lombok;


    opens lk.ijse.finalproject to javafx.fxml;
    exports lk.ijse.finalproject;
}