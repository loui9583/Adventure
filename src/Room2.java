public class Room2 extends Rooms {


  Room2() {
    Rooms.navn = "Room 2";
    System.out.println(navn);
  }

  String west() {

    currentRoom = new Room1();
    return "";
  }

  String east() {
    currentRoom = new Room3();
    return "";
  }

}
