package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InformacijeEkranController {
    @FXML
    protected void onOdustaniClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProjektGlavna.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        ProjektGlavna.getMainStage().setTitle("Hello!");
        ProjektGlavna.getMainStage().setScene(scene);
        ProjektGlavna.getMainStage().show();
    }

    @FXML
    protected void onKreniClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProjektGlavna.class.getResource("pitanjaEkran.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        ProjektGlavna.getMainStage().setTitle("Hello!");
        ProjektGlavna.getMainStage().setScene(scene);
        ProjektGlavna.getMainStage().show();
    }

}
