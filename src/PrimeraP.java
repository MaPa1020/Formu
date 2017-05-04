
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class PrimeraP extends javax.swing.JFrame {
ConectionMySQL conn = new ConectionMySQL();
    Connection con = conn.getConnection();
    private int Codigoe = 0;

        public PrimeraP() {
        initComponents();
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JLNombre = new javax.swing.JLabel();
        JLEdad = new javax.swing.JLabel();
        JLCorreo = new javax.swing.JLabel();
        JLPais = new javax.swing.JLabel();
        JLSexo = new javax.swing.JLabel();
        JLTitu = new javax.swing.JLabel();
        JLBuscas = new javax.swing.JLabel();
        JTNombre = new javax.swing.JTextField();
        JCEdad = new javax.swing.JComboBox();
        JCPais = new javax.swing.JComboBox();
        JCSexo = new javax.swing.JComboBox();
        JTCorreo = new javax.swing.JTextField();
        JTBuscas = new javax.swing.JTextField();
        JBSalir = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        JLHobbies = new javax.swing.JLabel();
        JTHobbies = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLNombre.setBackground(new java.awt.Color(102, 102, 255));
        JLNombre.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JLNombre.setText("Nombre");

        JLEdad.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JLEdad.setText("Edad");

        JLCorreo.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JLCorreo.setText("Correo electrónico");

        JLPais.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JLPais.setText("Pais");

        JLSexo.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JLSexo.setText("Sexo");

        JLTitu.setFont(new java.awt.Font("Kristen ITC", 1, 17)); // NOI18N
        JLTitu.setText("REGISTRARSE");

        JLBuscas.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JLBuscas.setText("¿Que buscas?");

        JTNombre.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        JTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTNombreKeyTyped(evt);
            }
        });

        JCEdad.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        JCEdad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        JCEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCEdadActionPerformed(evt);
            }
        });

        JCPais.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        JCPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----------------------------", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bélgica", "Bahamas", "Bangladés", "Baréin", "Barbados", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia-Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", "Congo", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irán", "Irak", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kosovo", "Kuwait", "Líbano", "Laos", "Lesoto", "Letonia", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "México", "Macedonia", "Madagascar", "Malí", "Malasia", "Malaui", "Maldivas", "Malta", "Marruecos", "Mauricio", "Mauritania", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Níger", "Namibia", "Nauru", "Nepal", "Nicaragua", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumania", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Túnez", "Tailandia", "Taiwán", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Vaticano", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue", " " }));

        JCSexo.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        JCSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------------", "Hombre", "Mujer", " " }));

        JTCorreo.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        JTCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTCorreoFocusLost(evt);
            }
        });

        JTBuscas.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N

        JBSalir.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JBGuardar.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JLHobbies.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        JLHobbies.setText("Dime tus hobbies");

        JTHobbies.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(JLTitu)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(JBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(JBSalir)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNombre)
                    .addComponent(JLEdad)
                    .addComponent(JLPais)
                    .addComponent(JLSexo)
                    .addComponent(JLCorreo)
                    .addComponent(JLBuscas)
                    .addComponent(JLHobbies))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNombre)
                    .addComponent(JTCorreo)
                    .addComponent(JTBuscas)
                    .addComponent(JCPais, 0, 280, Short.MAX_VALUE)
                    .addComponent(JTHobbies))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(JLTitu)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNombre)
                    .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEdad)
                    .addComponent(JCEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPais)
                    .addComponent(JCPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLSexo)
                    .addComponent(JCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCorreo)
                    .addComponent(JTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBuscas)
                    .addComponent(JTBuscas, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLHobbies)
                    .addComponent(JTHobbies, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir)
                    .addComponent(JBGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean isEmail(String Correo) {
        Pattern pat = null;
        Matcher mat = null;

        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_\\+])*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(Correo);
        if (mat.find()) {
            return true;
        } else {
            return false;
        }
    }
    String accion = "Ingresar";

    private void JCEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCEdadActionPerformed

    private void JTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTNombreKeyTyped
        char E;
        E= evt.getKeyChar();
        if(!Character.isLetter(E) && E!= KeyEvent.VK_SPACE &&E!= KeyEvent.VK_BACK_SPACE){
        evt.consume();
        getToolkit().beep();
    }
    }//GEN-LAST:event_JTNombreKeyTyped

    private void JTCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTCorreoFocusLost
          if (isEmail(JTCorreo.getText())){
          
      }else{
          JOptionPane.showMessageDialog(null, "CORREO INCORECTO","VALIDAR CORREO",JOptionPane.INFORMATION_MESSAGE);
          JTCorreo.requestFocus();
      }
    }//GEN-LAST:event_JTCorreoFocusLost

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        String correo = JTCorreo.getText();
        if (isEmail(correo)) {

            int Codigo;
            String Nombre, Edad,Pais,Sexo, Correo, Buscar, Hobbies;
            String sSQL = "";
            String mensaje = "";
            Codigo = Codigoe + 1;
            Codigoe = Codigo;
            try {

                Statement comando = conn.getConnection().createStatement();

                comando.executeUpdate("insert into registro (CODIGO,NOMBRE,EDAD,PAIS,SEXO,CORREO,BUSCAR,HOBBIES) values ('" + JTNombre.getText() + "','" + JCEdad.getSelectedItem() + "','" + JCPais.getSelectedItem() + "','" + JCSexo.getSelectedItem()+ "','" + JTCorreo.getText() + "','" + JTBuscas.getText() + "','" +JTHobbies.getText()+ "')");
                JOptionPane.showMessageDialog(null, "SE REGISTRARON LOS DATOS", "", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                setTitle(ex.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR EMAIL INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        JOptionPane.showMessageDialog(null, "GRACIAS POR HACER MI REGISTRO");
        this.dispose();
        Yo y = new Yo();
        y.setVisible(true);
    }//GEN-LAST:event_JBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox JCEdad;
    private javax.swing.JComboBox JCPais;
    private javax.swing.JComboBox JCSexo;
    private javax.swing.JLabel JLBuscas;
    private javax.swing.JLabel JLCorreo;
    private javax.swing.JLabel JLEdad;
    private javax.swing.JLabel JLHobbies;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLPais;
    private javax.swing.JLabel JLSexo;
    private javax.swing.JLabel JLTitu;
    private javax.swing.JTextField JTBuscas;
    private javax.swing.JTextField JTCorreo;
    private javax.swing.JTextField JTHobbies;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
