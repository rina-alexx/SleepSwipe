package org.example;

public class Infromation {
    String district;
    boolean flagdistrict=false;

    String room;
    boolean flagrooms=false;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public boolean isFlagrooms() {
        return flagrooms;
    }

    public void setFlagrooms(boolean flagrooms) {
        this.flagrooms = flagrooms;
    }

    @Override
    public String toString() {
        return "Infromation{" +
                "district='" + district + '\'' +
                ", flagdistrict=" + flagdistrict +
                ", room='" + room + '\'' +
                ", flagrooms=" + flagrooms +
                '}';
    }

    public Infromation() {

    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public boolean isFlagdistrict() {
        return flagdistrict;
    }

    public void setFlagdistrict(boolean flagdistrict) {
        this.flagdistrict = flagdistrict;
    }
    public String checkDistrict(String district){
        switch (district){
            case "privolzhsky":
                district="Приволжский";
                break;
            case "avia":
                district="Авиастроительный";
                break;
            case "sovetsky":
                district="Советский";
                break;
            case  "kirovsky":
                district="Кировский";
                break;
            case "novosavinovsky":
                district="Ново-Савиновский";
                break;
            case "vakhitovsky":
                district="Ново-Савиновский";
                break;
            case "laishewsky":
                district="Лаишевский";
                break;
            case "salavatkupere":
                district="Салават Купере";
                break;
        }
        return district;
    }
}