import java.util.Scanner;

public class Adventure {
  public static void main(String[] args) {

    new Adventure().go();

  }

  void go() {
    String help = "Instructions: \n Enter N to go north. Enter S to go south. Enter W to go west. Enter E to go east.\nAdditionally, you can write HELP to view instructions again, and write EXIT to exit the program. ";
    Rooms.currentRoom = new Room1();
    System.out.println("Welcome to the game!\n" + help);
    boolean loop = true;
    while (loop == true) {
      String menu = new Scanner(System.in).nextLine();
      menu=menu.toUpperCase();
      switch (menu) {
        case "E":
          Rooms.currentRoom.east();
          break;
        case "W":
          Rooms.currentRoom.west();
          break;
        case "S":
          Rooms.currentRoom.south();
          break;
        case "N":
          Rooms.currentRoom.north();
          break;
        case "EXIT":
          loop = false;
          break;
        case "HELP":
          System.out.println(help);
          break;
        case "LOOK":
          System.out.println(Rooms.navn);

      }
    }
  }
}




