public class Esqueleto extends Personaje {
    // Clase que representa un enemigo tipo Esqueleto, especializado en ataques a distancia.

    public Esqueleto(String nombre, int puntosDeVida, int ataque, int defensa) {
        // Constructor que inicializa los atributos del Esqueleto
        super(nombre, puntosDeVida, ataque, defensa);
    }

    @Override
    public void atacar(Personaje objetivo) {
        // Método que implementa el ataque del Esqueleto. 
        // Realiza un cálculo de daño basado en su ataque menos la defensa del objetivo.
        int dano = ataque - objetivo.defensa;
        if (dano > 0) {
            objetivo.defender(dano);
            System.out.println(nombre + " dispara una flecha a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        }
    }

    @Override
    public void defender(int dano) {
        // Método que permite al Esqueleto recibir daño y reducir sus puntos de vida.
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Vida restante: " + puntosDeVida);
    }
}
