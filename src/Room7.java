public class Room7 extends Rooms{
  String north (){

    currentRoom=new Room4();
    return "";
  }
  String east (){
    currentRoom=new Room8();
    return "";
  }
  Room7(){
    Rooms.navn="Room 7";
    System.out.println(navn);
  }
}
