package labtask11;
public class Question5 {
    public static void main(String[] args) {
        String input = "Atishay Jain";
        input = input.toLowerCase(); // Convert to lowercase for case-insensitive counting

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if ((ch >= 'a' && ch <= 'z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

