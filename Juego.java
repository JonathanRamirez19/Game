import java.util.Random;
import java.util.Scanner;

public class Juego {
    private Jugador jugador;
    private Personaje enemigo;

    public Juego() {
        // Inicializa al jugador y selecciona un enemigo de manera aleatoria
        jugador = new Jugador("Héroe", 100, 20, 10, 3);

        // Selección aleatoria de enemigos
        Random random = new Random();
        int enemigoAleatorio = random.nextInt(3); // 0, 1, o 2

        switch (enemigoAleatorio) {
            case 0:
                enemigo = new Orco("Orco Guerrero", 80, 20, 5);
                break;
            case 1:
                enemigo = new Esqueleto("Esqueleto Arquero", 70, 15, 10);
                break;
            case 2:
                enemigo = new MaestroShifu("Maestro Shifu", 60, 30, 15);
                break;
        }
    }

    public void iniciar() {
        // Lógica principal del juego, permite alternar entre turnos del jugador y del enemigo
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Comienza el combate contra " + enemigo.getNombre() + "!");
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
