package Adventure;

import java.util.Scanner;

public class UI {
  Map map = new Map();

  UI() {
    int i = 0;
    String help = """
        Instructions:
        Enter N to go north.
        Enter S to go south.
        Enter W to go west.
        Enter E to go east.
        Additionally, you can write HELP to view instructions again, and write EXIT to exit the program. ";
        """;

    map.setCurrentRoom(map.room1);
    map.player.currentRoom.addToCounter();
    System.out.println("Welcome to the game!\n" + help);
    boolean loop = true;
    while (loop) {
      String gameFlow = new Scanner(System.in).nextLine();
      gameFlow = gameFlow.toUpperCase();
      switch (gameFlow) {
        case "E" -> {
          if (map.player.currentRoom.east == map.player.currentRoom) System.out.println("du kan ikke gå denne vej");
          map.setCurrentRoom(map.player.currentRoom.east);
          map.player.currentRoom.addToCounter();
        }
        case "W" -> {
          if (map.player.currentRoom.west == map.player.currentRoom) System.out.println("du kan ikke gå denne vej");
          map.setCurrentRoom(map.player.currentRoom.west);
          map.player.currentRoom.addToCounter();
        }
        case "S" -> {
          if (map.player.currentRoom.south == map.player.currentRoom) System.out.println("du kan ikke gå denne vej");
          map.setCurrentRoom(map.player.currentRoom.south);
          map.player.currentRoom.addToCounter();
        }
        case "N" -> {
          if (map.player.currentRoom.north == map.player.currentRoom) System.out.println("du kan ikke gå denne vej");
          map.setCurrentRoom(map.player.currentRoom.north);
          map.player.currentRoom.addToCounter();
        }
        case "EXIT" -> loop = false;
        case "HELP" -> System.out.println(help);
        case "LOOK" -> {
          System.out.println(map.player.currentRoom.navn);
          System.out.println("Du har været i dette rum " + map.player.currentRoom.counter + " gange");
        }
        default -> {
          System.out.println("Wrong input.");
          i++;
          if (i > 2) {
            System.out.println(help);
            i = 0;
          }
        }
      }
    }
  }
}
