package PackageDecorateur.Decorateurs;

import PackageDecorateur.DecorateurFacture;
import PackageDecorateur.Facture;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class Pub extends DecorateurFacture{
    private String pub;

    public Pub(String _pub, Facture deco) {
        super(deco);
        pub = _pub;
    }

    public void imprimeToi(){
        super.imprimeToi();
        imprimePub();
    }

    public void imprimePub(){
        System.out.println("Pub : "+pub);
    }
}
