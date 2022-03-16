package Adventure;

public class Map {



  static public void setCurrentRoom(Room room) {



    Player.currentRoom = room;

    Creator.room1.setEast(Creator.room2);
    Creator.room1.setSouth(Creator.room4);
    Creator.room1.setWest(Creator.room1);
    Creator.room1.setNorth(Creator.room1);

    Creator.room2.setWest(Creator.room1);
    Creator.room2.setEast(Creator.room3);
    Creator.room2.setNorth(Creator.room2);
    Creator.room2.setSouth(Creator.room2);

    Creator.room3.setWest(Creator.room2);
    Creator.room3.setSouth(Creator.room6);
    Creator.room3.setNorth(Creator.room3);
    Creator.room3.setEast(Creator.room3);

    Creator.room4.setNorth(Creator.room1);
    Creator.room4.setSouth(Creator.room7);
    Creator.room4.setWest(Creator.room4);
    Creator.room4.setEast(Creator.room4);

    Creator.room5.setSouth(Creator.room8);
    Creator.room5.setWest(Creator.room5);
    Creator.room5.setEast(Creator.room5);
    Creator.room5.setNorth(Creator.room5);

    Creator.room6.setNorth(Creator.room3);
    Creator.room6.setSouth(Creator.room9);
    Creator.room6.setWest(Creator.room6);
    Creator.room6.setEast(Creator.room6);

    Creator.room7.setNorth(Creator.room4);
    Creator.room7.setEast(Creator.room8);
    Creator.room7.setWest(Creator.room7);
    Creator.room7.setSouth(Creator.room7);

    Creator.room8.setNorth(Creator.room5);
    Creator.room8.setWest(Creator.room7);
    Creator.room8.setEast(Creator.room9);
    Creator.room8.setSouth(Creator.room8);

    Creator.room9.setNorth(Creator.room6);
    Creator.room9.setWest(Creator.room8);
    Creator.room9.setSouth(Creator.room9);
    Creator.room9.setEast(Creator.room9);

  }
}
