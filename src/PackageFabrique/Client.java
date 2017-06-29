package PackageFabrique;

/**
 * Created by guillaumeboutin on 28/06/2017.
 */
public class Client {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        FabriquePneuMichelin fMichelin = new FabriquePneuMichelin();
        FabriquePneuGoodyear fGoodyear = new FabriquePneuGoodyear();

        PneuRoute pR = fMichelin.creePneuRoute();
        PneuRoute pR2 = fGoodyear.creePneuRoute();


        PneuNeige pN = fMichelin.creePneuNeige();
        PneuNeige pN2 = fGoodyear.creePneuNeige();

    }
}
