package PackageStrategy.ProjectCanard.ListTypeVol;

import PackageStrategy.ProjectCanard.Vol;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public class NoVol implements Vol{
    @Override
    public void vol() {
        System.err.println("Je vole pas");

    }
}
