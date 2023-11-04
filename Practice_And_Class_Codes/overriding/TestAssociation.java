/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author user
 */
class Person{
private String name;    
private Address address;
public Person(String name, Address address){
    this.name = name;
    this.address = address;
}

void PersonDetails(){
System.out.println("Name is "+name);
System.out.println("Address is "+address);
}
}

class Address{
    private int houseNo;
    private String landMark;
    private String city;
    private String state;
    private String pincode;

 public Address(int houseNo,String landmark,String city,String state,String pincode){
        this.houseNo=houseNo;
        this.landMark=landmark;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
        
    }

    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", landmark=" + landMark + ", city=" + city + ", state=" + state + ", pincode=" + pincode + '}';
    }
}
public class TestAssociation{
    public static void main(String[] args){
        
        Address ad= new Address(101,"Hi-tech City","Nagpur","Maharashtra","440030");
        Address ad1= new Address(101,"Low-tech City","Chandrapur","Maharashtra","440030");
        Person  p = new Person("Atishay Jain",ad1);
        p.PersonDetails();
    }
}
