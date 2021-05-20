package TeachMeSkills.Task1_Classes;

import static TeachMeSkills.Task1_Classes.Task1_Part1.toShowTwoBlocksOfString;
import static TeachMeSkills.Task1_Classes.Task1_Part2.toReplaceWithStars;
import static TeachMeSkills.Task1_Classes.Task1_Part3.toMakeLowCase;
import static TeachMeSkills.Task1_Classes.Task1_Part4.toCompareLowerAndUpperCases;
import static TeachMeSkills.Task1_Classes.Task1_Part5.toCheckIfStringStartsWith555;
import static TeachMeSkills.Task1_Classes.Task1_Part6.toCheckIfStringEndsWith1a2b;


// На вход передать строку(будем считать, что это номер документа).
// Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.

public class Task1 {

    public static void main(String[] args) {

        String docNumber = new String("xxxx-yyy-xxxx-yyy-xyxy");
        String[] expectedSeparation = new String[]{"xxxx", "yyy", "xxxx", "yyy", "xyxy"};
        char[] showXXXX = new char[8];

        // Вывести на экран в одну строку два первых блока по 4 цифры.
        toShowTwoBlocksOfString(docNumber, showXXXX);

        // Вывести на экран номер документа, но блоки из трех букв заменить на * (каждая буква заменятся на *).
        toReplaceWithStars(docNumber);

        // Вывод на экран только одних букв из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        toMakeLowCase();

        // Проверить, содержит ли номер документа последовательность abc, и вывети сообщение содержит или нет.
        // Причем, abc и ABC считается одинаковой последовательностью.
        toCompareLowerAndUpperCases(docNumber);

        // Проверить начинается ли номер документа с последовательности 555.
        toCheckIfStringStartsWith555(docNumber);

        // Проверить, заканчивается ли документ на последовательность 1a2b.
        toCheckIfStringEndsWith1a2b(docNumber);

    }
}

