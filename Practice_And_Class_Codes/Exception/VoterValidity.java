package Exception;
import java.util.Scanner;
public class VoterValidity {
void checkValidity(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Age: ");
int age=sc.nextInt();
if(age>=18){
System.out.println("Congrats you are eligible to voting.");
}else{
try{
throw new ExceptionDemoThrowKeyword_03("Bhai abhi tum chote ho... Politics se door raho");}
catch(ExceptionDemoThrowKeyword_03 ed){
System.err.println(ed.getMessage());
 }}}}
