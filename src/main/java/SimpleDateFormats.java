import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormats {
    public static void main(String[] args) {
        Date agora = new Date();
        SimpleDateFormat formater  = new SimpleDateFormat("dd/MM/YYYY");
        String dataFormatada = formater.format(agora);

        System.out.println(dataFormatada);
    }
}
