package TeachMeSkills.Task1_Classes;

// Проверить, содержит ли номер документа последовательность abc, и вывети сообщение содержит или нет.
// Причем, abc и ABC считается одинаковой последовательностью.

public class Task1_Part4 {

    public static void toCompareLowerAndUpperCases(String docNumber) {


        String abc = "abc";
        String ABC = "ABC";
        boolean comparison = ABC.equalsIgnoreCase(abc);

        if (docNumber.contains("abc")) {
            comparison = true;
            System.out.println("Номер документа содержит последовательность abc/ABC");
        } else {
            comparison = false;
            System.out.println("Номер документа не содержит последовательность abc/ABC");
        }

    }
}

