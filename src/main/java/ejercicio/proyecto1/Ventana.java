/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author luisc
 */
public class Ventana extends javax.swing.JFrame {
   private ArrayList<ThreadPersonaje> zombies;
   private ArrayList<ThreadPersonaje> defensas;
   private Personaje[][] matriz_personaje;
   private Defensa defensa_seleccionada;
   private int ejercito = 20;
   private boolean enable = false;
   private boolean enable_borrar = false;
   int cantidad_defensas;
   int cantidad_zombies;
   private JPanel[][] tablero; // el tablero es una matriz
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        zombies = new ArrayList<ThreadPersonaje>();
        defensas = new ArrayList<ThreadPersonaje>();
        tablero = new JPanel[25][25];
        matriz_personaje = new Personaje[25][25];
        initComponents();
        lblSeleccion_Defensa.setVisible(enable);
        pnlDefensas.setLayout(new java.awt.GridLayout());
        crearTablero(); // funcion que crea el tablero
        generarZombies(2);
        generarDefensasContenedor(7);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        pnlPanelJuego = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        pnlDefensas = new javax.swing.JPanel();
        lblSeleccion_Defensa = new javax.swing.JLabel();
        lblBorrarDefensa = new javax.swing.JLabel();
        tbnBorrarDefensa = new javax.swing.JToggleButton();
        lblEspaciosEjercito = new javax.swing.JLabel();
        btnAgregarImagen = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        pnlPanelJuego.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanelJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanelJuego.setLayout(new java.awt.GridLayout(1, 0));

        btnInicio.setText("Iniciar Juego");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnDetener.setText("Pausar");
        btnDetener.setEnabled(false);
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        pnlDefensas.setBackground(new java.awt.Color(255, 255, 255));
        pnlDefensas.setLayout(new javax.swing.BoxLayout(pnlDefensas, javax.swing.BoxLayout.LINE_AXIS));

        lblSeleccion_Defensa.setForeground(new java.awt.Color(0, 0, 0));
        lblSeleccion_Defensa.setText("Se ha seleccionado una defensa!");
        lblSeleccion_Defensa.setEnabled(false);
        lblSeleccion_Defensa.setOpaque(true);

        lblBorrarDefensa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBorrarDefensa.setForeground(new java.awt.Color(255, 51, 0));
        lblBorrarDefensa.setText("Selecciona una defensa para borrar");

