package Adventure;

import java.util.Scanner;

public class UI {

  UI(){
    int i = 0;
    String help = "Instructions: \n Enter N to go north. Enter S to go south. Enter W to go west. Enter E to go east.\nAdditionally, you can write HELP to view instructions again, and write EXIT to exit the program. ";
    Map.setCurrentRoom(Creator.room1);
    Player.currentRoom.addToCounter();
    System.out.println("Welcome to the game!\n" + help);
    boolean loop = true;
    while (loop) {
      String gameFlow = new Scanner(System.in).nextLine();
      gameFlow = gameFlow.toUpperCase();
      switch (gameFlow) {
        case "E" -> {
          if (Player.currentRoom.east == Player.currentRoom) System.out.println("du kan ikke gå denne vej");
          Map.setCurrentRoom(Player.currentRoom.east);
          Player.currentRoom.addToCounter();
        }
        case "W" -> {
          if (Player.currentRoom.west == Player.currentRoom) System.out.println("du kan ikke gå denne vej");
          Map.setCurrentRoom(Player.currentRoom.west);
          Player.currentRoom.addToCounter();
        }
        case "S" -> {
          if (Player.currentRoom.south == Player.currentRoom) System.out.println("du kan ikke gå denne vej");
          Map.setCurrentRoom(Player.currentRoom.south);
          Player.currentRoom.addToCounter();
        }
        case "N" -> {
          if (Player.currentRoom.north == Player.currentRoom) System.out.println("du kan ikke gå denne vej");
          Map.setCurrentRoom(Player.currentRoom.north);
          Player.currentRoom.addToCounter();
        }
        case "EXIT" -> loop = false;
        case "HELP" -> System.out.println(help);
        case "LOOK" -> {
          System.out.println(Player.currentRoom.navn);
          System.out.println("Du har været i dette rum " + Player.currentRoom.counter + " gange");
        }
        default -> {
          System.out.println("Wrong input.");
          i++;
          if (i>2) {System.out.println(help);
          i = 0;}
        }
      }
    }
  }
}
