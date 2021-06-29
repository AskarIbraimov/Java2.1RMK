package com.GeekTech;

public class Sony {
    private String corporation;
    private Continent continent;
    private MAIN_OFFICE mainOffice;

    public Sony(String corporation, Continent continent, MAIN_OFFICE mainOffice) {
        this.corporation = corporation;
        this.continent = continent;
        this.mainOffice = mainOffice;
    }

    public String getCorporation() {
        return corporation;
    }

    public Continent getContinent() {
        return continent;
    }

    public MAIN_OFFICE getMainOffice() {
        return mainOffice;
    }

    public String getInfo(){
        return "Корпорация: " + corporation + "\nКонтинент: " + continent + "\nГлавный офис: " + mainOffice;
    }
}
