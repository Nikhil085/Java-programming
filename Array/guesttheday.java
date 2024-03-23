import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class guesttheday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try{
            LocalDate date = LocalDate.parse(inputDate, formatter);
            String dayName = date.getDayOfWeek().toString();
            System.out.println(dayName);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
