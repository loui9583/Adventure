public class Room5 extends Rooms {


  Room5() {
    Rooms.navn = "Room 5";
    System.out.println(navn);
  }

  String south() {
    currentRoom = new Room8();
    return "";
  }
}
