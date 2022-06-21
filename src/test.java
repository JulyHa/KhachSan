import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String start, end;
        System.out.println("Enter start date(mm/DD/yyyy): ");
        Scanner scanner = new Scanner(System.in);
        start = scanner.nextLine();
        Date d = new Date(start);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dd;
        try {
             dd = dateFormat.parse(start);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(dd);
    }
}