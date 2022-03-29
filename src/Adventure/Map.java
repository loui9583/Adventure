package Adventure;

public class Map {

  ItemManager itemManager =   new ItemManager();
  EnemyManager enemyManager = new EnemyManager();

  private final Room room1 = new Room("ROOM 1");
  private final Room room2 = new Room("ROOM 2");
  private final Room room3 = new Room("ROOM 3");
  private final Room room4 = new Room("ROOM 4");
  private final Room room5 = new Room("ROOM 5");
  private final Room room6 = new Room("ROOM 6");
  private final Room room7 = new Room("ROOM 7");
  private final Room room8 = new Room("ROOM 8");
  private final Room room9 = new Room("ROOM 9");

  Map() {

    room2.addEnemy(enemyManager.getFrostWolf());

    room1.addItem(itemManager.getDivineSword())   ;
    room1.addItem(itemManager.getMeatSkewer())    ;
    room2.addItem(itemManager.getStrengthPotion());
    room3.addItem(itemManager.getGreatShield())   ;
    room4.addItem(itemManager.getDivineShield())  ;
    room5.addItem(itemManager.getMap())           ;
    room5.addItem(itemManager.getGreatPotion())   ;
    room5.addItem(itemManager.getGodStaff())      ;
    room6.addItem(itemManager.getSorcererStaff()) ;
    room7.addItem(itemManager.getStrengthPotion());
    room8.addItem(itemManager.getMagicPotion())   ;
    room9.addItem(itemManager.getHealingPotion()) ;
    room1.addItem(itemManager.getCrossBow())      ;

    room1.setEast(room2)  ;
    room1.setSouth(room4) ;

    room2.setWest(room1)  ;
    room2.setEast(room3)  ;

    room3.setWest(room2)  ;
    room3.setSouth(room6) ;

    room4.setNorth(room1) ;
    room4.setSouth(room7) ;

    room5.setSouth(room8) ;
    room5.setWest(room5)  ;

    room6.setNorth(room3) ;
    room6.setSouth(room9) ;

    room7.setNorth(room4) ;
    room7.setEast(room8)  ;

    room8.setNorth(room5) ;
    room8.setWest(room7)  ;
    room8.setEast(room9);

    room9.setNorth(room6) ;
    room9.setWest(room8)  ;

  }

  Room getRoom1() {
    return room1;
  }
}





