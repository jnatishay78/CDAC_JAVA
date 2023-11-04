package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulation {
    public static void main(String[] args) {
        Date d = new Date();
        
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MMM-dd");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMM, yyyy");
//        SimpleDateFormat sdf3 = new SimpleDateFormat("dd MMM, yyyy hh:mm:ss");
        
      
          //for converting date into string
//        String strDate=sdf.format(d);
//        String strDate1=sdf1.format(d);
//        String strDate2=sdf2.format(d);
//        String strDate3=sdf3.format(d);
//        System.out.println(strDate);
//        System.out.println(strDate1);
//        System.out.println(strDate2);
//        System.out.println(strDate3);
        
        
        //for converting string to date
        String sDate="2023-10-23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
        Date dt=sdf.parse(sDate);
            System.out.println(dt);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        String sDate1="2023-10-23 8:35:45";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");
        try{
        Date dt1=sdf1.parse(sDate1);
            System.out.println(dt1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
