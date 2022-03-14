public class Room1 extends Rooms {


  Room1() {
    Rooms.navn = "Room 1";
    System.out.println(navn);
  }

  String east() {

    currentRoom = new Room2();
    return "";
  }

  String south() {
    currentRoom = new Room4();
    return "";
  }
}