package PackageDecorateur;

import java.util.Date;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class DecorateurFacture extends Facture{
    private Facture decore;

    public DecorateurFacture(Facture dec) {
        super();
        decore = dec;
    }

    public void imprimeToi() {
        decore.imprimeToi();
    }
}
