import java.util.Scanner;

public class Juego {
    private Jugador jugador;
    private Personaje enemigo;

    public Juego() {
        jugador = new Jugador("Héroe", 100, 20, 10, 3);
        enemigo = new Orco("Orco Guerrero", 80, 25, 5); // Puedes cambiar a Esqueleto aquí si quieres
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Comienza el combate!");
        while (jugador.estaVivo() && enemigo.estaVivo()) {
            System.out.println("\nTurno del jugador:");
            System.out.println("1. Atacar");
            System.out.println("2. Curar");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    jugador.atacar(enemigo);
                    break;
                case 2:
                    jugador.curar();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            if (enemigo.estaVivo()) {
                System.out.println("\nTurno del enemigo:");
                enemigo.atacar(jugador);
            }
        }

        if (jugador.estaVivo()) {
            System.out.println("\n¡Ganaste la batalla!");
        } else {
            System.out.println("\nHas sido derrotado...");
        }
    }
}
