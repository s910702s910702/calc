/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.javafx.geom.Rectangle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SampleController implements Initializable {
    
    @FXML
    private Label Display;
    private String a = "0";
    private String b = "0";
    private String result;
    private int place = 0;
    private int operator = -1;
    
    public void callDisplay() {
        if(place == 0) Display.setText(a);
        else Display.setText(b);
    }
    
    public void adjust() {
        BigDecimal tmpa = new BigDecimal(a);
        a = tmpa.toString();
        BigDecimal tmpb = new BigDecimal(b);
        b = tmpb.toString();
    }
    
    
    @FXML
    private void buttonMEX_click(ActionEvent event) {
    }
    @FXML
    private void buttonPersent_click(ActionEvent event) {
    }
    @FXML
    private void buttonSquareRoot_click(ActionEvent event) {
    }
    @FXML
    private void buttonArrow_click(ActionEvent event) {
    }
    @FXML
    private void buttonGT_click(ActionEvent event) {
    }
    @FXML
    private void buttonMC_click(ActionEvent event) {
    }
    @FXML
    private void buttonPlusMinus_click(ActionEvent event) {
    }
    @FXML
    private void buttonC_click(ActionEvent event) {
        a = "0";
        b = "0";
        place = 0;
        operator = -1;
        
        callDisplay();
    }
    @FXML
    private void buttonAC_click(ActionEvent event) {
        a = "0";
        b = "0";
        place = 0;
        operator = -1;
        
        callDisplay();
    }
    @FXML
    private void button0_click(ActionEvent event) {
        if(place == 0) a += "0";
        else if(place == 1) b += "0";
        adjust();
        callDisplay();
    }
    @FXML
    private void button1_click(ActionEvent event) {
        if(place == 0) a += "1";
        else if(place == 1) b += "1";
        adjust();
        callDisplay();
    }
    @FXML
    private void button2_click(ActionEvent event) {
        if(place == 0) a += "2";
        else if(place == 1) b += "2";
        adjust();
        callDisplay();
    }
    @FXML
    private void button3_click(ActionEvent event) {
        if(place == 0) a += "3";
        else if(place == 1) b += "3";
        adjust();
        callDisplay();
    }
    @FXML
    private void button4_click(ActionEvent event) {
        if(place == 0) a += "4";
        else if(place == 1) b += "4";
        adjust();
        callDisplay();
    }
    @FXML
    private void button5_click(ActionEvent event) {
        if(place == 0) a += "5";
        else if(place == 1) b += "5";
        adjust();
        callDisplay();
    }
    @FXML
    private void button6_click(ActionEvent event) {
        if(place == 0) a += "6";
        else if(place == 1) b += "6";
        adjust();
        callDisplay();
    }
    @FXML
    private void button7_click(ActionEvent event) {
        if(place == 0) a += "7";
        else if(place == 1) b += "7";
        adjust();
        callDisplay();
    }
    @FXML
    private void button8_click(ActionEvent event) {
        if(place == 0) a += "8";
        else if(place == 1) b += "8";
        adjust();
        callDisplay();
    }
    @FXML
    private void button9_click(ActionEvent event) {
        if(place == 0) a += "9";
        else if(place == 1) b += "9";
        adjust();
        callDisplay();
    }
    @FXML
    private void button00_click(ActionEvent event) {
        if(place == 0) a += "00";
        else if(place == 1) b += "00";
        adjust();
        callDisplay();
    }
    @FXML
    private void buttonMR_click(ActionEvent event) {
    }
    @FXML
    private void buttonMMinus_click(ActionEvent event) {
    }
    @FXML
    private void buttonPoint_click(ActionEvent event) {
    }
    @FXML
    private void buttonMPlus_click(ActionEvent event) {
    }
    @FXML
    private void buttonEqual_click(ActionEvent event) {
        if(place == 0) return ;
        
        System.out.println(a);
        System.out.println(b);
                 
        
        BigDecimal Ba = new BigDecimal(a);
        BigDecimal Bb = new BigDecimal(b);
        System.out.println(Ba);
        System.out.println(Bb);
        
        BigDecimal answer = new BigDecimal("0");

        switch (operator) {
            case 0:
                answer = Ba.add(Bb);
                System.out.println("Ans: " + Ba.add(Bb));
                break;
            case 1:
                answer = Ba.subtract(Bb);
                System.out.println("Ans: " + Ba.subtract(Bb));
                break;
            case 2:
                answer = Ba.multiply(Bb);
                System.out.println("Ans: " + Ba.multiply(Bb));
                break;
            case 3:
                answer = Ba.divide(Bb, 13, RoundingMode.HALF_UP);
                System.out.println("Ans: " + Ba.divide(Bb, 13, RoundingMode.HALF_UP));
                break;
            default:
                break;
        }
        
        result = answer.toString();
        Display.setText(result);
        
        a = "0";
        b = "0";
        place = 0;
        operator = -1;
    }
    @FXML
    private void buttonDivide_click(ActionEvent event) {
        if(place == 0) {
            place = 1;
            operator = 3;
            callDisplay();
        }
    }
    @FXML
    private void buttonMultiply_click(ActionEvent event) {
        if(place == 0) {
            place = 1;
            operator = 2;
            callDisplay();
        }
    }
    @FXML
    private void buttonMinus_click(ActionEvent event) {
        if(place == 0) {
            place = 1;
            operator = 1;
            callDisplay();
        }
            
    }
    @FXML
    private void buttonPlus_click(ActionEvent event) {
        if(place == 0) {
            place = 1;
            operator = 0;
            callDisplay();
        }
            
    }
    @FXML
    private void buttonTAXM_click(ActionEvent event) {
    }
    @FXML
    private void buttonTAXP_click(ActionEvent event) {
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
