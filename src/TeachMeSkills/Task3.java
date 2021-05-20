package TeachMeSkills;

// Дана строка произвольной длины с произвольными словами.
// Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
// Если таких слов несколько, найти первое из них.
// Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".

import java.util.Scanner;

public class Task3 {

            private static int differentWords (String str) {
            StringBuilder timelyString = new StringBuilder();
            String symbol;
            for (int i=0; i<str.length(); i++) {
                symbol = String.valueOf(str.charAt(i));
                if (timelyString.indexOf(symbol) == -1)
                    timelyString.append(symbol);
            }
            return timelyString.length();
        }

        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter your string: ");
            String enteredString = in.nextLine();

            String[] words = enteredString.split(" ");

            String goal = words[0];
            System.out.print("The existing array is: ");
            for (int i=0; i<words.length; i++){
                System.out.print(words[i] + "; ");
                if ( differentWords(words[i])< differentWords(goal))
                    goal = words[i];
            }
            System.out.println("");
            System.out.println("The searched word is: " + goal + ", the amount of different symbols is: " + differentWords(goal));
            in.close();
        }
    }

