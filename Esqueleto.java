/**Este bloque define una subclase específica llamada Esqueleto, que hereda de la clase abstracta Personaje. 
 * Representa un enemigo con características y comportamientos propios dentro del juego.
*/
public class Esqueleto extends Personaje {

    public Esqueleto(String nombre, int puntosDeVida, int ataque, int defensa) {
        super(nombre, puntosDeVida, ataque, defensa);
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = ataque - objetivo.defensa;
        if (dano > 0) {
            objetivo.defender(dano);
            System.out.println(nombre + " dispara una flecha a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        }
    }

    @Override
    public void defender(int dano) {
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Vida restante: " + puntosDeVida);
    }
}
