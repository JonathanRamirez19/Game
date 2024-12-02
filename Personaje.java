public abstract class Personaje {
    // Clase base abstracta que representa un personaje en el juego.
    // Proporciona atributos y métodos comunes para el jugador y los enemigos.

    protected String nombre; // Nombre del personaje.
    protected int puntosDeVida; // Puntos de vida del personaje.
    protected int ataque; // Valor de ataque del personaje.
    protected int defensa; // Valor de defensa del personaje.

    public Personaje(String nombre, int puntosDeVida, int ataque, int defensa) {
        // Constructor que inicializa los atributos básicos de un personaje.
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    // Métodos abstractos que deben ser implementados por las subclases.
    public abstract void atacar(Personaje objetivo);
    public abstract void defender(int dano);

    public boolean estaVivo() {
        // Método que verifica si el personaje está vivo (tiene puntos de vida > 0).
        return puntosDeVida > 0;
    }

    public String getNombre() {
        // Método que devuelve el nombre del personaje.
        return nombre;
    }

    public int getPuntosDeVida() {
        // Método que devuelve los puntos de vida del personaje.
        return puntosDeVida;
    }
}
