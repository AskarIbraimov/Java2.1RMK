package com.GeekTech;

public class Playstation extends Sony {
    private String gameConsole;

    public Playstation(String corporation, Continent continent, MAIN_OFFICE mainOffice, String gameConsole) {
        super(corporation, continent, mainOffice);
        this.gameConsole = gameConsole;
    }

    public String getGameConsole() {
        return gameConsole;
    }
    public String playstationInfo(String gameConsole){
        return "Название консоли: " + this.gameConsole;
    }
    public final String playstationInfo(int consoleNumber){
        return "Номер консоли: " + consoleNumber;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nИгровая Консоль: " + gameConsole;
    }
}
