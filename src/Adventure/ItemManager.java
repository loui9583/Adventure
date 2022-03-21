package Adventure;

public class ItemManager {

  private  Item divineSword = new Item("SWORD", "DIVINE SWORD");
  private  Item greatPotion = new Item("POTION", "GREAT POTION");
  private  Item greatShield = new Item("SHIELD", "GREAT SHIELD");
  private  Item divineShield = new Item("SHIELD", "DIVINE SHIELD");
  private  Item map = new Item("MAP", "MAP");
  private  Item sorcererStaff = new Item("STAFF", "SORCERER STAFF");
  private  Item godStaff = new Item("STAFF", "GOD STAFF");
  private  Item healingPotion = new Item("POTION", "HEALING POTION");
  private  Item strengthPotion = new Item("POTION", "STRENGTH POTION");
  private  Item magicPotion = new Item("POTION", "MAGIC POTION");

  public Item getDivineShield() {
    return divineShield;
  }

  public Item getDivineSword() {
    return divineSword;
  }

  public Item getGodStaff() {
    return godStaff;
  }

  public Item getGreatPotion() {
    return greatPotion;
  }

  public Item getGreatShield() {
    return greatShield;
  }

  public Item getHealingPotion() {
    return healingPotion;
  }

  public Item getMagicPotion() {
    return magicPotion;
  }

  public Item getMap() {
    return map;
  }

  public Item getSorcererStaff() {
    return sorcererStaff;
  }

  public Item getStrengthPotion() {
    return strengthPotion;
  }
}
