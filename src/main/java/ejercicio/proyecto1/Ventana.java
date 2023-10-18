/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
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
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JOptionPane;


/**
 *
 * @author luisc
 */
public class Ventana extends javax.swing.JFrame {
   private ArrayList<Personaje> personajes;
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
        personajes = (ArrayList<Personaje>)FileManager.readObject("nuevopath.dat");
        matriz_personaje = new Personaje[25][25];
        initComponents();
        lblSeleccion_Defensa.setVisible(enable);
        pnlDefensas.setLayout(new java.awt.GridLayout());
        crearTablero(); // funcion que crea el tablero
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
        lblEspaciosEjercito = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();

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

        lblEspaciosEjercito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEspaciosEjercito.setForeground(new java.awt.Color(0, 0, 0));
        lblEspaciosEjercito.setText("Espacios ejercito: ");

        btnCargar.setText("Cargar Personajes");
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
        });
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnInicio)
                .addGap(120, 120, 120)
                .addComponent(pnlDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetener))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSeleccion_Defensa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(203, 203, 203))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEspaciosEjercito)
                        .addGap(280, 850, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(pnlDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblSeleccion_Defensa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDetener)
                            .addComponent(btnCargar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEspaciosEjercito)
                .addContainerGap(20, Short.MAX_VALUE))
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
                ThreadPersonaje get = defensas.get(i);
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

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos DAT", "dat");
        fileChooser.setFileFilter(filter);

                int resultado = fileChooser.showOpenDialog(this);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    try{
                        File archivoSeleccionado = fileChooser.getSelectedFile();
                       // personajes = (ArrayList<Personaje>)FileManager.readObject(archivoSeleccionado.getAbsolutePath());
                        //personajes = (ArrayList<Personaje>)FileManager.readObject("nuevopath.dat");
                        FileManager.readFile(archivoSeleccionado.getAbsolutePath());

                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Error, no se ha cargado los personajes");
                        
                    }
                    
                }
    }//GEN-LAST:event_btnCargarMouseClicked
 
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
   
    // Funcion que mueve personajes
    public void moverPersonaje(Personaje personaje, int x, int y){
               if(matriz_personaje[x][y] == null){
                    matriz_personaje[personaje.getPosicion_x()][personaje.getPosicion_y()] = null;
                    addComponenteTablero(personaje, x, y);
                    pnlPanelJuego.repaint();
               }
        if(matriz_personaje[x][y] == null){
            matriz_personaje[personaje.getPosicion_x()][personaje.getPosicion_y()] = null;
            addComponenteTablero(personaje, x, y);
            pnlPanelJuego.repaint();
        }
    }
    
