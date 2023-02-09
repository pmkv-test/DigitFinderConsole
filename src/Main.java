import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String REGEXP_CONST = "\\d{1,10}";

    public static void main(String[] args) throws IOException {
        int intSum = 0;

        if (args.length > 0) {
            Pattern pattern = Pattern.compile(REGEXP_CONST);
            Matcher matcher = pattern.matcher(args[0]);

            while (matcher.find()) {
                String sMatchGroup = matcher.group(0);
                intSum += Integer.parseInt(sMatchGroup);
                System.out.println(matcher.group(0));
            }
        }

        System.out.println("Total=" + intSum);
    }
}
