package PackageDecorateurHtml;


/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class DecorateurBalise extends Chaine {
    private Chaine decore;

    public DecorateurBalise(Chaine dec) {
        super();
        decore = dec;
    }

    public String imprimeToi() {
        return decore.imprimeToi();
    }
}
