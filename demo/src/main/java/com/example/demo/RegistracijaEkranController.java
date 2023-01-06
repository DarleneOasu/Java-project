package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegistracijaEkranController {
    @FXML
    private TextField unesiIme;
    @FXML
    private TextField unesiPrezime;
    @FXML
    private TextField unesiNadimak;
    @FXML
    private TextField unesiDatumRođenja;
    @FXML
    private TextField unesiSpol;
    @FXML
    private TextField unesiNajvisiStupanjObrazovanja;
    @FXML
    private TextField unesiLozinku;
    @FXML
    private TextField unesiPonovljenuLozinku;


    @FXML
    protected void onOdustaniClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProjektGlavna.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        ProjektGlavna.getMainStage().setTitle("Hello!");
        ProjektGlavna.getMainStage().setScene(scene);
        ProjektGlavna.getMainStage().show();
    }

}
