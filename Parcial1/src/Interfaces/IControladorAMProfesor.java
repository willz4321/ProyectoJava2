/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author willz
 */
public interface IControladorAMProfesor {
     public static final String TITULO_NUEVO = "Nuevo profesor";
 public static final String TITULO_MODIFICAR = "Modificar profesor";
 public static final String CONFIRMACION = "¿Desea borrar los grupos especificados?";
 /**
 * Acción a ejecutar cuando se selecciona el botón Guardar
 * @param evt evento
 */
 public void btnGuardarClic(ActionEvent evt);
 /**
 * Acción a ejecutar cuando se selecciona el botón Cancelar
 * @param evt evento
 */
 public void btnCancelarClic(ActionEvent evt);
 /**
 * Acción a ejecutar cuando se presiona una tecla en el campo txtApellidos
 * @param evt evento
 */
 public void txtApellidosPresionarTecla(KeyEvent evt);
 /**
 * Acción a ejecutar cuando se presiona una tecla en el campo txtNombres
 * @param evt evento
 */
 public void txtNombresPresionarTecla(KeyEvent evt);
 /**
 * Acción a ejecutar cuando se presiona una tecla en el campo txtDocumento
 * @param evt evento
 */
 public void txtDocumentoPresionarTecla(KeyEvent evt);
 /**
 * Acción a ejecutar cuando se presiona una tecla en el campo passClave
 * @param evt evento
 */
 public void passClavePresionarTecla(KeyEvent evt);
 /**
 * Acción a ejecutar cuando se presiona una tecla en el campo passRepetirClave
 * @param evt evento
 */
 public void passRepetirClavePresionarTecla(KeyEvent evt);

}
