import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        Date novaData = new Date();
        Long currentMilli = System.currentTimeMillis();
        Date longData = new Date(currentMilli);
        System.out.println(novaData);
        System.out.println(longData);
    }
}
