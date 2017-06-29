package PackageFabrique;

/**
 * Created by guillaumeboutin on 28/06/2017.
 */
public class FabriquePneuGoodyear implements AbstactFabriquePneu{
    @Override
    public PneuNeige creePneuNeige() {
        return new PneuNeigeGoodyear();
    }

    @Override
    public PneuRoute creePneuRoute() {
        return new PneuRouteGoodyear();
    }
}
