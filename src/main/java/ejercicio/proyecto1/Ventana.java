/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author luisc
 */
public class Ventana extends javax.swing.JFrame {
   private ArrayList<ThreadPersonaje> zombies;
   private ArrayList<ThreadPersonaje> defensas;
   private Defensa defensa_seleccionada;
   private int ejercito;
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
        initComponents();
        lblSeleccion_Defensa.setVisible(enable);
        pnlDefensas.setLayout(new java.awt.GridLayout());
        crearTablero(); // funcion que crea el tablero
       // Component c1 = getJPanelTablero(24, 24);
       // addComponenteTablero(c1);
        generarZombies(1);
        //generarDefensas(10);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(270, Short.MAX_VALUE)
                        .addComponent(lblBorrarDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnInicio)
                        .addGap(112, 112, 112)
                        .addComponent(tbnBorrarDefensa)))
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
                    .addComponent(lblEspaciosEjercito)
                    .addComponent(pnlPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(lblEspaciosEjercito)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
         for (int i = 0; i < zombies.size(); i++) {
            ThreadPersonaje get = zombies.get(i);
            get.start();
            btnInicio.setEnabled(false);
        }
//        for (int i = 0; i < defensas.size(); i++) {
//            ThreadPersonaje get = defensas.get(i);
//            get.start();
//            btnInicio.setEnabled(false);
//        }
         btnDetener.setEnabled(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        // TODO add your handling code here:
//        for (int i = 0; i < zombies.size(); i++) {
//            ThreadPersonaje get = zombies.get(i);
//            get.start();
            
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
       if (btnDetener.getText().equals("Pausar")){
            for (int i = 0; i < zombies.size(); i++) {
            ThreadPersonaje get = zombies.get(i);
            get.suspend();
           // get.pausar();
            }
        btnDetener.setText("Reanudar");
       }
       else{
        for (int i = 0; i < zombies.size(); i++) {
            ThreadPersonaje get = zombies.get(i);
            get.resume();
            //get.reanudar();
            }
        btnDetener.setText("Pausar");
        }
        
//        for (int i = 0; i < zombies.size(); i++) {
//            ThreadPersonaje get = zombies.get(i);
//            get.detener();
//        }
//       btnDetener.setText("Reanudar");
    }//GEN-LAST:event_btnDetenerActionPerformed

    private void tbnBorrarDefensaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnBorrarDefensaMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tbnBorrarDefensaMouseClicked
 
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
          casilla_tablero.add(personaje.getLabel());
    }
   
    
    public void moverPersonaje(Personaje personaje){
        int x = new Random().nextInt(25);
        int y = new Random().nextInt(25);
        boolean isRunning = true;
        
        //while(isRunning){
            //if(verificarCasilla(x, y)){
               // JPanel panel_label = tablero[x][y]; // obtiene el panel donde se ubica el JLabel
                addComponenteTablero(personaje, x, y);
                pnlPanelJuego.repaint();
                isRunning = false;
                 //panel_label.removeAll(); // elimina todo lo que esta dentro de este panel
  
           // }
            //else{
               // x = new Random().nextInt(25);
               // y = new Random().nextInt(25);
           // }
            //pnlPanelJuego.repaint();
     
      //  }
    }
    private void generarZombies(int size){
        
        for (int i = 0; i < size; i++) {
            //crea el label
//            JLabel label =  new JLabel("100%");
//            label.setBackground(Color.red);
//            label.setForeground(new java.awt.Color(255, 255, 255));
//            label.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
//            label.setForeground(new java.awt.Color(255, 255, 255));
//            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//            label.setOpaque(true);
            
            // crear el zombie aleatoriamente, del tipo que corresponda
            Zombie zombie = new Zombie(TipoZombie.CONTACTO, "Zombie1", 100, 1, 1, 1, 1, "ZOMBIE", 1, 1);
           // zombie.setLabel(label);
            
            setAparicion(zombie);
            
            // Crear el thread
            ThreadPersonaje tp =  new ThreadPersonaje(zombie, this);
            zombies.add(tp);
            
            // agrega el zombie solo en la ultima casilla exterior (0,0) hasta (0, 24) y (24,0) hasta la (24,24)
             
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

    
    private void generarDefensas(int size){
       // funcion que genera las defensas en el tablero
       for (int i = 0; i < size; i++) {
            //crea el label
            JLabel label =  new JLabel("100%");
            label.setBackground(Color.BLUE);
            label.setForeground(new java.awt.Color(255, 255, 255));
            label.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
            label.setForeground(new java.awt.Color(255, 255, 255));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setOpaque(true);
            
            // crear el zombie aleatoriamente, del tipo que corresponda
            Personaje defensa = new Personaje() {};
            defensa.setLabel(label);
            
            // Crear el thread
            ThreadPersonaje tp =  new ThreadPersonaje(defensa, this);
            defensas.add(tp);
            
            // agrega el zombie solo en la ultima casilla exterior (0,0) hasta (0, 24) y (24,0) hasta la (24,24)
            int x = new Random().nextInt(25);
            int y = new Random().nextInt(25);
            
            // verifica si la casilla en las posiciones x,y estan vacias para agregarlo
           
            addComponenteTablero(defensa, x, y);
             
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
        pnlPanelJuego.repaint();
    }
    
    public void generarDefensasContenedor(int size){
        for (int i = 0; i < size; i++) {
            Defensa defensa = new Defensa(TipoDefensa.BLOQUES, "THE WALL", 100, 0, 1, 1, 1, "DEFENSA", 0, 0);
            defensa.getLabel().addMouseListener(new Listener_Defensas(this, defensa));
            pnlDefensas.add(defensa.getLabel());
        }
    }
    
     public void setAparicion(Personaje zombie){
        // variables que sustituyen para spawnear en los bordes
        int x;
        int y;
        
        // el zombie
        JLabel label = zombie.getLabel();
        
        int colOrRow = (new Random()).nextInt(2);//0: col  1: filas
        int dir = (new Random()).nextInt(2);//0: primera  1: ultima
            if (colOrRow == 0){ // va a colocarse en las columnas (x, 0), (x, 24)
                x = new Random().nextInt(25);
                if (dir == 0){
                   // zombie.setPosicion_x(3); zombie.setPosicion_y(3); // 0
                    addComponenteTablero(zombie, x, 0);
                }
                else{
                   // zombie.setPosicion_x(3); zombie.setPosicion_y(3); // 24
                    addComponenteTablero(zombie, x, 24);
                }
            }else{ // va a colocarse en las filas (0, y), (24, y)    
                y = new Random().nextInt(25);
                if (dir == 0){
                   // zombie.setPosicion_x(3); zombie.setPosicion_y(3); // 0
                    addComponenteTablero(zombie, 0, y);
                }
                else{
                  //  zombie.setPosicion_x(3); zombie.setPosicion_y(3); // 24
                    addComponenteTablero(zombie, 24, y);
                }
            }
            //label.setVisible(true);
    }
     
private double calcularDistancia(Personaje zombie, Personaje defensa) {
    int x1 = zombie.getPosicion_x();
    int y1 = zombie.getPosicion_y();
    int x2 = defensa.getPosicion_x();
    int y2 = defensa.getPosicion_y();

   return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
}
     
public void zombieAtacarDefensaMasCercana(Zombie zombie) {
    
    Defensa defensaMasCercana = null;
    double distanciaMinima = Math.sqrt(25 * 25 + 25 * 25);


    for (ThreadPersonaje threadDefensa : defensas) {
        Defensa defensa = (Defensa) threadDefensa.personaje;
        double distancia = calcularDistancia(zombie, defensa);

        if (distancia < distanciaMinima) {
            distanciaMinima = distancia;
            defensaMasCercana = defensa;
        }
    }

    if (defensaMasCercana != null) {
        zombie.pelear(defensaMasCercana);
    }
}     

public void defensaAtacarZombieMasCercano(Defensa defensa) {
    Zombie zombieMasCercano = null;
    double distanciaMinima  = Math.sqrt(25 * 25 + 25 * 25);

    for (ThreadPersonaje threadZombie : zombies) {
        Zombie zombie = (Zombie) threadZombie.personaje;
        double distancia = calcularDistancia(defensa, zombie);

        if (distancia < distanciaMinima) {
            distanciaMinima = distancia;
            zombieMasCercano = zombie;
        }
    }

    if (zombieMasCercano != null) {
        defensa.pelear(zombieMasCercano);
    }
}
// verifica si hay algun zombie en el rango de dicha defensa
public void verificarRangoAdyacentes(Personaje personaje){
        int fila = personaje.getPosicion_x();
        int columna = personaje.getPosicion_y();  
        System.out.println("Elemento en: ("+ fila + ", " + columna + ")");
        
        
        int rango = personaje.getRango();  // Especifica el rango alrededor de la ubicación actual

        for (int i = -rango; i <= rango; i++) {
            for (int j = -rango; j <= rango; j++) {
                int filaAdyacente = fila + i;
                int columnaAdyacente = columna + j;

                if (esUbicacionValida(tablero, filaAdyacente, columnaAdyacente) && (filaAdyacente != fila || columnaAdyacente != columna)) {
                    if(verificarCasilla(filaAdyacente, columnaAdyacente) == false){ // si no esta vacia es que contiene algo
                        atacarPersonaje(personaje, filaAdyacente, columnaAdyacente); // ataca al enemigo
                    }
                    JPanel elementoAdyacente = tablero[filaAdyacente][columnaAdyacente];
                    System.out.println("Elemento en [" + filaAdyacente + "][" + columnaAdyacente + "]: " + elementoAdyacente);
                }
            }
        }
        
}

// Funcion que determina si la ubicacion es valida para el personaje de la matriz
public static boolean esUbicacionValida(JPanel[][] matriz, int fila, int columna) {
        return fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length;
    }


// funcion que primero verifica cual personaje es para atacarlo
public void atacarPersonaje(Personaje personaje, int fila_enemigo, int columna_enemigo){
    if(personaje.getTipo().equals("ZOMBIE")){
        System.out.println("Estoy atacando a un zombie pts");
    
    
    
    }else{
    
    }


}


  
     
     // getters and setters

    public JPanel getPnlDefensas() {
        return pnlDefensas;
    }

    public ArrayList<ThreadPersonaje> getZombies() {
        return zombies;
    }

    public ArrayList<ThreadPersonaje> getDefensas() {
        return defensas;
    }

    public JPanel[][] getTablero() {
        return tablero;
    }

    public JPanel getPnlPanelJuego() {
        return pnlPanelJuego;
    }

    public void setLblSeleccion_Defensa(JLabel lblSeleccion_Defensa) {
        this.lblSeleccion_Defensa = lblSeleccion_Defensa;
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
