module ru.sokolova.sokolova_primer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_primer to javafx.fxml;
    exports ru.sokolova.sokolova_primer;
    exports ru.sokolova.sokolova_primer.controller;
    opens ru.sokolova.sokolova_primer.controller to javafx.fxml;
}