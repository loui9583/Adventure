package Adventure;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Room {

  Scanner scanner = new Scanner(System.in);
  private final String navn;
  private final ArrayList<Item> roomItems = new ArrayList<>();
  private ArrayList<Enemy> enemies = new ArrayList<>();



  private Room west ;
  private Room east ;
  private Room north;
  private Room south;
  private int counter = 0;


  Room(String navn) {
    this.navn = navn;
  }

  public void addItem(Item item) {
    this.roomItems.add(item);
  }
  public void addEnemy(Enemy enemy) {
    this.enemies.add(enemy);
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

  void fight(Player player, Enemy enemy){
    int weaponIndex=0;
    if (enemy.getHealth()>0)System.out.println("A WILD "+enemy.getName()+" appeared! Prepare to fight!");
while (player.getHealth()>0&&enemy.getHealth()>0) {
  player.eatSuccess=false;

  boolean playerTurn = true;
  while (playerTurn) {
    System.out.println("Press A to attack. Press E to equip a new weapon. Press C to consume(food or potion). Press I to show inventory.");
    String fightMenu = scanner.nextLine().toUpperCase();
    switch (fightMenu) {
      case "A" -> {player.attack(player.getInventory().get(weaponIndex), enemy); playerTurn=false;}
      case "E" -> {
        System.out.println("Type the name of the weapon you want to equip, or type 'cancel' to cancel");
        player.showInventory();
        boolean loop = true;
        while (loop) {
          String search = scanner.nextLine();
          if (search.toUpperCase().equals("CANCEL")) loop=false;
          for (int i = 0; i < player.getInventory().size(); i++) {
            if (search.toUpperCase().equals(player.getInventory().get(i).getLangtNavn())) {
              weaponIndex = i;
              loop = false;
            }
          }

          if (loop) System.out.println("Weapon not found. Try again or cancel.");
        }
      }
      case "C" -> {
        System.out.println("Type in the name of the item you want to eat, or type CANCEL.");
        player.eat(scanner.nextLine().toUpperCase());
        if (player.eatSuccess) playerTurn=false;
      }
      case "I" -> player.showInventory();
    }
  }




      enemy.attack(enemy.getInventory().get(0),player);
  if (enemy.getHealth()<=0) System.out.println("You have defeated the "+ enemy.getName()+"\n\n");

  }
  }


  public ArrayList<Enemy> getEnemies() {
    return enemies;
  }
}