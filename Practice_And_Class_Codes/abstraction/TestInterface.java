package abstraction;
public class TestInterface {
    public static void main(String[] args) {
        StudentInter si;
        si=new StudentImplementation();
        si.showAge(23);
        si.showName("Atishay");
        si.course();
        StudentInter.institute();
    }
}
