/** 
 * Este bloque define una subclase específica llamada MaestroShifu, que hereda de la clase abstracta Personaje.  
 * Representa un enemigo único con mayor sabiduría y un ataque ligeramente potenciado en el juego.
 */

public class MaestroShifu extends Personaje {
    public MaestroShifu(String nombre, int puntosDeVida, int ataque, int defensa) {
        super(nombre, puntosDeVida, ataque, defensa);
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = (ataque + 5) - objetivo.defensa; 
        if (dano > 0) {
            objetivo.defender(dano);
            System.out.println(nombre + " usa su sabiduría y ataca a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        }
    }

    @Override
    public void defender(int dano) {
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Vida restante: " + puntosDeVida);
    }
}
