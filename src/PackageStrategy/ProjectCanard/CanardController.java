package PackageStrategy.ProjectCanard;

import PackageStrategy.ProjectCanard.ListOiseau.CanardEnBois;
import PackageStrategy.ProjectCanard.ListOiseau.Colvert;
import PackageStrategy.ProjectCanard.ListOiseau.Morillon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class CanardController {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        List<Canard> canards = new ArrayList<>();
        canards.add(new Colvert());
        canards.add(new Morillon());
        canards.add(new CanardEnBois());

        for (Canard c : canards) {
            c.afficheToi();
            c.envoleToi();
        }
    }
}
