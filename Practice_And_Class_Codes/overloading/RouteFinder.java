package overloading;
import java.util.*;
public class RouteFinder {
    void Route(String src, String via, String dest){
        System.out.println("Moving from "+src+" to "+dest+" via "+via);
    }
    void Route(String src, String dest){
        System.out.println("Moving from "+src+" to "+dest);
        
    }
    void Route(String dest){
        System.out.println("Moving to "+dest);
    }
    
    public static void main(String args[]){
        RouteFinder rf = new RouteFinder();
        System.out.println("Please enter : ");
        System.out.println("1. For destination only");
        System.out.println("2. For source and destination");
        System.out.println("3. for source, via and destination");
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int choice;
        choice = sc1.nextInt();
        switch(choice){
            case 1:{
                System.out.print("Enter destination: ");
                String d = sc.nextLine();
                rf.Route(d);
                break;}
            
            case 2:{
                System.out.println("Enter source: ");
                String s = sc.nextLine();
                System.out.println("Enter destination: ");
                String d = sc.nextLine();
                rf.Route(s, d);
                break;}
            
            case 3:{
                System.out.println("Enter source: ");
                String s = sc.nextLine();
                System.out.println("Enter via: ");
                String v = sc.nextLine();
                System.out.println("Enter destination: ");
                String d = sc.nextLine();
                rf.Route(s, v, d);
                break;}
                default:{
                    System.out.println("We dont serve at your location");}
        }
    }
}
