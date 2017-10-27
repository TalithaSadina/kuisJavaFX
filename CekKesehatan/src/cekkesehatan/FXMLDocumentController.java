/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import static javafx.scene.input.KeyCode.L;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton Laki;
    @FXML
    private ToggleGroup PilihanK;
    @FXML
    private RadioButton Perempuan;
    @FXML
    private JFXTextField Nama;

    @FXML
    private JFXTextField BB;

    @FXML
    private JFXTextField TB;

    @FXML
    private JFXTextField BerBa;

    @FXML
    private JFXTextArea Hasil;

    @FXML
    private JFXTextArea Saran;

    @FXML
    private Button BtnProses;

    @FXML
    private Button BtnReset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
        String nama = Nama.getText();
        int bb = Integer.parseInt(BB.getText());
        int tb =Integer.parseInt(TB.getText());
        int berat=0;
        int burat=0;
        if(Laki.isSelected()){
            berat =parseInt(TB.getText())-100;
            BerBa.setText(""+berat);  
            if(bb<berat){
           Hasil.setText("Halo "+nama+" anda terlalu kurus");
           Saran.setText("Perbanyak makan");
        }
        else if(bb>berat){
            Hasil.setText("Halo "+nama+" anda terlalu gendut");
           Saran.setText("Diet ya...");
        }
        else {
            Hasil.setText("Halo "+nama+" anda ideal");
           Saran.setText("Pertahankan");
        }
        }
        else{
            burat =parseInt(TB.getText())-110;
            BerBa.setText(""+burat);
            
            if(bb<burat){
             Hasil.setText("Halo "+nama+" anda terlalu kurus");
           Saran.setText("Perbanyak makan");
        }
        else if(bb>burat){
            Hasil.setText("Halo "+nama+" anda terlalu gendut");
           Saran.setText("Diet ya...");
        }
        else{
            Hasil.setText("Halo "+nama+" anda ideal");
           Saran.setText("Pertahankan");
        }    
        }
        
        
        
    }

    @FXML
    private void Reset(ActionEvent event) {
        Nama.setText("");
        TB.setText("");
        BB.setText("");
        Laki.setSelected(false);
        Perempuan.setSelected(false);
        Hasil.setText("");
        BerBa.setText("");
        Saran.setText("");
    }
 
}
