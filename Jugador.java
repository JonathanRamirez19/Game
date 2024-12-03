/** 
 * Este bloque define la clase Jugador, que hereda de la clase abstracta Personaje. 
 * Representa al personaje principal controlado por el jugador, con habilidades para atacar, 
 * defenderse y curarse utilizando pociones limitadas.
 */

public class Jugador extends Personaje {
    private int pociones; 

    public Jugador(String nombre, int puntosDeVida, int ataque, int defensa, int pociones) {
        super(nombre, puntosDeVida, ataque, defensa);
        this.pociones = pociones;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = ataque - objetivo.defensa;
        if (dano > 0) {
            objetivo.defender(dano);
            System.out.println(nombre + " ataca a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        } else {
            System.out.println(nombre + " no pudo atravesar la defensa de " + objetivo.getNombre() + ".");
        }
    }

    @Override
    public void defender(int dano) {
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Puntos de vida restantes: " + puntosDeVida);
    }

    public void curar() {
        if (pociones > 0) {
            puntosDeVida += 20; 
            pociones--; 
            System.out.println(nombre + " usa una poción. Vida actual: " + puntosDeVida);
        } else {
            System.out.println(nombre + " no tiene pociones restantes.");
        }
    }
}
