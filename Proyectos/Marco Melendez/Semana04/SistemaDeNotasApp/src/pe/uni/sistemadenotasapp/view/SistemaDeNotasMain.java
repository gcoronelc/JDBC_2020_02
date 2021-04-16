package pe.uni.sistemadenotasapp.view;

import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import pe.uni.sistemadenotasapp.model.ProfesorModel;
import pe.uni.sistemadenotasapp.util.Session;


public class SistemaDeNotasMain extends javax.swing.JFrame {

    /** Creates new form EurekaMain */
    public SistemaDeNotasMain() {
        initComponents();
		  crearTitulo();
		  this.setExtendedState(MAXIMIZED_BOTH);
    }
	 
	 private void crearTitulo(){
		 ProfesorModel model = (ProfesorModel) Session.get("PROFESOR");
		 String titulo = "SISTEMA DE NOTAS APP - " + model.getIdprofesor() + ": "  + model.getApellidos() + ", "  + model.getNombres();
		 this.setTitle(titulo);
	 }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        menuMantenimiento = new javax.swing.JMenu();
        menuProfesor = new javax.swing.JMenuItem();
        menuAlumno = new javax.swing.JMenuItem();
        MenuCurso = new javax.swing.JMenuItem();
        MenuCambiaclave = new javax.swing.JMenuItem();
        menuOperaciones = new javax.swing.JMenu();
        menuPonerNotas = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuConsultaNotas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        menuMantenimiento.setText("Mantenimiento");

        menuProfesor.setText("Profesor");
        menuProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProfesorActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuProfesor);

        menuAlumno.setText("Alumno");
        menuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnoActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuAlumno);

        MenuCurso.setText("Curso");
        MenuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCursoActionPerformed(evt);
            }
        });
        menuMantenimiento.add(MenuCurso);

        MenuCambiaclave.setText("Cambio de clave");
        MenuCambiaclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCambiaclaveActionPerformed(evt);
            }
        });
        menuMantenimiento.add(MenuCambiaclave);

        menuBar.add(menuMantenimiento);

        menuOperaciones.setText("Operaciones");

        menuPonerNotas.setText("Calificación");
        menuPonerNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPonerNotasActionPerformed(evt);
            }
        });
        menuOperaciones.add(menuPonerNotas);

        menuBar.add(menuOperaciones);

        menuConsulta.setText("Consulta");

        menuConsultaNotas.setText("Notas");
        menuConsultaNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaNotasActionPerformed(evt);
            }
        });
        menuConsulta.add(menuConsultaNotas);

        menuBar.add(menuConsulta);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

   private void menuProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProfesorActionPerformed
		 try {
			 JInternalFrame view = new ProfesorView();
			 desktopPane.add(view);
			 view.setVisible(true);
			 view.setMaximum(true);
		 } catch (PropertyVetoException ex) {
		 }
   }//GEN-LAST:event_menuProfesorActionPerformed

   private void menuConsultaNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaNotasActionPerformed
    
   }//GEN-LAST:event_menuConsultaNotasActionPerformed

    private void menuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnoActionPerformed
        // TODO add your handling code here:
        try {
			 JInternalFrame view = new AlumnoView();
			 desktopPane.add(view);
			 view.setVisible(true);
			 view.setMaximum(true);
		 } catch (PropertyVetoException ex) {
		 }
    }//GEN-LAST:event_menuAlumnoActionPerformed

    private void MenuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCursoActionPerformed
        // TODO add your handling code here:
        try {
			 JInternalFrame view = new CursoView();
			 desktopPane.add(view);
			 view.setVisible(true);
			 view.setMaximum(true);
		 } catch (PropertyVetoException ex) {
		 }
    }//GEN-LAST:event_MenuCursoActionPerformed

    private void menuPonerNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPonerNotasActionPerformed
		 try {
			 JInternalFrame view = new NotaView();
			 desktopPane.add(view);
			 view.setVisible(true);
			 view.setMaximum(true);
		 } catch (PropertyVetoException ex) {
		 }  
    }//GEN-LAST:event_menuPonerNotasActionPerformed

    private void MenuCambiaclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCambiaclaveActionPerformed
        // TODO add your handling code here:
         try {
			 JInternalFrame view = new CambiaClaveView();
			 desktopPane.add(view);
			 view.setVisible(true);
			 view.setMaximum(true);
		 } catch (PropertyVetoException ex) {
		 }
    }//GEN-LAST:event_MenuCambiaclaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaDeNotasMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaDeNotasMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaDeNotasMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaDeNotasMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaDeNotasMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCambiaclave;
    private javax.swing.JMenuItem MenuCurso;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem menuAlumno;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenuItem menuConsultaNotas;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenu menuOperaciones;
    private javax.swing.JMenuItem menuPonerNotas;
    private javax.swing.JMenuItem menuProfesor;
    // End of variables declaration//GEN-END:variables

}