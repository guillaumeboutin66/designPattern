package PackageStrategy.ProjectPersonnage;


import PackageStrategy.ProjectPersonnage.ListPersonnage.Brigand;
import PackageStrategy.ProjectPersonnage.ListPersonnage.Chevalier;
import PackageStrategy.ProjectPersonnage.ListPersonnage.Troll;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class PersonnageController {
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        List<Personnage> canards = new ArrayList<>();
        canards.add(new Brigand());
        canards.add(new Chevalier());
        canards.add(new Troll());

        for (Personnage c : canards) {
            c.afficheToi();
            c.batsToi();
        }
    }
}
