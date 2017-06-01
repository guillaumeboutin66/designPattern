package PackageStrategy;

import PackageStrategy.ListTypeVol.NoVol;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public abstract class Canard {
    Vol maFaconDeVoler = new NoVol();


    public void faisCoinCoin() {

    }

    public void nage() {

    }

    public abstract void afficheToi();

    public Vol getMaFaconDeVoler() {
        return maFaconDeVoler;
    }

    public void setMaFaconDeVoler(Vol typeVole) {
        this.maFaconDeVoler = typeVole;
    }

    public void envoleToi() {
        maFaconDeVoler.vol();
    }


}
