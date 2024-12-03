/** 
 * Este bloque define la clase Orco, que hereda de la clase abstracta Personaje.  
 * Representa a un enemigo con un ataque brutal fijo y características específicas 
 * de combate como recibir y calcular daño.  
 */

public class Orco extends Personaje {

    public Orco(String nombre, int puntosDeVida, int ataque, int defensa) {
        super(nombre, puntosDeVida, ataque, defensa);
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = 20;
        objetivo.defender(dano);
        System.out.println(nombre + " golpea brutalmente a " + objetivo.getNombre() + " causando " + dano + " de daño.");
    }

    @Override
    public void defender(int dano) {
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Vida restante: " + puntosDeVida);
    }
}
