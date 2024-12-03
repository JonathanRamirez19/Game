import java.util.Random;
import java.util.Scanner;

/**
 * Clase principal que gestiona el flujo del juego.
 * Permite la interacción entre un jugador y un enemigo seleccionado aleatoriamente.
 * Inicializa al jugador y selecciona un enemigo de manera aleatoria
 * 
 */
 public class Juego {
     private Jugador jugador;
     private Personaje enemigo;
 
     public Juego() {
         jugador = new Jugador("Tai Lung", 150, 20, 15, 3);
 
         Random random = new Random();
         int enemigoAleatorio = random.nextInt(3); 
 
         switch (enemigoAleatorio) {
             case 0:
                 enemigo = new Orco("Orco Guerrero", 80, 20, 5);
                 break;
             case 1:
                 enemigo = new Esqueleto("Esqueleto Arquero", 70, 15, 10);
                 break;
             case 2:
                 enemigo = new MaestroShifu("Maestro Shifu", 160, 40, 15);
                 break;
         }
     }
 
     public void iniciar() {
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
             System.out.println("\n¡Ganaste la batalla contra " + enemigo.getNombre() + "!");
         } else {
             mostrarMensajeDeMuerte(jugador);
         }
     }

     private void mostrarMensajeDeMuerte(Personaje personaje) {
         if (personaje instanceof Jugador) {
             System.out.println("\nEl "+ enemigo.getNombre() + " Esperaba algo mejor de Tai Lung");
         } else if (personaje instanceof Orco) {
             System.out.println("\nEl Orco ha sido derrotado... ¡Su gran fuerza no fue suficiente!");
         } else if (personaje instanceof Esqueleto) {
             System.out.println("\nEl Esqueleto ha caído, su hueso ya no pudo resistir más...");
         } else if (personaje instanceof MaestroShifu) {
             System.out.println("\nNO... NO NO NO!!! Maestro Shifu, por favor, no se muera.");
             System.out.println("NO ESTOY MUERTO IDIOTA!! Se me bajo la presion, traeme una coca");
         }
     }
 }
 