package PackageStrategy.ListCanard;

import PackageStrategy.Canard;
import PackageStrategy.ListTypeVol.NoVol;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class CanardEnBois extends Canard{

    public CanardEnBois(){
        setMaFaconDeVoler(new NoVol());
    }


    @Override
    public void afficheToi() {
        System.err.println("Je suis un CDEB");

    }
}
