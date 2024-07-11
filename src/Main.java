import java.util.ArrayList;

public class Main {

    private static String LETTERS = "12345678910ABCDEFGIJKLMOPQRSTUVWXYZ";

    public static void main(String[] args) {

        final String full_text = "Hello World";
        final ArrayList<String> textList = new ArrayList<>();
        final ArrayList<String> letterList = new ArrayList<>();

        for (char string : full_text.toCharArray()) {
            textList.add(String.valueOf(string));
        }

        for (char string : LETTERS.toCharArray()) {
            letterList.add(String.valueOf(string));
        }

        final StringBuilder strBuilder = new StringBuilder();

        int oldNext = -1;
        int parsed_letters = 0;
        for (int next = 0; next < textList.size(); next++) {
            if (oldNext != next) {
                strBuilder.append(textList.get(next));
            }

            parsed_letters++;

            if (parsed_letters >= 35) {
                oldNext++;
            }

            for (String cascate_character : letterList) {
                System.out.println(strBuilder + cascate_character);
            }

            System.out.println(strBuilder);
        }
    }
}