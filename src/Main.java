import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String REGEXP_CONST = "\\d{1,10}";

    public static void main(String[] args) throws IOException {
        int intSum = 0;
        for (String splitText : args) {
            Pattern pattern = Pattern.compile(REGEXP_CONST);
            Matcher matcher = pattern.matcher(splitText);
            while (matcher.find()) {
                String sMatchGroup = (matcher.group(0));
                intSum = intSum + Integer.parseInt(sMatchGroup);
                System.out.println(matcher.group(0));
            }
        }
        System.out.println("Total=" + intSum);
    }
}