        tbnBorrarDefensa.setText("BorrarDefensa");
        tbnBorrarDefensa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnBorrarDefensaMouseClicked(evt);
            }
        });

        lblEspaciosEjercito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEspaciosEjercito.setForeground(new java.awt.Color(0, 0, 0));
        lblEspaciosEjercito.setText("Espacios ejercito: ");

        btnAgregarImagen.setText("Agregar Imagen");
        btnAgregarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarImagenMouseClicked(evt);
            }
        });
        btnAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnInicio)
                        .addGap(112, 112, 112)
                        .addComponent(tbnBorrarDefensa))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(270, Short.MAX_VALUE)
                        .addComponent(lblBorrarDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(pnlDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnDetener))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSeleccion_Defensa)))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEspaciosEjercito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarImagen)
                        .addGap(280, 280, 280))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInicio)
                            .addComponent(tbnBorrarDefensa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBorrarDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addComponent(pnlDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblSeleccion_Defensa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDetener)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(pnlPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspaciosEjercito)
                    .addComponent(btnAgregarImagen))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed

    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        // TODO add your handling code here:
         for (int i = 0; i < zombies.size(); i++) {
            ThreadPersonaje get = zombies.get(i);
            get.start();
            btnInicio.setEnabled(false);
        }
        for (int i = 0; i < defensas.size(); i++) {
            ThreadPersonaje get = defensas.get(i);
            get.start();
            btnInicio.setEnabled(false);
        }
         btnDetener.setEnabled(true);
            
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
       if (btnDetener.getText().equals("Pausar")){
            for (int i = 0; i < zombies.size(); i++) {
                ThreadPersonaje get = zombies.get(i);
                get.pausar();
            }
            for (int i = 0; i < defensas.size(); i++) {
                ThreadPersonaje get = zombies.get(i);
                get.pausar();
            }
        btnDetener.setText("Reanudar");
       }
       else{
            for (int i = 0; i < zombies.size(); i++) {
                ThreadPersonaje get = zombies.get(i);
                get.reanudar();
            }
            for (int i = 0; i < defensas.size(); i++) {
                ThreadPersonaje get = defensas.get(i);
                get.reanudar();
            }
        btnDetener.setText("Pausar");
        }
    }//GEN-LAST:event_btnDetenerActionPerformed

    private void tbnBorrarDefensaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnBorrarDefensaMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tbnBorrarDefensaMouseClicked

    private void btnAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarImagenActionPerformed

    private void btnAgregarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarImagenMouseClicked
        JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos GIF", "gif");
                fileChooser.setFileFilter(filter);

                int resultado = fileChooser.showOpenDialog(this);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    Zombie z1 = (Zombie)zombies.get(0).getPersonaje();
                    File archivoSeleccionado = fileChooser.getSelectedFile();
                    ImageIcon imagen = new ImageIcon(archivoSeleccionado.getAbsolutePath());
                    Image imagenRedimensionada = imagen.getImage().getScaledInstance(z1.getLabel().getWidth(), z1.getLabel().getHeight(), Image.SCALE_SMOOTH);
                    
                    z1.getLabel().setIcon(new ImageIcon(imagenRedimensionada));
                }
    }//GEN-LAST:event_btnAgregarImagenMouseClicked
 
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // crea un tablero que es una matriz de 25x25 
    private void crearTablero(){
        pnlPanelJuego.setLayout(new java.awt.GridLayout(25,25));
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++){
                tablero[fila][columna] = new JPanel();
                tablero[fila][columna].addMouseListener(new Listener_Tablero(fila, columna, this)); // agrega un listener a cada panel
                tablero[fila][columna].setBackground(Color.LIGHT_GRAY);
                tablero[fila][columna].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                tablero[fila][columna].setLayout(new java.awt.BorderLayout(1,1));
                pnlPanelJuego.add(tablero[fila][columna]);         
            }
        }
    }
  
    // esta funcion retorna el JPanel del tablero en una posicion x,y dado
    private JPanel getJPanelTablero(int filaDeseada, int columnaDeseada){
        // Obtiene la posicion de la matriz, *25 ya que son 25 cuadriculas,  inicio es (0,0)
        return tablero[filaDeseada][columnaDeseada];
    }
    
    // Esta funcion agrega un componente al tablero en la posicion x,y dado
    public void addComponenteTablero(Personaje personaje, int fila, int columna){
          JPanel casilla_tablero = getJPanelTablero(fila, columna);
          personaje.setPosicion_x(fila); personaje.setPosicion_y(columna);
          matriz_personaje[fila][columna] = personaje;
          casilla_tablero.add(personaje.getLabel());
    }
   
    // Funcion que mueve un personaje a un x,y dados
    public void moverPersonaje(Personaje personaje, int x, int y){
        if(matriz_personaje[x][y] == null){
            matriz_personaje[personaje.getPosicion_x()][personaje.getPosicion_y()] = null;
            addComponenteTablero(personaje, x, y);
            pnlPanelJuego.repaint();
        }
    }
    private void generarZombies(int size){
        
        for (int i = 0; i < size; i++) {
            
            // crear el zombie aleatoriamente, del tipo que corresponda
            Zombie zombie = new Zombie(TipoZombie.CONTACTO, "Zombie1", 100, 1, 1, 1, 1, "ZOMBIE", 1, 1);
            
            // agrega el zombie solo en la ultima casilla exterior (0,0) hasta (0, 24) y (24,0) hasta la (24,24)
            setAparicion(zombie);
            
            // Crear el thread
            ThreadPersonaje tp =  new ThreadPersonaje(zombie, this);
            zombies.add(tp);
            cantidad_zombies++;
             
        }
        
    }
    
    private boolean verificarCasilla(int x, int y){
    // funcion que verifica la casilla si contiene un elemento
            if (tablero[x][y].getComponentCount() == 0){
                return true;
            }
            else{
                return false;
            }
        }
    
    public void addDefensa(Defensa defensa, int fila, int columna){
       // funcion que añade la defensa en el tablero
        Defensa def2 = new 
        Defensa(TipoDefensa.BLOQUES, defensa.getNombre(), defensa.getVida(), defensa.getCantidad_golpes(), defensa.getNivel(), defensa.getCampos(), defensa.getNivel_aparicion(), defensa.getTipo(), defensa.getRango(), defensa.getDaño());
        def2.setPosicion_x(fila);
        def2.setPosicion_y(columna);
        
        // Crear el thread
        ThreadPersonaje tp =  new ThreadPersonaje(def2, this);
        defensas.add(tp);  
        addComponenteTablero(def2, fila, columna);
        cantidad_defensas++;
        pnlPanelJuego.repaint();
    }
    
    public void generarDefensasContenedor(int size){
        for (int i = 0; i < size; i++) {
            Defensa defensa = new Defensa(TipoDefensa.BLOQUES, "THE WALL", 100, 1, 1, 1, 1, "DEFENSA", 1, 1);
            defensa.getLabel().addMouseListener(new Listener_Defensas(this, defensa));
            cantidad_defensas++;
            pnlDefensas.add(defensa.getLabel());
        }
    }
    
    public void setAparicion(Personaje zombie){
        // variables que sustituyen para spawnear en los bordes
        int x;
        int y;
        
        int colOrRow = (new Random()).nextInt(2);//0: col  1: filas
        int dir = (new Random()).nextInt(2);//0: primera  1: ultima
            if (colOrRow == 0){ // va a colocarse en las columnas (x, 0), (x, 24)
                x = new Random().nextInt(25);
                if (dir == 0){
                    addComponenteTablero(zombie, x, 0);
                }
                else{
                    addComponenteTablero(zombie, x, 24);
                }
            }else{ // va a colocarse en las filas (0, y), (24, y)    
                y = new Random().nextInt(25);
                if (dir == 0){
                    addComponenteTablero(zombie, 0, y);
                }
                else{
                    addComponenteTablero(zombie, 24, y);
                }
            }
    }
     
