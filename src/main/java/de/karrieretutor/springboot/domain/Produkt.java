package de.karrieretutor.springboot.domain;

import de.karrieretutor.springboot.enums.Kategorie;
import de.karrieretutor.springboot.enums.Unterkategorie;
import org.springframework.context.i18n.LocaleContextHolder;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.text.NumberFormat;
import java.util.Locale;

@Entity
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO  )
    private Long id;

    @NotBlank(message = "{validation.produkt.name}")
    private String name;

    @NotBlank(message = "{validation.produkt.herkunft}")
    private String herkunft;

    @NotNull(message = "{validation.produkt.kategorie}")
    private Kategorie kategorie;

    @NotNull(message = "{validation.produkt.unterkategorie}")
    private Unterkategorie unterkategorie;

    @NotNull
    @Min(value = 1, message = "{validation.produkt.preis}")
    private Double preis;

    @Transient
    String foto;

    public Produkt() {}

    public Produkt(String name, String herkunft, Kategorie kategorie, Unterkategorie unterkategorie, Double preis) {
        this.name = name;
        this.herkunft = herkunft;
        this.kategorie = kategorie;
        this.unterkategorie = unterkategorie;
        this.preis = preis;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunft() {
        return herkunft;
    }
    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }
    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public Unterkategorie getUnterkategorie() {
        return unterkategorie;
    }
    public void setUnterkategorie(Unterkategorie unterkategorie) {
        this.unterkategorie = unterkategorie;
    }

    public Double getPreis() {
        return preis;
    }
    public void setPreis(Double preis) {
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

