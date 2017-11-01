package com.vendas.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author aluno
 */
public class PaineldeControleController implements Initializable {

   @FXML
    private Button btninsfunc;

    @FXML
    private Button btniseprod;

    @FXML
    void InsereFuncionario(ActionEvent event) throws IOException {
       
    Parent root = FXMLLoader.load(getClass().getResource("InsereFuncionario.fxml"));
    
    PainelControle painelControle = new PainelControle();
    
    InsereFuncionario insereFuncionario = new InsereFuncionario();
    
    }

    @FXML
    void InsereProduto(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
