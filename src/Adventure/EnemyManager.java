package Adventure;

public class EnemyManager {

ItemManager itemManager = new ItemManager();

  private Enemy frostWolf = new Enemy(50,"Frost Wolf",itemManager.getFist());
  public Enemy getFrostWolf() {
    return frostWolf;
  }
}
