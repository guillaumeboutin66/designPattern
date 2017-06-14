package PackageDecorateur;

import java.util.Date;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class FactureDetail  extends Facture{

    public FactureDetail(String n, Date d) {
        super(n, d);
    }

    public void imprimeToi(){
        System.out.println("J'imprime avec détails "+getNom()+" "+getDate());
    }
}
