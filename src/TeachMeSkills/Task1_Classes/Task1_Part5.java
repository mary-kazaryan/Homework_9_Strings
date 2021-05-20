package TeachMeSkills.Task1_Classes;

// Проверить начинается ли номер документа с последовательности 555.

public class Task1_Part5 {

    public static void toCheckIfStringStartsWith555(String docNumber) {

        if (docNumber.startsWith("555")) {
            boolean startsWith555 = true;
            System.out.println("Номер документа начинается с последовательности 555");
        } else System.out.println("Номер документа не начинается с последовательности 555");

    }
}
