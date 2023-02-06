import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//извлечь числа из текста
public class Main {
    public static final String REGEXP_CONST="\\d{1,10}";

    public static void main(String[] args) throws IOException
    {
        String regexp = REGEXP_CONST;
        Integer dt=0;
        System.out.print("Введите текст:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        for(String line: arr){
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String sm = (matcher.group(0));
                dt=dt+Integer.valueOf(sm);
                System.out.println(matcher.group(0));
            }
        }
        System.out.println("Сумма="+dt);
    }
}