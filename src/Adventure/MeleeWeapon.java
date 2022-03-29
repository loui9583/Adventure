package Adventure;

public class MeleeWeapon extends Weapon {
  MeleeWeapon(String kortNavn, String langtNavn, int damage) {
    super(kortNavn, langtNavn, damage);
  setAmmo(1);
  setAmmoSubt(0);
  }
}
