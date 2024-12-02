public class Orco extends Personaje {
    public Orco(String nombre, int puntosDeVida, int ataque, int defensa) {
        super(nombre, puntosDeVida, ataque, defensa);
    }

    @Override
    public void atacar(Personaje objetivo) {
        int dano = (ataque * 2) - objetivo.defensa;
        if (dano > 0) {
            objetivo.defender(dano);
            System.out.println(nombre + " golpea brutalmente a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        }
    }

    @Override
    public void defender(int dano) {
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Vida restante: " + puntosDeVida);
    }
}
