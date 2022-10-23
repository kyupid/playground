import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UriTest {
    public static void main(String[] args) throws URISyntaxException {
        URI uri = new URI("?code=world&path=https://morazo.kr");
        Map<String, String> stringStringMap = queryToMap(uri.getQuery());
        System.out.println(stringStringMap);

    }

    public static Map<String, String> queryToMap(String query) {
        Map<String, String> result = new HashMap<>();
        for (String param : query.split("&")) {
            String[] pair = param.split("=");
            if (pair.length > 1) {
                result.put(pair[0], pair[1]);
            } else {
                result.put(pair[0], "");
            }
        }
        return result;
    }

}
