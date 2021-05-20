package TeachMeSkills.Task1_Classes;
import java.util.Arrays;

// Вывести на экран в одну строку два первых блока по 4 цифры.

public class Task1_Part1 {

    static void toShowTwoBlocksOfString(String docNumber, char[] showXXXX) {
        docNumber.getChars(0, 4, showXXXX, 0);
        docNumber.getChars(9, 13, showXXXX, 4);
        System.out.println("Вывод двух первых блоков по 4 цифры в одну строку: " + Arrays.toString(showXXXX));
    }
}
