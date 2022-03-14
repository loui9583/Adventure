public class Room6 extends Rooms {

  String north() {

    currentRoom = new Room3();
    return "";
  }

  String south() {
    currentRoom = new Room9();
    return "";
  }

  Room6() {
    Rooms.navn="Room 6";
    System.out.println(navn);
  }
}
