package Adventure;

public class RangedWeapon extends Weapon {

  RangedWeapon(String kortNavn, String langtNavn, int damage,int ammo,int ammoSubt) {
    super(kortNavn, langtNavn, damage);
    setAmmo(ammo);
    setAmmoSubt(ammoSubt);
  }

}
