/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.sistemadenotasapp.view;

import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import pe.uni.sistemadenotasapp.controller.NotaController;
import pe.uni.sistemadenotasapp.controller.ProfesorController;
import pe.uni.sistemadenotasapp.model.ProfesorModel;
import pe.uni.sistemadenotasapp.util.Mensaje;
import pe.uni.sistemadenotasapp.util.Session;

/**
 *
 * @author maran
 */
public class NotaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form NotaView
     */
    public NotaView() {
        initComponents();
        llenarProfesor();
        listarCuadricula();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdprofesor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidosprofesor = new javax.swing.JTextField();
        txtNombresprofesor = new javax.swing.JTextField();
        txtDniprofesor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmailprofesor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoprofesor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIdcurso = new javax.swing.JTextField();
        txtNombrecurso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIdalumno = new javax.swing.JTextField();
        txtApellidosalumno = new javax.swing.JTextField();
        txtNombresalumno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdnota = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtExamenfinal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("CALIFICACIÓN");
        setEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calificación de alumnos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profesor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Id");

        txtIdprofesor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtIdprofesor.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtIdprofesor.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombres");

        txtApellidosprofesor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtApellidosprofesor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellidosprofesor.setEnabled(false);

        txtNombresprofesor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombresprofesor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombresprofesor.setEnabled(false);

        txtDniprofesor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDniprofesor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDniprofesor.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Email");

        txtEmailprofesor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEmailprofesor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEmailprofesor.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Teléfono");

        txtTelefonoprofesor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTelefonoprofesor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefonoprofesor.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDniprofesor)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidosprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombresprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmailprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefonoprofesor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidosprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombresprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDniprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmailprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de alumnos por curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Curso", "Curso", "Id Alumno", "Apellidos", "Nombres", "Id Nota", "Nota 1", "Nota 2", "Exam.final", "Promedio"
            }
        ));
        tblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLista);
        if (tblLista.getColumnModel().getColumnCount() > 0) {
            tblLista.getColumnModel().getColumn(0).setResizable(false);
            tblLista.getColumnModel().getColumn(1).setResizable(false);
            tblLista.getColumnModel().getColumn(2).setResizable(false);
            tblLista.getColumnModel().getColumn(3).setResizable(false);
            tblLista.getColumnModel().getColumn(4).setResizable(false);
            tblLista.getColumnModel().getColumn(5).setResizable(false);
            tblLista.getColumnModel().getColumn(6).setResizable(false);
            tblLista.getColumnModel().getColumn(7).setResizable(false);
            tblLista.getColumnModel().getColumn(8).setResizable(false);
            tblLista.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALIFICAR ALUMNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Curso");

        txtIdcurso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtIdcurso.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtIdcurso.setEnabled(false);

        txtNombrecurso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombrecurso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombrecurso.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Alumno");

        txtIdalumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtIdalumno.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtIdalumno.setEnabled(false);

        txtApellidosalumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtApellidosalumno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellidosalumno.setEnabled(false);

        txtNombresalumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombresalumno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombresalumno.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("NOTAS");

        txtIdnota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtIdnota.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtIdnota.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Id");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Nota 1");

        txtNota1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Nota 2");

        txtNota2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Examen final");

        txtExamenfinal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Promedio");

        txtPromedio.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtPromedio.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPromedio.setEnabled(false);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnActualizar.setText("ACTUALIZAR NOTAS");
        btnActualizar.setToolTipText("");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCalcular.setText("CALCULAR PROMEDIO");
        btnCalcular.setToolTipText("");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setToolTipText("");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtIdcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtIdalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellidosalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombresalumno))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnActualizar)
                                .addGap(36, 36, 36)
                                .addComponent(btnCalcular)
                                .addGap(30, 30, 30)
                                .addComponent(btnCerrar))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdnota, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExamenfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidosalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombresalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExamenfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCalcular)
                    .addComponent(btnCerrar)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        calcular();
        modificar();
        listarCuadricula();
        limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tblListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMouseClicked
        // TODO add your handling code here:
        int col = tblLista.getSelectedRow();
        txtIdcurso.setText(tblLista.getModel().getValueAt(col, 0).toString());
        txtNombrecurso.setText(tblLista.getModel().getValueAt(col, 1).toString());
        txtIdalumno.setText(tblLista.getModel().getValueAt(col, 2).toString());
        txtApellidosalumno.setText(tblLista.getModel().getValueAt(col, 3).toString());
        txtNombresalumno.setText(tblLista.getModel().getValueAt(col, 4).toString());
        txtIdnota.setText(tblLista.getModel().getValueAt(col, 5).toString());
        txtNota1.setText(tblLista.getModel().getValueAt(col, 6).toString());
        txtNota2.setText(tblLista.getModel().getValueAt(col, 7).toString());
        txtExamenfinal.setText(tblLista.getModel().getValueAt(col, 8).toString());
        txtPromedio.setText(tblLista.getModel().getValueAt(col, 9).toString());
    }//GEN-LAST:event_tblListaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtApellidosalumno;
    private javax.swing.JTextField txtApellidosprofesor;
    private javax.swing.JTextField txtDniprofesor;
    private javax.swing.JTextField txtEmailprofesor;
    private javax.swing.JTextField txtExamenfinal;
    private javax.swing.JTextField txtIdalumno;
    private javax.swing.JTextField txtIdcurso;
    private javax.swing.JTextField txtIdnota;
    private javax.swing.JTextField txtIdprofesor;
    private javax.swing.JTextField txtNombrecurso;
    private javax.swing.JTextField txtNombresalumno;
    private javax.swing.JTextField txtNombresprofesor;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtTelefonoprofesor;
    // End of variables declaration//GEN-END:variables



    private void llenarProfesor(){
        ProfesorModel model = (ProfesorModel) Session.get("PROFESOR");

        txtIdprofesor.setText(model.getIdprofesor());
        txtApellidosprofesor.setText(model.getApellidos());
        txtNombresprofesor.setText(model.getNombres());
        txtDniprofesor.setText(model.getDni());
        txtTelefonoprofesor.setText(model.getTelefono());
        txtEmailprofesor.setText(model.getEmail());
    }
    
    void listarCuadricula() {
        ProfesorModel model = (ProfesorModel) Session.get("PROFESOR");    
        try {
            // Proceso
            NotaController control = new NotaController();
            List<Map<String,?>> lista = control.listaNota(model.getIdprofesor());

            // Listar en cuadricula
            DefaultTableModel tabla;
            tabla = (DefaultTableModel) tblLista.getModel();
            tabla.setRowCount(0);
            for (Map<String, ?> r : lista) {
                Object[] rowData = {
                    r.get("idcurso").toString(),
                    r.get("nombrecurso").toString(),
                    r.get("idalumno").toString(),
                    r.get("apellidos").toString(),
                    r.get("nombres").toString(),
                    r.get("idnota").toString(),
                    r.get("nota1").toString(),
                    r.get("nota2").toString(),
                    r.get("examenfinal").toString(),
                    r.get("promedio").toString(),
                };
                tabla.addRow(rowData);
            }
        } catch (Exception e) {
            Mensaje.error(this, e.getMessage());
        }
    }                                            

    private void modificar() {

        NotaController controller = new NotaController();

        String v1;
        int v2,v3,v4,v5;
        
        v1 = txtIdnota.getText();
        v2 = Integer.parseInt(txtNota1.getText());
        v3 = Integer.parseInt(txtNota2.getText());
        v4 = Integer.parseInt(txtExamenfinal.getText());
        v5 = Integer.parseInt(txtPromedio.getText());
        
        controller.actualizarNota(v1,v2,v3,v4,v5);
    }

    public void calcular() {
        int ds1; 
        double d1,d2,d3,d4;
        
        d1=Integer.parseInt(txtNota1.getText());
        d2=Double.parseDouble(txtNota2.getText());
        d3=Double.parseDouble(txtExamenfinal.getText());
        
        d4 = (d1 + d2 + d3) / 3;
        
        ds1 = (int) Math.round(d4);
        txtPromedio.setText("" + ds1);
    } 

    private void limpiar() {
        txtIdcurso.setText("");
        txtNombrecurso.setText("");
        txtIdalumno.setText("");
        txtApellidosalumno.setText("");
        txtNombresalumno.setText("");
        txtIdnota.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtExamenfinal.setText("");
        txtPromedio.setText("");
    }

}
