package TeachMeSkills;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Дана строка произвольной длины с произвольными словами.
// Написать программу для проверки является ли любое выбранное слово в строке полиндромом.
// Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке полиндромом.
// Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
// например, в строке 5 слов, а на вход программе передали число 500 и т.п. ситуации.

public class Task4 {

    private static final String someText = new String("Her name is Hannah Dunets");

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter your chosen position of the word: ");
        int enteredWordLocation = sc1.nextInt();
        String[] savedWords = someText.split(" ");

        if (savedWords.length < enteredWordLocation) {
            System.out.println("You exceeded the amount of words. Please try again!");
            return;
        }

        String foundWord = savedWords[enteredWordLocation - 1];
        StringBuilder str = new StringBuilder(foundWord);
        String reverseWord = str.reverse().toString();
        System.out.println("The chosen word is a palindrome: " + foundWord.equalsIgnoreCase(reverseWord));
        sc1.close();
    }
}




