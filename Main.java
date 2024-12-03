/** 
 * Este bloque define la clase principal Main, que contiene el método main.  
 * Sirve como punto de entrada para iniciar el juego al crear una instancia de la clase Juego  
 * y llamar al método iniciar para comenzar la ejecución del combate.  
 */

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciar();
    }
}
