package com.GeekTech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Continent Евразия = new Continent("Евразия");
        Playstation objectA = new Playstation("Сони",Евразия,MAIN_OFFICE.SAN_MATEO,
                "Playstation 5");
        System.out.println(objectA.getInfo());
        System.out.println(objectA.playstationInfo(5));
        System.out.println("_______________________________");


        Santa_Monica_Studio objectB = new Santa_Monica_Studio("Сони",Евразия,MAIN_OFFICE.SANTA_MONIKA,
                "Playstation 4","Студия Санта Моника","Good Of War" );
        System.out.println(objectB.getInfo());
        System.out.println(objectB.playstationInfo("Playstation 4"));
        System.out.println("_______________________________");

        Santa_Monica_Studio objectC = new Santa_Monica_Studio("Сони",Евразия,MAIN_OFFICE.SANTA_MONIKA,
                "Playstation 2","Студия Санта Моника","Good Of War 2" );
        System.out.println(objectC.getInfo());


    }




}
