package Adventure;

import java.util.ArrayList;

public class Room {



  ArrayList<Item> roomItems = new ArrayList<>();

  Room west;
  Room east;
  Room north;
  Room south;
  String navn;
  int counter = 0;

  Room(String navn) {
    this.navn = navn;
  }

  void setWest(Room room) {
    this.west = room;
  }

  void setEast(Room room) {
    this.east = room;
  }

  void setNorth(Room room) {
    this.north = room;
  }

  void setSouth(Room room) {
    this.south = room;
  }

  void addToCounter() {
    counter += 1;
  }
}