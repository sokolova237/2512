module ru.sokolova.sokolova_7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_7 to javafx.fxml;
    exports ru.sokolova.sokolova_7;
    exports ru.sokolova.sokolova_7.controller;
    opens ru.sokolova.sokolova_7.controller to javafx.fxml;
}