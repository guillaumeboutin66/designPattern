package PackageStrategy.ListCanard;

import PackageStrategy.Canard;
import PackageStrategy.ListTypeVol.VolAvecDesAiles;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class Morillon  extends Canard {

    public Morillon(){
        setMaFaconDeVoler(new VolAvecDesAiles());
    }

    @Override
    public void afficheToi() {
        System.err.println("Je suis un Morillon");

    }
}
