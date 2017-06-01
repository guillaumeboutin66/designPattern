package PackageStrategy.ProjectPersonnage.ListTypeCombat;

import PackageStrategy.ProjectPersonnage.Combat;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class CombatAuSabre implements Combat {
    @Override
    public void executeToi() {
        System.err.println("Je combat au Sabre");
    }
}
