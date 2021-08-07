import java.time.LocalTime;

public class LocalTimes {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        //Adicionando mais uma hora na referencia "agora"
        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(agora);
        System.out.println(maisUmaHora);
    }
}
