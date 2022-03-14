public class Room7 extends Rooms {
  Room7() {
    Rooms.navn = "Room 7";
    System.out.println(navn);
  }

  String north() {

    currentRoom = new Room4();
    return "";
  }

  String east() {
    currentRoom = new Room8();
    return "";
  }
}
