package TeachMeSkills.Task1_Classes;

// Вывести на экран номер документа, но блоки из трех букв заменить на * (каждая буква заменятся на *).

public class Task1_Part2 {

    public static void toReplaceWithStars (String docNumber) {
        System.out.println("Вывод номера документа с заменой блоков из трех букв на ***: " + docNumber.replace("yyy", "***"));

    }
}
