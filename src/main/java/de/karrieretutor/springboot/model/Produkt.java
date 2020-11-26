package de.karrieretutor.springboot.model;

public class Produkt {
    public String name;
    public String herkunft;
    public Kategorie kategorie;
    public Unterkategorie unterkategorie;
    public Double preis;
    String foto;

    public Produkt(String name, String herkunft, Kategorie kategorie, Unterkategorie unterkategorie, Double preis) {
        this.name = name;
        this.herkunft = herkunft;
        this.kategorie = kategorie;
        this.unterkategorie = unterkategorie;
        this.preis = preis;
    }

    public String getFoto() {
        switch (this.unterkategorie) {
            case SUBKAT1:
                return "images/earlGrey.jpg";
            case SUBKAT2:
                return "images/matchaTea.jpg";
            case SUBKAT3:
                return "images/oolongTea.jpg";
            case SUBKAT4:
                return "images/peppermintTea.jpg";
        }
        return "images/errorImage.jpg";
    }

    public String getPreisFormatiert() {
        return String.format("%.2f", this.preis);
    }
}

