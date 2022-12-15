import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;

public class PojoToJson {

    public static void main (String[] args) throws SerializeException, ParseException {
        //Serialization
        //pojo to json
        JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;

        String[] sellerNames = {"A", "B", "C", "D"};
        Product product = new Product("Macbook", 1000, "White", sellerNames);

        String json = jsonSerializer.serialize(product);

        System.out.println(json);

        //De-Serialization
        //json to pojo
        JsonParser jsonParser = JsonParser.DEFAULT;
        Product product1 = jsonParser.parse(json, Product.class);

        System.out.println(product.getColor());
        System.out.println(product1.toString());
    }

}
