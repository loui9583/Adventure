public class Room4 extends Rooms {
  Room4() {
    Rooms.navn = "Room 4";
    System.out.println(navn);
  }

  String north() {

    currentRoom = new Room1();
    return "";
  }

  String south() {
    currentRoom = new Room7();
    return "";
  }
}
