package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;



public class PitanjaEkranController {
    public static Integer counter = 0;

    @FXML
    protected void onDaljeClick() throws IOException {
        if (counter < 5) {
            counter = counter+1;
            FXMLLoader fxmlLoader = new FXMLLoader(ProjektGlavna.class.getResource("pitanjaEkran.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            ProjektGlavna.getMainStage().setTitle("Pitanja");
            ProjektGlavna.getMainStage().setScene(scene);
            ProjektGlavna.getMainStage().show();
;
        }
        else{
            FXMLLoader fxmlLoader = new FXMLLoader(ProjektGlavna.class.getResource("rezultatEkran.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            ProjektGlavna.getMainStage().setTitle("Rezultat");
            ProjektGlavna.getMainStage().setScene(scene);
            ProjektGlavna.getMainStage().show();

        }
    }
}
