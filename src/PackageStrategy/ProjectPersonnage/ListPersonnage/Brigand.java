package PackageStrategy.ProjectPersonnage.ListPersonnage;

import PackageStrategy.ProjectPersonnage.ListTypeCombat.CombatAuCouteau;
import PackageStrategy.ProjectPersonnage.Personnage;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class Brigand extends Personnage {
    public Brigand(){
        setMonTypeDeCombat(new CombatAuCouteau());
    }
    @Override
    public void afficheToi() {
        System.err.println("Je suis un Brigand");
    }
}
