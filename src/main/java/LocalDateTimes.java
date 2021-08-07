import java.time.LocalDateTime;

public class LocalDateTimes {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime futuro = agora.plusDays(1).plusMonths(2).plusSeconds(12);

        System.out.println(agora);
        System.out.println(futuro);
    }
}
