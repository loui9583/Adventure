import java.util.Scanner;

public class Adventure {
  static Room room1 = new Room("Rum 1");
  static Room room2 = new Room("Rum 2");
  static Room room3 = new Room("Rum 3");
  static Room room4 = new Room("Rum 4");
  static Room room5 = new Room("Rum 5");
  static Room room6 = new Room("Rum 6");
  static Room room7 = new Room("Rum 7");
  static Room room8 = new Room("Rum 8");
  static Room room9 = new Room("Rum 9");


  static Room currentRoom;

  static public Room getCurrentRoom() {
    return currentRoom;
  }

  static public void setCurrentRoom(Room currentroom) {
    currentRoom = currentroom;
  }

  public static void main(String[] args) {

    new Adventure().go();

  }

  void go() {

    room1.setEast(room2);
    room1.setSouth(room4);
    room1.setWest(room1);
    room1.setNorth(room1);

    room2.setWest(room1);
    room2.setEast(room3);
    room2.setNorth(room2);
    room2.setSouth(room2);

    room3.setWest(room2);
    room3.setSouth(room6);
    room3.setNorth(room3);
    room3.setEast(room3);

    room4.setNorth(room1);
    room4.setSouth(room7);
    room4.setWest(room4);
    room4.setEast(room4);

    room5.setSouth(room8);
    room5.setWest(room5);
    room5.setEast(room5);
    room5.setNorth(room5);

    room6.setNorth(room3);
    room6.setSouth(room9);
    room6.setWest(room6);
    room6.setEast(room6);

    room7.setNorth(room4);
    room7.setEast(room8);
    room7.setWest(room7);
    room7.setSouth(room7);

    room8.setNorth(room5);
    room8.setWest(room7);
    room8.setEast(room9);
    room8.setSouth(room8);

    room9.setNorth(room6);
    room9.setWest(room8);
    room9.setSouth(room9);
    room9.setEast(room9);

    String help = "Instructions: \n Enter N to go north. Enter S to go south. Enter W to go west. Enter E to go east.\nAdditionally, you can write HELP to view instructions again, and write EXIT to exit the program. ";
    setCurrentRoom(room1);
    currentRoom.addtocounter();
    System.out.println("Welcome to the game!\n" + help);
    boolean loop = true;
    while (loop == true) {
      String menu = new Scanner(System.in).nextLine();
      menu = menu.toUpperCase();
      switch (menu) {
        case "E":
          if (currentRoom.east == currentRoom) System.out.println("du kan ikke gå denne vej");
          setCurrentRoom(currentRoom.east);
          currentRoom.addtocounter();

          break;
        case "W":
          if (currentRoom.west == currentRoom) System.out.println("du kan ikke gå denne vej");
          setCurrentRoom(currentRoom.west);
          currentRoom.addtocounter();
          break;

        case "S":
          if (currentRoom.south == currentRoom) System.out.println("du kan ikke gå denne vej");
          setCurrentRoom(currentRoom.south);
          currentRoom.addtocounter();
          break;

        case "N":
          if (currentRoom.north == currentRoom) System.out.println("du kan ikke gå denne vej");
          setCurrentRoom(currentRoom.north);
          currentRoom.addtocounter();
          break;

        case "EXIT":
          loop = false;
          break;

        case "HELP":
          System.out.println(help);
          break;

        case "LOOK":
          System.out.println(currentRoom.navn);
          System.out.println("Du har været i dette rum " + currentRoom.counter + " gange");
        default:
          System.out.println("Wrong input");
      }
    }
  }
}
