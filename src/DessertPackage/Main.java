package DessertPackage;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // GAUFFRE
        Dessert gauffre = new Gauffre();
        gauffre.imprimeTicket();
        // GAUFFRE au chocolat
        gauffre = (new Chocolat(gauffre)).getDessert();
        gauffre.imprimeTicket();

        // GAUFFRE
        Dessert crepe = new Crepe();
        crepe.imprimeTicket();
        // GAUFFRE au chocolat
        crepe = (new Chocolat(crepe)).getDessert();
        crepe.imprimeTicket();
        // GAUFFRE au chocolat et à la chantilly
        crepe = (new Chantilly(crepe)).getDessert();
        crepe.imprimeTicket();
    }
}
