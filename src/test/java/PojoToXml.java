import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class PojoToXml {

    public static void main (String[] args) throws SerializeException {
        //pojo to xml
        XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;

        String[] sellerNames = {"A", "B", "C", "D"};
        Product product = new Product("Macbook", 1000, "White", sellerNames);

        String xml = xmlSerializer.serialize(product);

        System.out.println(xml);
    }

}
