package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class GlavniEkranController {
    @FXML
    protected void onPrijaviSeClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProjektGlavna.class.getResource("informacijeEkran.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        ProjektGlavna.getMainStage().setTitle("Hello!");
        ProjektGlavna.getMainStage().setScene(scene);
        ProjektGlavna.getMainStage().show();
    }
    @FXML
    protected void onRegistrirajSeClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProjektGlavna.class.getResource("registracijaEkran.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        ProjektGlavna.getMainStage().setTitle("Hello!");
        ProjektGlavna.getMainStage().setScene(scene);
        ProjektGlavna.getMainStage().show();
    }
}