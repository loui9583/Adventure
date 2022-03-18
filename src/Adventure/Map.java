package Adventure;

public class Map {
  Player player = new Player();

  Room room1 = new Room("Rum 1");
  Room room2 = new Room("Rum 2");
  Room room3 = new Room("Rum 3");
  Room room4 = new Room("Rum 4");
  Room room5 = new Room("Rum 5");
  Room room6 = new Room("Rum 6");
  Room room7 = new Room("Rum 7");
  Room room8 = new Room("Rum 8");
  Room room9 = new Room("Rum 9");


  public void setCurrentRoom(Room room) {
    player.currentRoom = room;

    room1.setEast(room2);
    room1.setSouth(room4);
    room1.setWest(room1);
    room1.setNorth(room1);

    room2.setWest(room1);
    room2.setEast(room3);
    room2.setNorth(room2);
    room2.setSouth(room2);

    room3.setWest(room2);
    room3.setSouth(room6);
    room3.setNorth(room3);
    room3.setEast(room3);

    room4.setNorth(room1);
    room4.setSouth(room7);
    room4.setWest(room4);
    room4.setEast(room4);

    room5.setSouth(room8);
    room5.setWest(room5);
    room5.setEast(room5);
    room5.setNorth(room5);

    room6.setNorth(room3);
    room6.setSouth(room9);
    room6.setWest(room6);
    room6.setEast(room6);

    room7.setNorth(room4);
    room7.setEast(room8);
    room7.setWest(room7);
    room7.setSouth(room7);

    room8.setNorth(room5);
    room8.setWest(room7);
    room8.setEast(room9);
    room8.setSouth(room8);

    room9.setNorth(room6);
    room9.setWest(room8);
    room9.setSouth(room9);
    room9.setEast(room9);
  }

  Map(){
    room1.roomItems.add(room1.itemManager.sword);
    room1.roomItems.add(room1.itemManager.potion);



  }
  void lookForItem(String targetName) {
    for (int i = 0; i < player.currentRoom.roomItems.size(); i++) {
      if (targetName.equals(player.currentRoom.roomItems.get(i).getNavn())) {
        player.inventory.add(player.currentRoom.roomItems.get(i));

        System.out.println("You found a "+ player.currentRoom.roomItems.get(i).getLangtNavn()+"! "+room1.roomItems.get(i).getLangtNavn()+" added to inventory.");
        player.currentRoom.roomItems.remove(i);
        break;
      }
    }

  }


}




