/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.controladores;
import autores.vistas.VentanaAMProfesor;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import autores.modelos.GestorAutores;
import Interfaces.IControladorAMProfesor;
import Interfaces.IControladorAutores;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.vistas.ModeloComboCargo;
import autores.vistas.VentanaAutores;
/**
 *
 * @author willz
 */
public class ControladorAMProfesor implements IControladorAMProfesor{

    private VentanaAMProfesor ventanaP;
    private VentanaAutores ventana;
    private Autor autorAux;
    ControladorAMAutores camautores;
    private boolean crear;
  
   
   


    public ControladorAMProfesor() {
        this.ventanaP = new VentanaAMProfesor(this,null,true);
        this.ventanaP.setLocationRelativeTo(null);
        JComboBox comboCargo = new JComboBox();
        comboCargo.setModel(new ModeloComboCargo());
        this.ventanaP.getComboBox_Cargo().setModel(new ModeloComboCargo());
        this.ventanaP.setLocationRelativeTo(null);
        this.ventanaP.setVisible(true);
    }
    public ControladorAMProfesor(String title, boolean dniEnabled, boolean crear, Autor autor){
        this.crear = crear;
        this.ventanaP = new VentanaAMProfesor(this,null,true);
        JComboBox comboCargo = new JComboBox();
        comboCargo.setModel(new ModeloComboCargo());
        this.ventanaP.getComboBox_Cargo().setModel(new ModeloComboCargo());
        this.ventanaP.setTitle(title);
        this.ventanaP.dniEnabled(dniEnabled);
        this.ventanaP.setDni(String.valueOf(autor.getDNI()));
        this.ventanaP.setApellidos(autor.getApellidos());
        this.ventanaP.setNombres(autor.getNombres());
        this.autorAux = autor;
        this.ventanaP.setLocationRelativeTo(null);
        this.ventanaP.setVisible(true);
    }
    @Override
    public void btnGuardarClic(ActionEvent evt){
     
        int dni=Integer.parseInt(this.ventanaP.getTxt_Documento().getText());
        String apellido=this.ventanaP.getTxt_Apellido().getText();
        String nombre=this.ventanaP.getTxt_Nombre().getText();
        String clave=this.ventanaP.getTxt_Clave().getText();
        String claveRepetida=this.ventanaP.getTxt_Repetir_Clave().getText();
        Cargo cargo=((ModeloComboCargo)this.ventanaP.getComboBox_Cargo().getModel()).obtenerCargo();
        if(this.ventanaP.getTxt_Documento().isEnabled()){
        GestorAutores gp= GestorAutores.crear();
        System.out.println(gp.nuevoAutor(dni, apellido, nombre, cargo, clave, claveRepetida));
        }
        else{
        GestorAutores gp= GestorAutores.crear();
        System.out.println(gp.modificarAutor(autorAux, apellido, nombre, cargo, clave, claveRepetida));
        }
    }
    
    
    @Override
    public void btnCancelarClic(ActionEvent evt) {
       IControladorAutores cp=new ControladorAMAutores();
    }
    @Override
    public void txtApellidosPresionarTecla(KeyEvent evt) {
         char c= evt.getKeyChar();
         if(!Character.isAlphabetic(c)&&!Character.isWhitespace(c))
         evt.consume();        
    }
    @Override
    public void txtNombresPresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isAlphabetic(c) && !Character.isWhitespace(c))
         evt.consume();
    }
    @Override
    public void txtDocumentoPresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c))
         evt.consume();
    }
    @Override
    public void passClavePresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c)&&!Character.isAlphabetic(c))
         evt.consume();
    }
    @Override
    public void passRepetirClavePresionarTecla(KeyEvent evt) {
        char c= evt.getKeyChar();
        if(!Character.isDigit(c)&&!Character.isAlphabetic(c))
         evt.consume();
    }
   
}