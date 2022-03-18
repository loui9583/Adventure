package Adventure;

import java.util.Scanner;

public class UI {
  Map map = new Map();

  UI() {
    int i = 0;
    Scanner scanner = new Scanner(System.in);
    String help = """
        Instructions:
        Enter N to go north.
        Enter S to go south.
        Enter W to go west.
        Enter E to go east.
        Write "Look" to get information about the room you are in.
        Write "Search" and then type in the item you are searching for.
        Write "Inventory" to see the items you have picked up in your inventory.
        Additionally, you can write HELP to view instructions again, and write EXIT to exit the program. ";
        """;

    map.setCurrentRoom(map.room1);










    map.player.currentRoom.addToCounter();
    System.out.println("Welcome to the game!\n" + help);
    boolean loop = true;
    while (loop) {
      String gameFlow = scanner.nextLine();
      gameFlow = gameFlow.toUpperCase();
      switch (gameFlow) {
        case "E" -> {
          if (map.player.currentRoom.east == map.player.currentRoom) System.out.println("You cannot go this way");
          map.setCurrentRoom(map.player.currentRoom.east);
          map.player.currentRoom.addToCounter();
        }
        case "W" -> {
          if (map.player.currentRoom.west == map.player.currentRoom) System.out.println("You cannot go this way");
          map.setCurrentRoom(map.player.currentRoom.west);
          map.player.currentRoom.addToCounter();
        }
        case "S" -> {
          if (map.player.currentRoom.south == map.player.currentRoom) System.out.println("You cannot go this way");
          map.setCurrentRoom(map.player.currentRoom.south);
          map.player.currentRoom.addToCounter();
        }
        case "N" -> {
          if (map.player.currentRoom.north == map.player.currentRoom) System.out.println("You cannot go this way");
          map.setCurrentRoom(map.player.currentRoom.north);
          map.player.currentRoom.addToCounter();
        }
        case "EXIT" -> loop = false;
        case "HELP" -> System.out.println(help);
        case "LOOK" -> {
          System.out.println(map.player.currentRoom.navn);
          System.out.println("You have been in this room " + map.player.currentRoom.counter + " times");
        }
        case "SEARCH" -> map.lookForItem(scanner.nextLine());
        case "INVENTORY" -> map.player.showInventory();
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
