package Adventure;

import java.util.ArrayList;

public class Player {
  ArrayList<Item> inventory = new ArrayList<>();
  Room currentRoom;
  void showInventory() {
    for (int i = 0; i < inventory.size(); i++) {

      System.out.println(inventory.get(i).getLangtNavn());

      }
    }

}
