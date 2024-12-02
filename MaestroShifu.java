public class MaestroShifu extends Personaje {
    // Constructor para inicializar al personaje Maestro Shifu con sus atributos
    public MaestroShifu(String nombre, int puntosDeVida, int ataque, int defensa) {
        super(nombre, puntosDeVida, ataque, defensa);
    }

    @Override
    public void atacar(Personaje objetivo) {
        // Maestro Shifu usa un ataque calculado que depende del daño básico más su sabiduría
        int dano = (ataque + 5) - objetivo.defensa; 
        if (dano > 0) {
            objetivo.defender(dano);
            System.out.println(nombre + " usa su sabiduría y ataca a " + objetivo.getNombre() + " causando " + dano + " de daño.");
        }
    }

    @Override
    public void defender(int dano) {
        // Reducción de daño recibido en función de su habilidad defensiva
        puntosDeVida -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Vida restante: " + puntosDeVida);
    }
}
