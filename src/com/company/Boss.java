package com.company;

public class Boss extends GameEntity {
  Weapon weapon = new Weapon();

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public String printlnInfo(){
      return super.information()  + " Weapon name:" + weapon.getWeaponName() + " Weapon type:" + weapon.getWeaponType();
  }

}





