package PackageDecorateur.Decorateurs;

import PackageDecorateur.DecorateurFacture;
import PackageDecorateur.Facture;

import java.util.Date;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class EnTete  extends DecorateurFacture {
    private String entete;

    public EnTete(String en_tete, Facture deco) {
        super(deco);
        entete = en_tete;
    }

    public void imprimeToi(){
        imprimeEntete();
        super.imprimeToi();
    }

    public void imprimeEntete(){
        System.out.println("EnTete : "+entete);
    }
}
