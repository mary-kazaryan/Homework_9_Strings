package TeachMeSkills;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Дана строка произвольной длины с произвольными словами.
// Найти самое короткое слово в строке и вывести его на экран.
// Найти самое длинное слово в строке и вывести его на экран.
// Если таких слов несколько, то вывести последнее из них.

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String enteredString = in.nextLine();

        String[] array = enteredString.split(" ");

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());}});

        System.out.println("Minimum word is: " + array[0]);
        System.out.println("Maximum word is: " + array[array.length - 1]);
        in.close();
    }
}

