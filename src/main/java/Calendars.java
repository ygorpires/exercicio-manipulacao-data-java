import java.util.Calendar;

public class Calendars {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println(agora.getTime());
        agora.add(Calendar.DATE, -15);
        System.out.println(agora.getTime());

    }
}
