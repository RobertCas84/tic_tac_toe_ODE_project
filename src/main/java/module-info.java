module at.fhtw.bic.ode.tic_tac_toe_ode_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens at.fhtw.bic.ode.tic_tac_toe_ode_project to javafx.fxml;
    exports at.fhtw.bic.ode.tic_tac_toe_ode_project;
}