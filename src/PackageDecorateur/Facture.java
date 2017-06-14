package PackageDecorateur;

import java.util.Date;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public abstract class Facture {
    private String nom;
    private Date date;

    public Facture(){}

    public Facture(String n, Date d){
        nom = n;
        date = d;
    }

    public String getNom() {
        return nom;
    }

    public Date getDate() {
        return date;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    abstract void imprimeToi();
}
