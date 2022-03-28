package Adventure;

public class Weapon extends Item{

  Weapon(String kortNavn, String langtNavn, int damage) {
    super(kortNavn, langtNavn);
    setDamage(damage);
  }


}
