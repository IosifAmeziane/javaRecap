package algorithms;

public class VowelsNumber {

    public static int countVowelsNumberInString(String givenString) {
        givenString = givenString.toLowerCase();
        int contor = 0;
        for (int i = 0; i < givenString.length(); i++) {

            char temp = givenString.charAt(i);
            switch (temp) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contor++;
                    break;
            }
        }
        return contor;
    }
}
