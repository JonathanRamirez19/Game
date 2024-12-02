public class Orco extends Personaje {
    // Clase que representa un enemigo tipo Orco, especializado en ataques de fuerza bruta.

    public Orco(String nombre, int puntosDeVida, int ataque, int defensa) {
        // Constructor que inicializa los atributos del Orco.
        super(nombre, puntosDeVida, ataque, defensa);
    }

    @Override
    public void atacar(Personaje objetivo) {
        // Método que implementa el ataque del Orco con un daño fijo de 20.
        int dano = 20; // Daño fijo del ataque del Orco.
        objetivo.defender(dano);
        System.out.println(nombre + " golpea brutalmente a " + objetivo.getNombre() + " causando " + dano + " de daño.");
    }

    @Override
    public void defender(int dano) {
        // Método que permite al Orco recibir daño y reducir sus puntos de vida.
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Vida restante: " + puntosDeVida);
    }
}
