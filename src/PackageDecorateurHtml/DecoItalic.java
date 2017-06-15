package PackageDecorateurHtml;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class DecoItalic  extends DecorateurBalise{

    public DecoItalic(Chaine deco) {
        super(deco);
    }

    @Override
    public String imprimeToi(){
        return "<i>"+super.imprimeToi()+"</i>";
    }
}
