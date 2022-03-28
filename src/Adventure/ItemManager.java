package Adventure;

public class ItemManager {

  private final Item divineSword   = new Weapon("SWORD" , "DIVINE SWORD", 25)   ;
  private final Item fist          = new Weapon("FIST"  , "FIST"        ,  5)   ;
  private final Item basicSword    = new Weapon("SWORD" , "BASIC SWORD" , 40)   ;
  private final Item greatPotion   = new Food  ("POTION", "GREAT POTION",50)       ;
  private final Item greatShield   = new Item  ("SHIELD", "GREAT SHIELD")       ;
  private final Item divineShield  = new Item  ("SHIELD", "DIVINE SHIELD")      ;
  private final Item map           = new Item  ("MAP"   , "MAP")                ;
  private final Item sorcererStaff = new Weapon  ("STAFF" , "SORCERER STAFF", 35)     ;
  private final Item godStaff      = new Weapon  ("STAFF" , "GOD STAFF",60)          ;
  private final Item healingPotion = new Food  ("POTION", "HEALING POTION",20)     ;
  private final Item strengthPotion= new Item  ("POTION", "STRENGTH POTION")    ;
  private final Item magicPotion   = new Item  ("POTION", "MAGIC POTION")       ;
  private final Item meatSkewer    = new Food  ("FOOD"  , "MEAT SKEWER",10)     ;

  public Item getFist() {
    return fist;
  }

  public Item getBasicSword() {
    return basicSword;
  }

  public Item getMeatSkewer() {
    return meatSkewer;
  }

  public Item getDivineShield()  {
    return divineShield;
  }

  public Item getDivineSword()   {
    return divineSword;
  }

  public Item getGodStaff()      {
    return godStaff;
  }

  public Item getGreatPotion()   {
    return greatPotion;
  }

  public Item getGreatShield()   {
    return greatShield;
  }

  public Item getHealingPotion() {
    return healingPotion;
  }

  public Item getMagicPotion()   {
    return magicPotion;
  }

  public Item getMap()           {
    return map;
  }

  public Item getSorcererStaff() {
    return sorcererStaff;
  }

  public Item getStrengthPotion(){
    return strengthPotion;
  }
}
