package Adventure;

public class Item {

  private final String langtNavn;
  private final String navn;
  private int health=0;
  private int damage=0;

  Item(String kortNavn, String langtNavn) {
    this.navn = kortNavn;
    this.langtNavn = langtNavn;
  }

  public String getLangtNavn() {
    return langtNavn;
  }

  public String getNavn() {
    return navn;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

}

