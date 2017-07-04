package DessertPackage;

/**
 * Created by guillaumeboutin on 04/07/2017.
 */
public class TestDecoration {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        testTicket();
    }
    public static boolean testTicket(){
        // GAUFFRE
        Dessert gauffre = new Gauffre();
        gauffre = (new Chocolat(gauffre)).getDessert();

        if(gauffre.getNomDessert().equals("Dessert : Gauffre, Chocolats")){
            return true;
        }else{
            throw new Error("String not equals");
        }
    }
}
