

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Checkbox;
/**
 *
 * @author jorge.l
 */
public class alumnos extends javax.swing.JFrame {
        Connection con=null;
        Statement stmt=null;
        String var,var2,var3;
        boolean bandera =true;
       //jCheck_exposicion.setSelected(false);
      
    /**
     * Creates new form alumnos
     */
    public alumnos() {
        initComponents();
        this.setTitle("Registro Alumnos");
        this.setLocation(400,200);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_cel = new javax.swing.JTextField();
        txt_carrera = new javax.swing.JTextField();
        txt_generacion = new javax.swing.JTextField();
        txt_tem_tesi = new javax.swing.JTextField();
        txt_dir_tesi = new javax.swing.JTextField();
        txt_trabajo = new javax.swing.JTextField();
        txt_lugar_t = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_hora_t = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apPaterno = new javax.swing.JTextField();
        txt_apMaterno = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JButton();
        jCheck_exposicion = new javax.swing.JCheckBox();
        jCheck_cartaCompromiso = new javax.swing.JCheckBox();
        btn_consulta = new javax.swing.JButton();
        btn_elimina = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("lugar :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 50, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("apellido paterno :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("apellido materno :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("correo electronico :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("telefono celular :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("carrera :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("generacion :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 10, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel10.setText("director  de tesis :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel11.setText("trabajo actual :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 100, 30));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 120, -1));

        txt_cel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 90, -1));

        txt_carrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_carreraKeyTyped(evt);
            }
        });
        getContentPane().add(txt_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 90, -1));

