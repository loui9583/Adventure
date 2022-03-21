package Adventure;

import java.util.ArrayList;

public class Room {

  private final String navn;
  private final ArrayList<Item> roomItems = new ArrayList<>();
  private Room west;
  private Room east;
  private Room north;
  private Room south;
  private int counter = 0;

  Room(String navn) {
    this.navn = navn;

  }

  public void addItem(Item item) {
    this.roomItems.add(item);
  }

  public void removeItem(int i) {
    this.roomItems.remove(i);
  }

  public ArrayList<Item> getRoomItems() {
    return roomItems;
  }

  public int getCounter() {
    return counter;
  }

  public String getNavn() {
    return navn;
  }

  public Room getEast() {
    return east;
  }

  void setEast(Room room) {
    this.east = room;
  }

  public Room getNorth() {
    return north;
  }

  void setNorth(Room room) {
    this.north = room;
  }

  public Room getSouth() {
    return south;
  }

  void setSouth(Room room) {
    this.south = room;
  }

  public Room getWest() {
    return west;
  }

  void setWest(Room room) {
    this.west = room;
  }

  void addToCounter() {
    counter += 1;
  }
}