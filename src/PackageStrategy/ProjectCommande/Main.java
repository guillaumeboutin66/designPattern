package PackageStrategy.ProjectCommande;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class Main {
    public static void main(String[] args){
        List<Commande> commandes = new ArrayList<>();
        Commande commande1 = new Commande(42);
        commande1.setT(new TaxeFrance());
        commandes.add(commande1);

        Commande commande2 = new Commande(12);
        commande2.setT(new TaxeEspagne());
        commandes.add(commande2);

        for (Commande c: commandes){
            c.calculeTTC();
        }
    }
}
