package title4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class dateTestJDK8 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate future = today.plusDays(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 E", Locale.CHINA);
        String futureString = future.format(formatter);
        System.out.println(futureString);
    }
}