public void moverDefensaAereo(Defensa defensa) {
    if (defensa.getTipo().equals("AEREO")) {
        int filaActual = defensa.getPosicion_x();
        int columnaActual = defensa.getPosicion_y();

        int x = new Random().nextInt(25);
        int y = new Random().nextInt(25);

        //Verificar si la nueva posición es válida y si la casilla está desocupada
        if (esUbicacionValida(tablero, x, y) && verificarCasilla(x, y)) {
            moverPersonaje(defensa, x, y);
        }
    }
}

    private void generarZombies(Zombie zombie){
            
            TipoZombie tipo = cargarTipoZombie(zombie);
            
            // crear el zombie aleatoriamente, del tipo que corresponda
            Zombie z1 = new Zombie(tipo, zombie.getNombre(), zombie.getVida(), zombie.getCantidad_golpes(), zombie.getNivel(), zombie.getCampos(), zombie.getNivel_aparicion(), zombie.getTipo(), zombie.getRango(), zombie.getDaño(), zombie.getRutaImagen());
            
            // agrega el zombie solo en la ultima casilla exterior (0,0) hasta (0, 24) y (24,0) hasta la (24,24)
            setAparicion(z1);
            
            // Crear el thread
            ThreadPersonaje tp =  new ThreadPersonaje(z1, this);
            zombies.add(tp);
            cantidad_zombies++;

        
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
       TipoDefensa tipo = cargarTipoDefensa(defensa);
       
        Defensa def2 = new 
        Defensa(tipo.BLOQUES, defensa.getNombre(), defensa.getVida(), defensa.getCantidad_golpes(), defensa.getNivel(), defensa.getCampos(), defensa.getNivel_aparicion(), defensa.getTipo(), defensa.getRango(), defensa.getDaño(), defensa.getRutaImagen());
        def2.setPosicion_x(fila);
        def2.setPosicion_y(columna);
        
        // Crear el thread
        ThreadPersonaje tp =  new ThreadPersonaje(def2, this);
        defensas.add(tp);  
        addComponenteTablero(def2, fila, columna);
        cantidad_defensas++;
        pnlPanelJuego.repaint();
    }
    
    public void generarDefensasContenedor(Defensa defensa){
        TipoDefensa tipo = cargarTipoDefensa(defensa);
        defensa = new Defensa(tipo, defensa.getNombre(), defensa.getVida(), defensa.getCantidad_golpes(), defensa.getNivel(), defensa.getCampos(), defensa.getNivel_aparicion(), defensa.getTipo(), defensa.getRango(), defensa.getDaño(), defensa.getRutaImagen());
        defensa.getLabel().addMouseListener(new Listener_Defensas(this, defensa));
        cantidad_defensas++;
        pnlDefensas.add(defensa.getLabel());
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
 if (personaje.getTipo().equals("ZOMBIE") && !hasAttacked) {
        Defensa defensaCercana = encontrarDefensaCercana(fila, columna);

        if (defensaCercana != null) {
            moverZombieHaciaDefensa(personaje, defensaCercana);
        }
    }
}

public Defensa encontrarDefensaCercana(int filaZombie, int columnaZombie) {
    Defensa defensaCercana = null; //defensaCercana se inicializa en null
    
    //Garantiza que la primera distancia calculada siempre será menor que  distanciaMinima
    double distanciaMinima = Double.MAX_VALUE; 
    
    //Bucle for para iterar a través de las defensas
    for (ThreadPersonaje defensaThread : defensas) {
        
        Defensa defensa = (Defensa) defensaThread.getPersonaje(); //Obtenemos la defensa actual
        int filaDefensa = defensa.getPosicion_x(); //Obtenemos la fila de la defensa
        int columnaDefensa = defensa.getPosicion_y(); //Obtenemos la columna de la defensa

        //Calculamos la distancia con el teorema de Pitágoras
        //Se puede aplicar Pitágoras ya que el juego es en un plano cartesiano
        double distancia = Math.sqrt(Math.pow(filaDefensa - filaZombie, 2) + Math.pow(columnaDefensa - columnaZombie, 2));

        //Si la distancia calculada es menor que la distancia mínima registrada hasta ahora
        if (distancia < distanciaMinima) {
            distanciaMinima = distancia; //Actualizamos la distancia mínima
            defensaCercana = defensa; //Actualizamos la referencia a la defensa más cercana
        }
    }

    //Se retorna la defensa más cercana encontrada
    return defensaCercana;
}

public void moverZombieHaciaDefensa(Personaje zombie, Defensa defensa) {
    int filaZombie = zombie.getPosicion_x(); //Obtenemos la fila actual del zombie
    int columnaZombie = zombie.getPosicion_y(); //Obtenemos la columna actual del zombie
    int filaDefensa = defensa.getPosicion_x(); //Obtenemos la fila de la defensa
    int columnaDefensa = defensa.getPosicion_y(); //Obtenemos la columna de la defensa


    int nuevoX = Integer.compare(filaDefensa - filaZombie, 0); //Diferencia en la fila
    int nuevoY = Integer.compare(columnaDefensa - columnaZombie, 0); //Diferencia en la columna

    //Calculamos las nuevas coordenadas para el zombie
    int nuevaFila = filaZombie + nuevoX; //Nueva fila
    int nuevaColumna = columnaZombie + nuevoY; //Nueva columna

    //Verificamos si la nueva ubicación es válida en el tablero y si la casilla está disponible
    if (esUbicacionValida(tablero, nuevaFila, nuevaColumna) && verificarCasilla(nuevaFila, nuevaColumna)) {
        moverPersonaje(zombie, nuevaFila, nuevaColumna); // Movemos el zombie a la nueva ubicación
    }
}

