package PackageStrategy.ProjectCanard.ListCanard;

import PackageStrategy.ProjectCanard.Canard;
import PackageStrategy.ProjectCanard.ListTypeVol.VolAvecDesAiles;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class Colvert  extends Canard {

    public Colvert(){
        setMaFaconDeVoler(new VolAvecDesAiles());
    }

    @Override
    public void afficheToi() {
        System.err.println("Je suis un Colvert");
    }
}
