package DessertPackage;

/**
 * Des super bons desserts
 */
public abstract class Dessert {
    private String nomDessert;
    private double prix;

    // On imprime le ticket de caisses
    public void imprimeTicket(){
        System.out.println("Dessert : "+nomDessert);
        System.out.println("Prix : "+prix);
    }

    public String getNomDessert() {
        return nomDessert;
    }

    public void setNomDessert(String nomDessert) {
        this.nomDessert = nomDessert;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
