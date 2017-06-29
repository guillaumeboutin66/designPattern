package PackageFabrique;

/**
 * Created by guillaumeboutin on 28/06/2017.
 */
public class FabriquePneuMichelin implements AbstactFabriquePneu{
    @Override
    public PneuNeige creePneuNeige() {
        return new PneuNeigeMichelin();
    }

    @Override
    public PneuRoute creePneuRoute() {
        return new PneuRouteMichelin();
    }
}

