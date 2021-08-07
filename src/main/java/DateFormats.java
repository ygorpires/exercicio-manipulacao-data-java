import java.text.DateFormat;
import java.util.Date;

public class DateFormats {
    public static void main(String[] args) {
        Date agora = new Date();
        String dateToStr = DateFormat.getDateInstance().format(agora);

        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance().format(agora);

        System.out.println(dateToStr);
    }
}
