// imports: -YF
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// class datetime_convert -YF
public class datetime_convert {
    // main -YF
    public static void main(String[] args) {
        // string representing a date -YF
        String dateStr = "2022-03-17 10:45:30";
        // set a formatter to format dates a specific way -YF
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // get today's date, formatter like the formatter (?) -YF
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);
        // reformat the date, save as formattedDate -YF
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        // print out the formatted date
        System.out.println(formattedDate);
    }
}
