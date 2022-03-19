package Adventure;

import java.util.ArrayList;

public class Player {
  ArrayList<Item> inventory = new ArrayList<>();
  Room currentRoom;

  void showInventory() {
    System.out.println("You have the following things in your inventory:");
    for (int i = 0; i < inventory.size(); i++) {

      System.out.println(inventory.get(i).getLangtNavn());

    }
    if (inventory.size() == 0) System.out.println("You have no items in your inventory.");
  }
}
