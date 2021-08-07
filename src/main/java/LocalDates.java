import java.time.LocalDate;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        //obtendo o retorno de manos 1 dia de re ferencia
        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        System.out.println(ontem);
    }
}
