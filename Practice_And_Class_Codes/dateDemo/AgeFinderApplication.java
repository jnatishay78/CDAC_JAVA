package dateDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class AgeFinderApplication {
    public static void main(String[] args) {
//        System.out.println("Enter your Date of Birth 'date/month/year'");
//        Scanner sc = new Scanner(System.in);
//        
//        String dob = sc.next();
//        String arr[] = dob.split("/");
//        
//        int d=Integer.parseInt(arr[0]);
//        int m=Integer.parseInt(arr[1]);
//        int y=Integer.parseInt(arr[2]);
//        
//        LocalDate birthDate=LocalDate.of(y, m, d);
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate toDay=LocalDate.now();
        System.out.println(toDay);
        System.out.println(toDay.minusMonths(6));
        System.out.println(toDay.minusDays(190));
        System.out.println(toDay.minusWeeks(3));
        System.out.println(toDay.plusMonths(6));
        System.out.println(toDay.plusDays(190));
        System.out.println(toDay.plusWeeks(3));
        System.out.println(toDay.isAfter(toDay));
        System.out.println(toDay.isAfter(LocalDate.of(2021,10,23)));
        System.out.println(toDay.getMonth());
        System.out.println(toDay.getMonthValue());
        System.out.println(toDay.getDayOfMonth());
        System.out.println(toDay.getDayOfYear());
//        Period p = Period.between(birthDate, toDay);
//        System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and  "+p.getDays()+" days old.");
    }
}
