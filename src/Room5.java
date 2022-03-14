public class Room5 extends Rooms{


  String south (){
    currentRoom=new Room8();
    return "";
  }

  Room5(){
    Rooms.navn="Room 5";
    System.out.println(navn);
}
}
