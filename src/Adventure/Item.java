package Adventure;

public class Item {

  private final String langtNavn;
  private final String navn;
  private int health=0;
  private int damage=0;
  private int ammo;
  private int ammoSubt;



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

  public int getAmmo() {
    return ammo;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

  public int getAmmoSubt() {
    return ammoSubt;
  }

  public void setAmmoSubt(int ammoSubt) {
    this.ammoSubt = ammoSubt;
  }
}

