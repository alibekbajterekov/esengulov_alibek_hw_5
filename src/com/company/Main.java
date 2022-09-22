package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Boss myBoss = new Boss();
        myBoss.setHp(1200);
        myBoss.setDamage(100);
        myBoss.setDefense("defense Kaolin");
        System.out.println(  " Boss hp " +myBoss.getHp() + " "+ "  damage " +myBoss.getBossDamage()+
                " " +" Defense " + myBoss.getDefense());
        for (int i = 0; i <createHeroes().length ; i++) {
            System.out.println("номер героя № " + (i+1) + " " + createHeroes()[i]);


        }
    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(500, 50, "Kaolin");
        Hero hero2 = new Hero(390, 60, "Storm");
        Hero hero3 = new Hero(450, 70, "War");
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;



    }


}