        txt_generacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_generacionKeyTyped(evt);
            }
        });
        getContentPane().add(txt_generacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 90, -1));
        getContentPane().add(txt_tem_tesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 90, -1));

        txt_dir_tesi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dir_tesiKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dir_tesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, -1));

        txt_trabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_trabajoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 210, -1));
        getContentPane().add(txt_lugar_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 150, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel13.setText("tema tesis :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 80, 30));
        getContentPane().add(txt_hora_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 120, 30));

        btn_aceptar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_aceptar.setText("aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UACM.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 190, 90));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel15.setText("horario:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 60, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel16.setText("campo obligatorio *");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel17.setText("*");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 10, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel18.setText("*");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 10, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setText("*");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 10, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel20.setText("*");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 10, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel21.setText("*");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 10, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel22.setText("*");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 10, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel23.setText("*");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 10, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel24.setText("*");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 10, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel25.setText("*");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 10, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel26.setText("campo opcional");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, 20));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 120, -1));

        txt_apPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apPaternoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, 30));

        txt_apMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apMaternoActionPerformed(evt);
            }
        });
        txt_apMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apMaternoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 120, -1));

        btn_regresar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btn_regresar.setText("regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 90, 30));

        jCheck_exposicion.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jCheck_exposicion.setText("exposicion de motivos");
        getContentPane().add(jCheck_exposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jCheck_cartaCompromiso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jCheck_cartaCompromiso.setText("carta compromiso");
        getContentPane().add(jCheck_cartaCompromiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 160, -1));

        btn_consulta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btn_consulta.setText("consulta");
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 100, 30));

        btn_elimina.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btn_elimina.setText("elimina");
        btn_elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_elimina, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 90, 30));

        txt_id.setEditable(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 30, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel12.setText("id:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 30, 20));

        btn_actualizar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btn_actualizar.setText("modifica");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txt_apMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apMaternoActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c =evt.getKeyChar();//condicion para la entrada de solo caracteres
       if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
           evt.consume();
       }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apPaternoKeyTyped
        char c =evt.getKeyChar();//condicion para la entrada de solo caracteres
       if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
           evt.consume();
       }
    }//GEN-LAST:event_txt_apPaternoKeyTyped

    private void txt_apMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apMaternoKeyTyped
       char c =evt.getKeyChar();//condicion para la entrada de solo caracteres
       if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
           evt.consume();
       }
    }//GEN-LAST:event_txt_apMaternoKeyTyped

    private void txt_celKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celKeyTyped
        char c =evt.getKeyChar();
      if(c<'0'||c>'9'){
          evt.consume();
      }
      
    }//GEN-LAST:event_txt_celKeyTyped

    private void txt_carreraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_carreraKeyTyped
        char c =evt.getKeyChar();//condicion para la entrada de solo caracteres
       if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
           evt.consume();
       }
    }//GEN-LAST:event_txt_carreraKeyTyped

    private void txt_generacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_generacionKeyTyped
          char c =evt.getKeyChar();
      if(c<'0'||c>'9'){
          evt.consume();
      }
    }//GEN-LAST:event_txt_generacionKeyTyped

    private void txt_dir_tesiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dir_tesiKeyTyped
         char c =evt.getKeyChar();//condicion para la entrada de solo caracteres
       if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
           evt.consume();
       }
    }//GEN-LAST:event_txt_dir_tesiKeyTyped

    private void txt_trabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_trabajoKeyTyped
         char c =evt.getKeyChar();//condicion para la entrada de solo caracteres
       if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
           evt.consume();
       }
    }//GEN-LAST:event_txt_trabajoKeyTyped

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
       String cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8,cadena9,cadena10,cadena11,cadena12,cadena13,cadena14;
      int exp_motivos=0,carta_com=0;  
      // obtener texto de los campos  de texfield
      //boolean resultado=jCheck_exposicion
        
        cadena2 = txt_nombre.getText();
        cadena3 = txt_apPaterno.getText();
        cadena4 = txt_apMaterno.getText();
        cadena5 = txt_email.getText();
        cadena6 = txt_cel.getText();
        cadena7 = txt_carrera.getText();
        cadena8 = txt_generacion.getText();
        cadena9 = txt_tem_tesi.getText();
        cadena10 = txt_dir_tesi.getText();
        cadena11 = txt_trabajo.getText();
        cadena12 = txt_lugar_t.getText();
        cadena13 = txt_hora_t.getText();
        if(jCheck_exposicion.isSelected()){
            exp_motivos=1;
        }else
            exp_motivos=0;
        if(jCheck_cartaCompromiso.isSelected()){
            carta_com=1;
        }else
            carta_com=0;
        
                      //revisar que los campos no esten vacios 
          
                    if (txt_nombre.getText().equals("") || (txt_apPaterno.getText().equals(""))
                    || (txt_apMaterno.getText().equals("")) || (txt_email.getText().equals(""))
                    || (txt_cel.getText().equals("")) || (txt_carrera.getText().equals(""))
                    || (txt_tem_tesi.getText().equals(""))|| (txt_dir_tesi.getText().equals(""))
                    || (txt_trabajo.getText().equals(""))
                    ||(txt_generacion.getText().equals(""))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","¡AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
            bandera=false;
        }
        
    
                    
        else {
        
            try {
           //enlase a base de datos  en mysql
           //agregar libreria clik derecho addJAR/folder
           //se agrega  mysql-conector-java-bin.jar
            String url = "jdbc:mysql://localhost:3306/Sat";
            String usuario = "root";
            String contraseña = "itachi";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  stmt.executeUpdate("INSERT INTO alumnos VALUES('" + 0 + "','"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena5+"','"+cadena6+"','"+cadena7+"',"
                          + "'"+cadena8+"','"+cadena9+"','"+cadena10+"','"+cadena11+"','"+cadena12+"','"+cadena13+"','"+exp_motivos+"','"+carta_com+"')");
                  System.out.println("Los valores han sido agregados a la base de datos ");
                 
                   //exeption
        } catch (InstantiationException ex) {
           Logger.getLogger(alumnos.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(alumnos.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(alumnos.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(alumnos.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
         bandera=true;
      }
                       
        //inicializa datos despues de registrar            
        
        if(bandera==true){
        this.txt_nombre.setText("");
        this.txt_apPaterno.setText("");
        this.txt_apMaterno.setText("");
        this.txt_email.setText("");
        this.txt_cel.setText("");
        this.txt_carrera.setText("");
        this.txt_generacion.setText("");
        this.txt_tem_tesi.setText("");
        this.txt_dir_tesi.setText("");
        this.txt_trabajo.setText("");
        this.txt_lugar_t.setText("");
        this.txt_hora_t.setText("");
        this.jCheck_exposicion.setSelected(false);
        this.jCheck_cartaCompromiso.setSelected(false);
        
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
          this.dispose();//oculta
        logueo p= new logueo();//instancia de la clase usuario
        p.setVisible(true);//lo hace visible
                                   
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
       ResultSet rs = null; 
         var = javax.swing.JOptionPane.showInputDialog(this,"nombre de el alumno","Consulta alumnos",javax.swing.JOptionPane.QUESTION_MESSAGE);
        String sql="SELECT* FROM  alumnos WHERE nombre = '"+var+"'";
        if(var == null)  
        javax.swing.JOptionPane.showMessageDialog(this,"La accion fue cancelada","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
      else {   
        if (var.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this,"Favor de ingresar el id del alumno","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/Sat";
            String usuario = "root";
            String contraseña = "itachi";  
            
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               if (con!= null)
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
               
               stmt = con.createStatement();
                rs = stmt.executeQuery(sql);//variable que guarda info de la base de datos
              
            
               while(rs.next()) {  
                   
                String id = rs.getString("id");
                String nom = rs.getString("nombre");
                String pat = rs.getString("apPaterno");
                String mat = rs.getString("apMaterno");
                String ema = rs.getString("email");
                String cel = rs.getString("cel");
                String carr = rs.getString("carrera");
                String gen = rs.getString("generacion");
                String ttes = rs.getString("tem tesi");
                String dtes = rs.getString("dir tesi");
                String tra = rs.getString("trabajo");
                String exmot =rs.getString("exposicion de motivos");
                int motivo = Integer.parseInt (exmot);
                String cartcom=rs.getString("carta compromiso");
                int carta = Integer.parseInt (cartcom);
                 
                   txt_id.setText(id);                            
                   txt_nombre.setText(nom);
                   txt_apPaterno.setText(pat);
                   txt_apMaterno.setText(mat);
                   txt_email.setText(ema);
                   txt_cel.setText(cel);
                   txt_carrera.setText(carr);
                   txt_generacion.setText(gen);
                   txt_tem_tesi.setText(ttes);
                   txt_dir_tesi.setText(dtes);
                   txt_trabajo.setText(tra);
                   if(motivo==1){
                   jCheck_exposicion.setSelected(true);
                   }else{
                   jCheck_exposicion.setSelected(false);
                   }   
                   
                   if(carta==1){
                   jCheck_cartaCompromiso.setSelected(true);
                   }else{
                   jCheck_cartaCompromiso.setSelected(false);
                   } 
               }
               
               
        }
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }

    }
        
        }
    }//GEN-LAST:event_btn_consultaActionPerformed

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed

     ResultSet rs = null; 
     var3 = javax.swing.JOptionPane.showInputDialog(this,"id a aliminar","elimina alumno",javax.swing.JOptionPane.QUESTION_MESSAGE);
       String sql="DELETE FROM alumnos where id ='"+var3+"'";
       // DELETE FROM alumnos where id =0;
        if(var3 == null)  
        javax.swing.JOptionPane.showMessageDialog(this,"La accion fue cancelada","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
      else {   
        if (var3.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this,"Favor de ingresar el id a eliminar ","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/Sat";
            String usuario = "root";
            String contraseña = "itachi";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  stmt.executeUpdate("DELETE FROM alumnos where id ='"+var3+"'");
            
            
               javax.swing.JOptionPane.showMessageDialog(this,"alumno eliminado","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
               
               
        }
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }

    }
        
        }
         if(bandera==true){
        this.txt_id.setText("");
        this.txt_nombre.setText("");
        this.txt_apPaterno.setText("");
        this.txt_apMaterno.setText("");
        this.txt_email.setText("");
        this.txt_cel.setText("");
        this.txt_carrera.setText("");
        this.txt_generacion.setText("");
        this.txt_tem_tesi.setText("");
        this.txt_dir_tesi.setText("");
        this.txt_trabajo.setText("");
        this.txt_lugar_t.setText("");
        this.txt_hora_t.setText("");
        this.jCheck_exposicion.setSelected(false);
        this.jCheck_cartaCompromiso.setSelected(false);
         }
        
        
    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        String cadena1,cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8,cadena9,cadena10,cadena11,cadena12,cadena13;
      int exp_motivos=0,carta_com=0;
      
       cadena1 = txt_id.getText();
       cadena2 = txt_nombre.getText();
       cadena3 = txt_apPaterno.getText();
       cadena4 = txt_apMaterno.getText();
       cadena5 = txt_email.getText();
       cadena6 = txt_cel.getText();
       cadena7 = txt_carrera.getText();
       cadena8 = txt_generacion.getText();
       cadena9 = txt_tem_tesi.getText();
       cadena10 = txt_dir_tesi.getText();
       cadena11 = txt_trabajo.getText();
       cadena12 = txt_lugar_t.getText();
       cadena13 = txt_hora_t.getText();
        if(jCheck_exposicion.isSelected()){
            exp_motivos=1;
        }else
            exp_motivos=0;
        if(jCheck_cartaCompromiso.isSelected()){
            carta_com=1;
        }else
            carta_com=0;
       
     
    
     if (txt_nombre.getText().equals("")) {
         
         javax.swing.JOptionPane.showMessageDialog(this,"1-. Consulte el nombre del alumno\n 2-. Actualice el dato deseado en el campo correspondiente","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
     }
     else {   
     
     try { 
                  String url = "jdbc:mysql://localhost:3306/prueba_1"; 
                  String usuario = "root"; 
                  String contraseña = "itachi"; 
                  
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                  con = DriverManager.getConnection(url,usuario,contraseña); 
                  if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  stmt.executeUpdate("UPDATE  alumnos SET id= '"+cadena1+"' , nombre = '"+cadena2+"',apPaterno = '"+cadena3+"',apMaterno = '"+cadena4+"', email = '"+cadena5+"', cel = '"+cadena6+"',"
                          + "carrera = '"+cadena7+"'generacion = '"+cadena8+"'tem tesi = '"+cadena9+"'dir tesi = '"+cadena10+
                          "'trabajo = '"+cadena11+"'lugar trabajo = '"+cadena12+"'horario trabajo = '"+cadena13+"'exposicion de motivos = '"+exp_motivos+"'carta compromiso = '"+carta_com+"')");          
                  
                  System.out.println("Los valores han sido Actualizados"); 
                  } 
                  catch( SQLException e ) { 
                      e.printStackTrace(); 
                  } catch (ClassNotFoundException ex) { 
            Logger.getLogger(alumnos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(alumnos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(alumnos.class.getName()).log(Level.SEVERE, null, ex);
        } 
  
              finally { 
                  if ( con != null ) { 
                      try    { 
                          con.close(); 
                          stmt.close(); 
                      } catch( Exception e ) { 
                          System.out.println( e.getMessage()); 
                      } 
                  } 
     }
     //javax.swing.JOptionPane.showMessageDialog(this,"Actualizado correctamente!","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
     } 
        
         if(bandera==true){
        this.txt_id.setText("");
        this.txt_nombre.setText("");
        this.txt_apPaterno.setText("");
        this.txt_apMaterno.setText("");
        this.txt_email.setText("");
        this.txt_cel.setText("");
        this.txt_carrera.setText("");
        this.txt_generacion.setText("");
        this.txt_tem_tesi.setText("");
        this.txt_dir_tesi.setText("");
        this.txt_trabajo.setText("");
        this.txt_lugar_t.setText("");
        this.txt_hora_t.setText("");
        this.jCheck_exposicion.setSelected(false);
        this.jCheck_cartaCompromiso.setSelected(false);
         }
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_elimina;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JCheckBox jCheck_cartaCompromiso;
    private javax.swing.JCheckBox jCheck_exposicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_apMaterno;
    private javax.swing.JTextField txt_apPaterno;
    private javax.swing.JTextField txt_carrera;
    private javax.swing.JTextField txt_cel;
    private javax.swing.JTextField txt_dir_tesi;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_generacion;
    private javax.swing.JTextField txt_hora_t;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lugar_t;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tem_tesi;
    private javax.swing.JTextField txt_trabajo;
    // End of variables declaration//GEN-END:variables
}