private void cargarTexto(String texto_completo){
   String str = "";
   int contador = 0;
   
   // Los atributos de cada personaje
   String tipoEspecial;
   String Nombre;
   
   
    for (int i = 0; i < texto_completo.length(); i++) {
        if(texto_completo.charAt(i) == ','){
            
        }
    }

}

private void cargarPersonajes(){
    for (int i = 0; i < personajes.size(); i++) {
        if(personajes.get(i).getTipo().equals("ZOMBIE")){
            System.out.println("LLego aqui??");
            generarZombies((Zombie)personajes.get(i));
        }
        else{
            System.out.println("LLego aqui siiiiii??");
            generarDefensasContenedor((Defensa)personajes.get(i));
        
        }
    }

}

private TipoZombie cargarTipoZombie(Zombie zombie){
    String zombie_nombre = zombie.getNombre();
    switch (zombie_nombre) {
            case "Zombie Aéreo":
                return TipoZombie.AEREO;
            case "Zombie de Contacto":
                return TipoZombie.CONTACTO;
            case "Zombie de Mediano Alcance":
                return TipoZombie.MEDIANO_ALCANCE;
            case "Zombie de Choque":
                return TipoZombie.CHOQUE;
                }
    return null;
    
}


private TipoDefensa cargarTipoDefensa(Defensa defensa){
    String defensa_nombre = defensa.getNombre();
    switch (defensa_nombre) {
            case "Defensa Aérea":
                return TipoDefensa.AEREO;
            case "Defensa de Contacto":
                return TipoDefensa.CONTACTO;
            case "Defensa de Mediano Alcance":
                return TipoDefensa.MEDIANO_ALCANCE;
            case "Defensa de Impacto":
                return TipoDefensa.IMPACTO;
            case "Defensa de Ataque Múltiple":
                return TipoDefensa.ATAQUE_MULTIPLE;
            case "Defensa de Bloque":
                return TipoDefensa.BLOQUES;
                
    }
    return null;
    
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


private boolean nivelGanado() {
    for (ThreadPersonaje defensaThread : defensas) {
        Defensa defensa = (Defensa) defensaThread.getPersonaje();
        if (defensa.getVida() > 0) {
            return false; //Si al menos una defensa está viva, retorna falso
        }
    }
    return true; //Todas las defensas están muertas
}


private boolean nivelPerdido() {
    for (ThreadPersonaje zombieThread : zombies) {
        Personaje zombie = zombieThread.getPersonaje();
        if (zombie.getVida() > 0) {
            return false; //Si al menos un zombie está vivo, retorna falso
        }
    }
    return true; //Todos los zombies están muertos
}

public void avanzarNivel(Personaje personajeActual) {
    // Verifica si se ha ganado el juego (todas las defensas muertas)
    if (nivelGanado()) {
        System.out.println("¡Has ganado el nivel!");
    } else if (nivelPerdido()) {
        System.out.println("¡Has perdido el nivel!");
    } else {
        System.out.println("Has avanzado al nivel " + (personajeActual.getNivel() + 1));
        int nivelActual = personajeActual.getNivel();
        personajeActual.setNivel(nivelActual + 1);
        aumentarStatsPorNivel(personajeActual);
    }
}

public void aumentarStatsPorNivel(Personaje personaje) {
    int incrementoVida = (int) (Math.random() * 16 + 5); //Valor aleatorio entre 5 y 20
    int incrementoDaño = (int) (Math.random() * 16 + 5); 
    
    personaje.setVida(personaje.getVida() + incrementoVida);
    personaje.setDaño(personaje.getDaño() + incrementoDaño);

    System.out.println("Nivel " + personaje.getNivel() + ": Se han aumentado las estadísticas de los personajes.");
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
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnInicio;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblEspaciosEjercito;
    private javax.swing.JLabel lblSeleccion_Defensa;
    private javax.swing.JPanel pnlDefensas;
    private javax.swing.JPanel pnlPanelJuego;
    // End of variables declaration//GEN-END:variables
}

