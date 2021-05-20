package TeachMeSkills.Task1_Classes;

// Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.

class Task1_Part3 {

    public static void toMakeLowCase() {

        String docNumber = new String("xxxx-yyy-xxxx-yyy-xyxy");
        String docNumber2 = docNumber.toLowerCase();
        char [] showY1 = new char[] {docNumber2.charAt(5), docNumber2.charAt(6), docNumber2.charAt(7), '/', docNumber2.charAt(14), docNumber2.charAt(15), docNumber2.charAt(16), '/', docNumber2.charAt(19), '/', docNumber2.charAt(21)};
        System.out.print("Вывод на экран только одних букв из номера документа в формате yyy/yyy/y/y в нижнем регистре: ");
        System.out.println(showY1);

     }
}