package Adventure;

import org.w3c.dom.ranges.Range;

public class ItemManager {

  private final MeleeWeapon divineSword   = new MeleeWeapon("SWORD" , "DIVINE SWORD", 25)   ;
  private final MeleeWeapon fist          = new MeleeWeapon("FIST"  , "FIST"        ,  5)   ;
  private final MeleeWeapon basicSword    = new MeleeWeapon("SWORD" , "BASIC SWORD" , 40)   ;
  private final Food greatPotion   = new Food  ("POTION", "GREAT POTION",50)       ;
  private final Item greatShield   = new Item  ("SHIELD", "GREAT SHIELD")       ;
  private final Item divineShield  = new Item  ("SHIELD", "DIVINE SHIELD")      ;
  private final Item map           = new Item  ("MAP"   , "MAP")                ;
  private final RangedWeapon sorcererStaff = new RangedWeapon  ("STAFF" , "SORCERER STAFF", 50,3,1);
  private final RangedWeapon godStaff      = new RangedWeapon  ("STAFF" , "GOD STAFF",100,1,1)     ;
  private final Food healingPotion = new Food  ("POTION", "HEALING POTION",20)  ;
  private final Food strengthPotion= new Food  ("POTION", "STRENGTH POTION",50)    ;
  private final Food magicPotion   = new Food  ("POTION", "MAGIC POTION",50)       ;
  private final Food meatSkewer    = new Food  ("FOOD"  , "MEAT SKEWER",10)     ;
  private final RangedWeapon crossBow      = new RangedWeapon("BOW","CROSS BOW",10,3,1)  ;

  public RangedWeapon getCrossBow() {
    return crossBow;
  }

  public MeleeWeapon getFist() {
    return fist;
  }

  public MeleeWeapon getBasicSword() {
    return basicSword;
  }

  public Food getMeatSkewer() {
    return meatSkewer;
  }

  public Item getDivineShield()  {
    return divineShield;
  }

  public Item getDivineSword()   {
    return divineSword;
  }

  public RangedWeapon getGodStaff()      {
    return godStaff;
  }

  public Food getGreatPotion()   {
    return greatPotion;
  }

  public Item getGreatShield()   {
    return greatShield;
  }

  public Food getHealingPotion() {
    return healingPotion;
  }

  public Food getMagicPotion()   {
    return magicPotion;
  }

  public Item getMap()           {
    return map;
  }

  public RangedWeapon getSorcererStaff() {
    return sorcererStaff;
  }

  public Food getStrengthPotion(){
    return strengthPotion;
  }
}
