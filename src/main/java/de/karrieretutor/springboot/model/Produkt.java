package de.karrieretutor.springboot.model;

import org.springframework.context.i18n.LocaleContextHolder;

import java.text.NumberFormat;
import java.util.Locale;

public class Produkt {
    private static Long idCounter = 1L;
    public Long id;

    public String name;
    public String herkunft;
    public Kategorie kategorie;
    public Unterkategorie unterkategorie;
    public Double preis;
    String foto;

    public Produkt() {}

    public Produkt(String name, String herkunft, Kategorie kategorie, Unterkategorie unterkategorie, Double preis) {
        this.name = name;
        this.herkunft = herkunft;
        this.kategorie = kategorie;
        this.unterkategorie = unterkategorie;
        this.preis = preis;
        this.id = idCounter;
        idCounter++;
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
        Locale currentLocale = LocaleContextHolder.getLocale();
        return NumberFormat.getNumberInstance(currentLocale).format(this.preis);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", herkunft='" + herkunft + '\'' +
                ", kategorie=" + kategorie +
                ", unterkategorie=" + unterkategorie +
                ", preis=" + preis +
                ", foto='" + foto + '\'' +
                '}';
    }
}

