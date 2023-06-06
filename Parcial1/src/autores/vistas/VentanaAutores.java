/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.vistas;

import Interfaces.IControladorAutores;
import autores.controladores.ControladorAMAutores;
import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.ModeloTablaAlumnos;
import autores.modelos.ModeloTablaProfesores;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/**
 *
 * @author usuario
 */
public class VentanaAutores extends javax.swing.JDialog {

    ControladorAMAutores ca;
    private VentanaAutores ventana;
    private ModeloTablaAlumnos modeloT_alumno;
   
            
    public VentanaAutores(ControladorAMAutores control,java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.ca=control;
    }

  

    public JTable getTablaAlumnos() {
        return tablaAlumnos;
    }

    public void setTablaAlumnos(JTable tablaAlumnos) {
        this.tablaAlumnos = tablaAlumnos;
    }

    public JTable getTablaProfesores() {
        return tablaProfesores;
    }

    public void setTablaProfesores(JTable tablaProfesores) {
        this.tablaProfesores = tablaProfesores;
    }

    public JTextField getTxtApellidosAlumnos() {
        return txtApellidosAlumnos;
    }

    public JTextField getTxtApellidosProfesor() {
        return txtApellidosProfesor;
    }

   

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApellidosProfesor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnModificarProfesores = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtApellidosAlumnos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnModificarAlumnos = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Profesores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setToolTipText("");

        jLabel1.setText("Apellidos");

        txtApellidosProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosProfesorKeyTyped(evt);
            }
        });

        tablaProfesores.setAutoCreateRowSorter(true);
        tablaProfesores.setBackground(new java.awt.Color(204, 204, 204));
        tablaProfesores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153))));
        tablaProfesores.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        tablaProfesores.setForeground(new java.awt.Color(204, 51, 0));
        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Apellidos", "Nombres", "Cargo"
            }
        ));
        tablaProfesores.setSelectionBackground(new java.awt.Color(0, 204, 0));
        jScrollPane1.setViewportView(tablaProfesores);
        tablaProfesores.getAccessibleContext().setAccessibleDescription("");
        tablaProfesores.getAccessibleContext().setAccessibleParent(tablaProfesores);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProfesores(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProfesor(evt);
            }
        });

        btnModificarProfesores.setBackground(new java.awt.Color(0, 204, 204));
        btnModificarProfesores.setText("Modificar");
        btnModificarProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProfesores(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setText("Borrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProfesor(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarProfesores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.setToolTipText("");

        jLabel2.setText("Apellidos");

        txtApellidosAlumnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosAlumnosKeyTyped(evt);
            }
        });

        tablaAlumnos.setAutoCreateRowSorter(true);
        tablaAlumnos.setBackground(new java.awt.Color(204, 204, 204));
        tablaAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153))));
        tablaAlumnos.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        tablaAlumnos.setForeground(new java.awt.Color(255, 51, 51));
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellidos", "Nombres", "CX"
            }
        ));
        jScrollPane2.setViewportView(tablaAlumnos);
        tablaAlumnos.getAccessibleContext().setAccessibleParent(tablaAlumnos);

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaAlumnos(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setText("Nuevo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAlumno(evt);
            }
        });

        btnModificarAlumnos.setBackground(new java.awt.Color(0, 204, 204));
        btnModificarAlumnos.setText("Modificar");
        btnModificarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlumnoClic(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 204));
        jButton8.setText("Borrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlumno(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 0, 51));
        jButton9.setText("Volver");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidosAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtApellidosAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoProfesor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProfesor
       
        this.dispose();
        this.ca.btnNuevoProfesorClic(evt);
       
    }//GEN-LAST:event_btnNuevoProfesor

    private void btnBuscarProfesores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProfesores
       this.ca.btnBuscarProfesorClic(evt);
    }//GEN-LAST:event_btnBuscarProfesores

    private void btnBorrarProfesor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProfesor
        this.ca.btnBorrarProfesorClic(evt);
    }//GEN-LAST:event_btnBorrarProfesor

    private void txtApellidosProfesorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosProfesorKeyTyped
    this.ca.txtApellidosProfesorPresionarTecla(evt);
    }//GEN-LAST:event_txtApellidosProfesorKeyTyped

    private void btnModificarProfesores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProfesores
        
        this.ca.btnModificarProfesorClic(evt);
      
    }//GEN-LAST:event_btnModificarProfesores

    private void btnVolver(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver
        this.dispose();
        ca.btnVolverClic(evt);
    }//GEN-LAST:event_btnVolver

    private void btnBorrarAlumno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlumno
        this.ca.btnBorrarAlumnoClic(evt);
    }//GEN-LAST:event_btnBorrarAlumno

    private void btnModificarAlumnoClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlumnoClic
        this.ca.btnModificarAlumnoClic(evt);
    }//GEN-LAST:event_btnModificarAlumnoClic

    private void btnNuevoAlumno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAlumno

        this.dispose();
        this.ca.btnNuevoAlumnoClic(evt);

    }//GEN-LAST:event_btnNuevoAlumno

    private void btnBuscaAlumnos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaAlumnos
        this.ca.btnBuscarAlumnoClic(evt);
    }//GEN-LAST:event_btnBuscaAlumnos

    private void txtApellidosAlumnosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosAlumnosKeyTyped
        this.ca.txtApellidosAlumnoPresionarTecla(evt);
    }//GEN-LAST:event_txtApellidosAlumnosKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
    }
    public Autor verProfesor() {
       ModeloTablaProfesores mtp = (ModeloTablaProfesores)this.tablaProfesores.getModel();
       return mtp.verProfesor(this.tablaProfesores.getSelectedRow());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarAlumnos;
    private javax.swing.JButton btnModificarProfesores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTable tablaProfesores;
    private javax.swing.JTextField txtApellidosAlumnos;
    private javax.swing.JTextField txtApellidosProfesor;
    // End of variables declaration//GEN-END:variables
}
