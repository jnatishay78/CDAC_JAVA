package Assignment_1;
class PackagePrivateClass {
    int packagePrivateField = 1;

    void packagePrivateMethod() {
        System.out.println("This is a package-private method.");
    }
}

public class Question6 {
    public static void main(String[] args) {
        PackagePrivateClass ppClass = new PackagePrivateClass();
        ppClass.packagePrivateMethod();
        AccessModifiersExample example = new AccessModifiersExample();
        System.out.println(example.publicField);
        example.publicMethod();
        System.out.println(example.protectedField);
        example.protectedMethod();
        System.out.println(example.packagePrivateField);
        example.packagePrivateMethod();
    }
}

class AccessModifiersExample {
    public int publicField = 2;
    protected int protectedField = 3;
    int packagePrivateField = 4; 
    private int privateField = 5;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void packagePrivateMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
