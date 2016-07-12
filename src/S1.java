/**
 * Created by cliff on 12/07/2016.
 */

import org.apache.jena.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;

public class S1 {

    String type;

    public S1(String Ptype)
    {
        System.out.println("starting Control");

        type = Ptype;
        System.out.println("Type=" + type);

        String personURI = "http://cliff";
        String fullName = "Cliff O";

        Model model = ModelFactory.createDefaultModel();
        Resource cliffo = model.createResource(personURI);
        cliffo.addProperty(VCARD.FN, fullName);

        System.out.println("ending Control");

    }
}
