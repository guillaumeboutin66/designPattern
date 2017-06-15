package PackageDecorateurHtml;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class Chaine {
    String chaine;

    public Chaine(){}
    public Chaine(String c){
        chaine = c;
    }

    public String imprimeToi(){
        return getChaine();
    };

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }
}
