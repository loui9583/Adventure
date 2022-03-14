public class Room3 extends Rooms {

  Room3() {
    Rooms.navn = "Room 3";
    System.out.println(navn);
  }

  String west() {

    currentRoom = new Room2();
    return "";
  }

  String south() {
    currentRoom = new Room6();
    return "";
  }
}
