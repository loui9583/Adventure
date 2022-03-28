package Adventure;

public class Enemy extends Player{


  Enemy(int health,String navn, Item weapon){
  setHealth(health);
  setName(navn);
  getInventory().add(weapon);
  }

}
