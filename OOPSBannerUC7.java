import java.util.ArrayList;
import java.util.List;

public class OOPSBannerUC7 {

    public static void main(String[] args) {

        List<CharacterPattern> patterns = new ArrayList<>();

        patterns.add(new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patterns.add(new CharacterPattern('P', new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        }));

        patterns.add(new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            for (char ch : word.toCharArray()) {
                for (CharacterPattern cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        System.out.print(cp.getPattern()[row] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}