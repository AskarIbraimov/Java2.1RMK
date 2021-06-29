package com.GeekTech;

public class Santa_Monica_Studio extends Playstation{
    private String developer;
    private String gameName;

    public Santa_Monica_Studio(String corporation, Continent continent, MAIN_OFFICE mainOffice, String gameConsole, String developer, String gameName) {
        super(corporation, continent, mainOffice, gameConsole);
        this.developer = developer;
        this.gameName = gameName;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getGameName() {
        return gameName;
    }

    @Override
    public String playstationInfo(String gameConsole) {
        return super.playstationInfo(gameConsole) + "Санта Моника Одобряет";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Разработчик игр: " + developer + "\nНазвание игры: " + gameName;
    }
}
