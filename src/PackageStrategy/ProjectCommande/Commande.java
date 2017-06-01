package PackageStrategy.ProjectCommande;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class Commande {
    private Double montantHt;
    private Taxe t;

    public Commande(double m){
        this.montantHt = m;
    }

    public void calculeTTC(){
       System.err.println("Montant ttc est de "+montantHt+" * "+t);
    }

    public Taxe getT() {
        return t;
    }

    public void setT(Taxe t) {
        this.t = t;
    }
}
