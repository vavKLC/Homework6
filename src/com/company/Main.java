package com.company;

public class Main {

    public static void main(String[] args) {

        Boss roshan = new Boss();
        roshan.setDamage(50);
        roshan.setHealth(1000);
        roshan.setAby("invoke");
        roshan.weapon.setWeaponName("desolater");
        roshan.weapon.setWeaponType("closeCombat");
        

        System.out.println("Boss stat:" + "Boss damage:" + roshan.getDamage() + " , " + "Boss health:" + roshan.getHealth() + " , " +
                " Boss aby:" + roshan.getAby() + " , "
                + "Boss weapon:" + roshan.weapon.getWeaponName() + "," + roshan.weapon.getWeaponType() );

        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(10);
        skeleton.setHealth(200);
        skeleton.setAby("deadLine");
        skeleton.weapon.setWeaponType("crossBow");
        skeleton.weapon.setWeaponName("deadalus");
        skeleton.setNumberOfArrows(50);



        Skeleton skeleton2 = new Skeleton();
        skeleton2.setDamage(15);
        skeleton2.setHealth(150);
        skeleton2.setAby("fireArrow");
        skeleton2.weapon.setWeaponType("bow");
        skeleton2.weapon.setWeaponName("mantaStyle");
        skeleton2.setNumberOfArrows(70);



        System.out.println( "Roshan stat: " + roshan.printlnInfo());
        System.out.println("-------------------");
        System.out.println("Skeleton stat: " + skeleton.printlnInfo());
        System.out.println("-------------------");
        System.out.println("Skeleton2 stat: " + skeleton2.printlnInfo());
    }
}
