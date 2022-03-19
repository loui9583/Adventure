package Adventure;

public class Map {

  ItemManager itemManager = new ItemManager();

  Player player = new Player();

  Room room1 = new Room("Room 1");
  Room room2 = new Room("Room 2");
  Room room3 = new Room("Room 3");
  Room room4 = new Room("Room 4");
  Room room5 = new Room("Room 5");
  Room room6 = new Room("Room 6");
  Room room7 = new Room("Room 7");
  Room room8 = new Room("Room 8");
  Room room9 = new Room("Room 9");


  Map() {
    room1.roomItems.add(itemManager.divineSword) ;
    room2.roomItems.add(itemManager.greatPotion) ;
    room3.roomItems.add(itemManager.greatShield) ;
    room4.roomItems.add(itemManager.divineShield);
    room5.roomItems.add(itemManager.map)         ;
    room5.roomItems.add(itemManager.godStaff)    ;
    room6.roomItems.add(itemManager.sorcererStaff) ;
    room7.roomItems.add(itemManager.strengthPotion) ;
    room8.roomItems.add(itemManager.magicPotion);
    room9.roomItems.add(itemManager.healingPotion) ;
  }

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
  /*
  Metode til at kunne 'take' et item op med kortNavn, så hvis man fx. fandt et
  "Divine Sword" kunne man nøjes med at skrive "Sword" for at tage det,
  men den metode gav ikke mening fordi man ikke kunne vælge hvilket item man vil
  'take' hvis der var flere af samme slags, fx hvis der var både et
  "Great Shield" og et "Divine Shield".
  .
  .
  .
  void lookForItem(String targetName) {
    for (int i = 0; i < player.currentRoom.roomItems.size(); i++) {
      if (targetName.equals(player.currentRoom.roomItems.get(i).getNavn())) {
        player.inventory.add(player.currentRoom.roomItems.get(i));
        System.out.println("You found a "+ player.currentRoom.roomItems.get(i).getLangtNavn()+"! "+ player.currentRoom.roomItems.get(i).getLangtNavn()+" added to inventory.");
        player.currentRoom.roomItems.remove(i);
        break;
      }
    }
  }
  */

  void lookForItem(String targetName) {

    boolean loop = true;
    boolean foundItem = false;
    while (loop) {
      for (int i = 0; i < player.currentRoom.roomItems.size(); i++) {
        if (targetName.toUpperCase().equals(player.currentRoom.roomItems.get(i).getLangtNavn())) {
          player.inventory.add(player.currentRoom.roomItems.get(i));
          System.out.println("You picked up a " + player.currentRoom.roomItems.get(i).getLangtNavn() + "! " + player.currentRoom.roomItems.get(i).getLangtNavn() + " added to inventory.");
          player.currentRoom.roomItems.remove(i);
          foundItem = true;
        }
      }
      if (!foundItem) {
        System.out.println("Either there is no item or you typed in the item name wrong. \nRemember to type in the full name of the item you want to pick up!");
      }
      loop = false;
    }
  }


  void dropItem(String targetName) {
boolean dropItem = true;
    for (int i = 0; i < player.inventory.size(); i++) {
      if (targetName.toUpperCase().equals(player.inventory.get(i).getLangtNavn())) {
        player.currentRoom.roomItems.add(player.inventory.get(i));
        System.out.println("You dropped a " + player.inventory.get(i).getLangtNavn() + " in " + player.currentRoom.navn + ".\n" + player.inventory.get(i).getLangtNavn() + " has been removed from inventory.");
        player.inventory.remove(i);
        dropItem=false;
      }
    }
    if (dropItem) System.out.println("Either there is no item or you typed in the item name wrong. \nRemember to type in the full name of the item you want to drop!");
  }
}





