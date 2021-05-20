package TeachMeSkills.Task1_Classes;

// Проверить, заканчивается ли документ на последовательность 1a2b.

public class Task1_Part6 {

    public static void toCheckIfStringEndsWith1a2b(String docNumber) {
        if (docNumber.endsWith("1a2b")) {
            boolean endsWith1a2b = true;
            System.out.println("Номер документа заканчивается на последовательность 1a2b");
        }
        else System.out.println("Номер документа не заканчивается на последовательность 1a2b");
    }
}
