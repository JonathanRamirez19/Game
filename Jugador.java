public class Jugador extends Personaje {
    // Clase que representa al jugador, incluye mecánicas de ataque y curación.
    private int pociones; // Cantidad de pociones disponibles para curarse.

    public Jugador(String nombre, int puntosDeVida, int ataque, int defensa, int pociones) {
        // Constructor que inicializa los atributos del jugador, incluyendo las pociones.
        super(nombre, puntosDeVida, ataque, defensa);
        this.pociones = pociones;
    }

    @Override
    public void atacar(Personaje objetivo) {
        // Método que implementa el ataque del jugador.
        // Calcula el daño basado en el ataque del jugador menos la defensa del objetivo.
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
        // Método que permite al jugador recibir daño y reducir sus puntos de vida.
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Puntos de vida restantes: " + puntosDeVida);
    }

    public void curar() {
        // Método que permite al jugador curarse usando una poción, si tiene disponible.
        if (pociones > 0) {
            puntosDeVida += 20; // Recupera 20 puntos de vida.
            pociones--; // Reduce la cantidad de pociones disponibles.
            System.out.println(nombre + " usa una poción. Vida actual: " + puntosDeVida);
        } else {
            System.out.println(nombre + " no tiene pociones restantes.");
        }
    }
}
