package PackageStrategy.ProjectCanard.ListOiseau;

import PackageStrategy.ProjectCanard.Canard;
import PackageStrategy.ProjectCanard.ListTypeVol.NoVol;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class Dindon extends Canard{

    public Dindon(){
        setMaFaconDeVoler(new NoVol());
    }


    @Override
    public void afficheToi() {
        System.err.println("Je suis un Dindon");

    }
}
