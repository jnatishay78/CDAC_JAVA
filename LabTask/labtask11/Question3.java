package labtask11;
public class Question3 {
    public static void main(String[] args) {
        String str1 = "Atishay";
        String str2 = "Jain";
        String commonCharacters = findCommonCharacters(str1, str2);
        System.out.println("Common characters between \"" + str1 + "\" and \"" + str2 + "\": " + commonCharacters);
    }
    public static String findCommonCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                char char2 = str2.charAt(j);
                if (char1 == char2 && result.indexOf(String.valueOf(char1)) == -1) {
                    result.append(char1);
                    break;
                }
            }
        }

        return result.toString();
    }
}
   