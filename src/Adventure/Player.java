package Adventure;

import java.util.ArrayList;

public class Player {

  private final ArrayList<Item> inventory = new ArrayList<>();
  private Room currentRoom;
  private String name;

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  void showInventory() {
    System.out.println("You have the following things in your inventory:");
    for (int i = 0; i < inventory.size(); i++) {

      System.out.println(inventory.get(i).getLangtNavn());

    }
    if (inventory.size() == 0) System.out.println("You have no items in your inventory.");
  }

  void goWest() {
    if (currentRoom.getWest() == currentRoom) System.out.println("You cannot go this way");
    else {
      setCurrentRoom(currentRoom.getWest());
      currentRoom.addToCounter();
      look();
    }
  }

  void goSouth() {
    if (currentRoom.getSouth() == currentRoom) System.out.println("You cannot go this way");
    else {
      setCurrentRoom(currentRoom.getSouth());
      currentRoom.addToCounter();
      look();
    }
  }

  void goNorth() {
    if (currentRoom.getNorth() == currentRoom) System.out.println("You cannot go this way");
    else {
      setCurrentRoom(currentRoom.getNorth());
      currentRoom.addToCounter();
      look();
    }
  }

  void goEast() {
    if (getCurrentRoom().getEast() == getCurrentRoom()) System.out.println("You cannot go this way");
    else {
      setCurrentRoom(getCurrentRoom().getEast());
      currentRoom.addToCounter();
      look();
    }
  }

  void look() {
    System.out.println(getCurrentRoom().getNavn());
    System.out.println("You have been in this room " + getCurrentRoom().getCounter() + " time(s)");
    if (getCurrentRoom().getRoomItems().size() > 0) {
      System.out.println("This room has the following items: ");
      for (int k = 0; k < getCurrentRoom().getRoomItems().size(); k++) {
        System.out.println(getCurrentRoom().getRoomItems().get(k).getLangtNavn());
      }
    } else System.out.println("There are no items in this room.");
  }

  void takeItem(String targetName) {

    boolean loop = true;
    boolean foundItem = false;
    while (loop) {
      for (int i = 0; i < getCurrentRoom().getRoomItems().size(); i++) {
        if (targetName.toUpperCase().equals(getCurrentRoom().getRoomItems().get(i).getLangtNavn())) {
          inventory.add(getCurrentRoom().getRoomItems().get(i));
          System.out.println("You picked up a " + getCurrentRoom().getRoomItems().get(i).getLangtNavn()
              + "! " + getCurrentRoom().getRoomItems().get(i).getNavn() + " added to inventory.");
          getCurrentRoom().removeItem(i);
          foundItem = true;
        }
      }
      if (!foundItem) {
        System.out.println("Either there is no item or you typed in the item name wrong. " +
            "\nRemember to type in the full name of the item you want to pick up!");
      }
      loop = false;
    }
  }

  void dropItem(String targetName) {
    boolean dropItem = true;
    for (int i = 0; i < inventory.size(); i++) {
      if (targetName.toUpperCase().equals(inventory.get(i).getLangtNavn())) {
        getCurrentRoom().addItem(inventory.get(i));
        System.out.println("You dropped a " + inventory.get(i).getLangtNavn() + " in " +
            getCurrentRoom().getNavn() + ".\n" + inventory.get(i).getLangtNavn() +
            " has been removed from inventory.");
        inventory.remove(i);
        dropItem = false;
      }
    }
    if (dropItem)
      System.out.println("Either there is no item or you typed in the item name wrong. " +
          "\nRemember to type in the full name of the item you want to drop!");
  }
}