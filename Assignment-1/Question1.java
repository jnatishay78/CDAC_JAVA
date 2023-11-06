package Assignment_1;
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public void printAddress() {
        System.out.println("Address: " + street + ", " + city + ", " + state + " " + zipCode);
    }
}


class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        address.printAddress();
    }
}


public class Question1 {
    public static void main(String[] args) {
        Address address = new Address("20/97, Peeli Kothi Dhuliaganj","Agra","Uttar Pradesh - ", "282003");
        Person person = new Person("Atishay Jain", 23, address);
        System.out.println("Person Information:");
        person.displayInfo();
    }
}