public abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected int ataque;
    protected int defensa;

    public Personaje(String nombre, int puntosDeVida, int ataque, int defensa) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public abstract void atacar(Personaje objetivo);
    public abstract void defender(int dano);

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