// verifica si hay algun zombie en el rango de dicha defensa
public void verificarRangoAdyacentes(Personaje personaje){
        boolean hasAttacked = false;
        int fila = personaje.getPosicion_x();
        int columna = personaje.getPosicion_y();
        System.out.println("Elemento en: ("+ fila + ", " + columna + ")");
        
        
        int rango = personaje.getRango();  // Especifica el rango alrededor de la ubicación actual
        
        externo:
        for (int i = -rango; i <= rango; i++) {
            for (int j = -rango; j <= rango; j++) {
           
                int filaAdyacente = fila + i;
                int columnaAdyacente = columna + j;

                if (esUbicacionValida(tablero, filaAdyacente, columnaAdyacente) && (filaAdyacente != fila || columnaAdyacente != columna)) {
                    if((verificarCasilla(filaAdyacente, columnaAdyacente) == false) &&
                       (matriz_personaje[filaAdyacente][columnaAdyacente].getTipo() != personaje.getTipo())){ // si no esta vacia y si los personajes no son del mismo tipo
                        atacarPersonaje(personaje, filaAdyacente, columnaAdyacente); // ataca al enemigo
                        hasAttacked = true;
                        break externo;  
                    }
                    JPanel elementoAdyacente = tablero[filaAdyacente][columnaAdyacente];
                    System.out.println("Elemento en [" + filaAdyacente + "][" + columnaAdyacente + "]: " + elementoAdyacente);
                    
                }
                else{
                    hasAttacked = false;
                }
            }
        }
    if((hasAttacked == false) && (personaje.getTipo().equals("ZOMBIE"))){ // si no ha atacado entonces se mueve
            int x = new Random().nextInt(25);
            int y = new Random().nextInt(25);
            moverPersonaje(personaje, x, y);
        }
        
}

// Funcion que determina si la ubicacion es valida para el personaje de la matriz
public static boolean esUbicacionValida(JPanel[][] matriz, int fila, int columna) {
        return fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length;
    }


// funcion que primero verifica cual personaje es para atacarlo
public void atacarPersonaje(Personaje personaje, int fila_enemigo, int columna_enemigo){
    // si es una defensa buscar dentro del thread de zombies
    Personaje enemigo = matriz_personaje[fila_enemigo][columna_enemigo];
    personaje.pelear(enemigo);
   
}


  
     
     // getters and setters

    public JPanel getPnlDefensas() {
        return pnlDefensas;
    }

    public JPanel[][] getTablero() {
        return tablero;
    }

    public JPanel getPnlPanelJuego() {
        return pnlPanelJuego;
    }


    public JLabel getLblSeleccion_Defensa() {
        return lblSeleccion_Defensa;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public JButton getBtnInicio() {
        return btnInicio;
    }

    public Defensa getDefensa_seleccionada() {
        return defensa_seleccionada;
    }

    public void setDefensa_seleccionada(Defensa defensa_seleccionada) {
        this.defensa_seleccionada = defensa_seleccionada;
    }

    
    
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnInicio;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBorrarDefensa;
    private javax.swing.JLabel lblEspaciosEjercito;
    private javax.swing.JLabel lblSeleccion_Defensa;
    private javax.swing.JPanel pnlDefensas;
    private javax.swing.JPanel pnlPanelJuego;
    private javax.swing.JToggleButton tbnBorrarDefensa;
    // End of variables declaration//GEN-END:variables
}
