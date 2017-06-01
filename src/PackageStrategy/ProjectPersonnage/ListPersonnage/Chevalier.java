package PackageStrategy.ProjectPersonnage.ListPersonnage;

import PackageStrategy.ProjectPersonnage.ListTypeCombat.CombatALaHache;
import PackageStrategy.ProjectPersonnage.ListTypeCombat.CombatAuCouteau;
import PackageStrategy.ProjectPersonnage.Personnage;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class Chevalier extends Personnage {
    public Chevalier(){
        setMonTypeDeCombat(new CombatALaHache());
    }
    @Override
    public void afficheToi() {
        System.err.println("Je suis un Chevalier");
    }
}
