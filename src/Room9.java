public class Room9 extends Rooms {
  Room9() {
    Rooms.navn = "Room 9";
    System.out.println(navn);
  }

  String north() {

    currentRoom = new Room6();
    return "";
  }

  String west() {
    currentRoom = new Room8();
    return "";
  }
}
