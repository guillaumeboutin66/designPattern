package PackageDecorateur;


import PackageDecorateur.Decorateurs.EnTete;
import PackageDecorateur.Decorateurs.Pub;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class FactureController {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        List<Facture> factures = new ArrayList<>();


        factures.add(new EnTete("Voici une super ENTETETET" ,new FactureSimple("test", new Date())));
        factures.add(new Pub("Voici de la super PUBBBBB" ,new FactureSimple("test", new Date())));


        factures.add(new EnTete("Voici une super ENTETETET" ,new FactureDetail("test", new Date())));
        factures.add(new Pub("Voici de la super PUBBBBB" ,new FactureDetail("test", new Date())));

        for (Facture f : factures) {
            f.imprimeToi();
        }
    }
}
