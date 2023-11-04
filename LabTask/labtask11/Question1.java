package labtask11;
class Question1 {
    private String value;

    public Question1(String value) {
        this.value = value;
    }

    public int length() {
        return value.length();
    }

    public boolean equals(Question1 other) {
        return value.equals(other.toString());
    }

    public char charAt(int index) {
        if (index < 0 || index >= value.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else{
        return value.charAt(index);}
    }


    public Question1 toUpperCase() {
        return new Question1(value.toUpperCase());
    }

    public Question1 toLowerCase() {
        return new Question1(value.toLowerCase());
    }


    public int indexOf(String substring) {
        return value.indexOf(substring);
    }

    public String toString() {
        return value;
    }

    public static void main(String[] args) {
        Question1 myStr = new Question1("My name is Atishay Jain");

        System.out.println("Original String: " + myStr);
        System.out.println("Length: " + myStr.length());
        System.out.println("Equals 'Hello, World!': " + myStr.equals(new Question1("Hello, World!")));
        System.out.println("Char at index 7: " + myStr.charAt(7));
        System.out.println("Uppercase: " + myStr.toUpperCase());
        System.out.println("Lowercase: " + myStr.toLowerCase());
        System.out.println("Index of 'World': " + myStr.indexOf("World"));
    }
}
