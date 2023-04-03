import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 04" + "\n");
        Scanner reader = new Scanner(System.in);

        //        1a. Napravite 4 funkcije koje int-ove: sabiraju, oduzimaju,mnoze, djele
        int result;
        result = Main.add(150, 250);
        result = Main.sub(8, 6);
        result = Main.div(9, 3);
        result = Main.mul(15, 63);


        System.out.println("Task 1.aa" + "\n");
//        Napravite petlju koja ukoliko ima predefiniran neki broj u varijabli  "total"  koja je deklarisana prije while-a i koji je razlicit od nula
//        While petlja ce traziti da unosite za svaki loop pozitivan broj. Ukoliko unesete negativan broj while petlja zavrsava.
        int total = 8;
        while (total >= 0) {
            System.out.println("Please enter a positive number");
            total = reader.nextInt();
        }

        System.out.println("\n" + "Task 1.aaa" + "\n");
//        Napravite petlju koja ce za svaki ukljucujuci i za pocetni broj traziti da unosite za svaki loop pozitivan broj.
//        Ukoliko unesete negativan broj while petlja zavrsava.
        do {
            System.out.println("Please enter a positive number");
            total = reader.nextInt();
        } while (total >= 0);
        System.out.println("\n" + "Task 1.b" + "\n");
//        Napravite petlju koja prima brojeve no ukoliko se posalje broj -1000 izadje iz petlje
//        U konzoli neka se ispise "Please enter any integer" prije vaseg unosa broja.
//        nakon sto unesete -1000 napisite poruku da je exit broj -1000 detektovan.
        int a = 0;
        do {
            System.out.println("Number -1000 exits the loop. Please enter a number: ");
            a = reader.nextInt();
        } while (a != -1000);
        {
            System.out.println("The exit number: " + a + " has been detected.");
        }
        System.out.println("\n" + "Task 1.c" + "\n");
//        Modifikujte petlju da sabira prethodno upisan broj i novi broj i zatim ispise total
//        ukoliko nikakav broj nije deklarisan kao pocetni pocinje od broja 0 :
//        ie. Please enter integer: 4
//        Total of 0 and 4 is 4.
        int previousNumber = 0;
        int currentNumber = 0;
        while (currentNumber != -1000) {
            System.out.println("Number -1000 exits the loop. Please enter a number: ");
            currentNumber = reader.nextInt();
            if (currentNumber == -1000) break;
            System.out.println("Total of " + previousNumber + " and " + currentNumber + " is " + Main.add(previousNumber, currentNumber));
            previousNumber = currentNumber;
        }
        System.out.println("The exit number: " + a + " has been detected.");
        System.out.println("\n" + "Task 1.d; 1.e" + "\n");
//        Modifikujte petlju da  trazi znak za artimeticku operaciju prije broja.
//        Which operation would you like to use: *,/,+,-?  ---- +
//        Please enter integer: 5
//        Total of 0 and 5 is 5;
        previousNumber = 0;
        currentNumber = 0;
        String operator;
        while (currentNumber != -1000) {
            System.out.println("Which operation would you like to use: *,/,+,-?");
            reader.nextLine();
            operator = reader.nextLine();
            System.out.println("Number -1000 exits the loop. Please enter a number: ");
            currentNumber = reader.nextInt();
            if (currentNumber == -1000) break;
            if (operator.equals("*")) {
                System.out.println("Multiplication: Total of " + previousNumber + " and " + currentNumber + " is " + Main.mul(previousNumber, currentNumber));
            } else if (operator.equals("/")) {
                System.out.println("Division: Total of " + previousNumber + " and " + currentNumber + " is " + Main.div(previousNumber, currentNumber));
            } else if (operator.equals("+")) {
                System.out.println("Addition: Total of " + previousNumber + " and " + currentNumber + " is " + Main.add(previousNumber, currentNumber));
            } else if (operator.equals("-")) {
                System.out.println("Subtraction: Total of " + previousNumber + " and " + currentNumber + " is " + Main.sub(previousNumber, currentNumber));
            }
            previousNumber = currentNumber;
        }
        System.out.println("The exit number: " + a + " has been detected.");
        System.out.println("\n" + "Task 1.f" + "\n");
//        Modifikujte petlju da mozete artimeticke operacije da radite u nedogled sve dok ne upisete "=" i zatim enter kada ce se ispisati samo total
        result = 0;
        do {
            System.out.println("Which operation would you like to use: *,/,+,-? (Enter = to see the result)");
            reader.nextLine();
            operator = reader.nextLine();
            if (operator.equals("=")) {
                break;
            }
            System.out.println("Please enter a number: ");
            currentNumber = reader.nextInt();
            if (operator.equals("*")) {
                result = Main.mul(result, currentNumber);
            } else if (operator.equals("/")) {
                result = Main.div(result, currentNumber);
            } else if (operator.equals("+")) {
                result = Main.add(result, currentNumber);
            } else if (operator.equals("-")) {
                result = Main.sub(result, currentNumber);
            }
        } while (!operator.equals("="));
        {
            System.out.println("The final result is: " + result);
        }
        System.out.println("\n" + "Task 2" + "\n");
//        Napravite petlju u koju unosite brojeve kada petlja detektuje broj -10, ispise vam se niz brojeva koje ste unjeli. Zatim ce vam se na ekranu pojaviti pitanje da li zelite da prosirite array sa opcijama y/n.
//        Ukoliko upisete y, ponovno unosite brojeve koji cete dodavati na niz kada ponovno unesete -10 ispisu vam se svi brojevi koje ste unjeli.
        int[] array = new int[100];
        int num;
        int index = 0;
        boolean yesOrNo = true;
        do {
            System.out.println("What is the number you would like to add to the array? (Type in -10 to see your array.)");
            num = reader.nextInt();
            if (num != -10) {
                array[index] = num;
                index++;
            } else {
                System.out.println("Your array is: ");
                for (int i = 0; i < index; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println("\n" + "Do you want to expand your array? y/n");
                reader.nextLine();
                String yOrN = reader.nextLine();
                if (yOrN.equals("n")) {
                    yesOrNo = false;
                } else {
                    yesOrNo = true;
                }
            }
        } while (yesOrNo == true);
        System.out.println("\n" + "Task 3" + "\n");
        //        Napravite funkciju koja provjereava da li je nesto palindrom,
//        Napravite Funkciju koja iz niza izbacuje brojeve koji mi specifikujemo,
//        Napravite funkciju koja provjerava da li je broj djeljiv sa brojem x.
//        Kada se pokrene aplikacija Pojavi vam se meni
        System.out.println("Menu: ");
        System.out.println("1. Is word a palindrome?");
        System.out.println("2. Filter an array!");
        System.out.println("3. Is number divisible by x?");
        System.out.println("Type in the number 1, 2 or 3");
        int menuNum = reader.nextInt();
        if (menuNum == 1) {
            System.out.println("Enter a word to check if it is a palindrome:");
            reader.nextLine();
            String wordPalindrome = reader.nextLine();
            if (wordHasVowels(wordPalindrome)) {
                System.out.println("The word " + wordPalindrome + " is a palindrome.");
            } else {
                System.out.println("The word " + wordPalindrome + " is not a palindrome.");
            }
        } else if (menuNum == 2) {
            index = 0;
            do {
                System.out.println("What is the number you would like to add to the array? (Type in -1000 to finish your array.)");
                num = reader.nextInt();
                if (num != -1000) {
                    array[index] = num;
                    index++;
                } else {
                    System.out.println("Your array is: ");
                    for (int i = 0; i < index; i++) {
                        System.out.print(array[i] + " ");
                    }
                }
            } while (num != -1000);
            System.out.println("\n" + "Enter a number you would like to remove from array: ");
            int numDel = reader.nextInt();
            int[] filterArray = filterArray(array, numDel);
            System.out.println("Your filtered array is: ");
            for (int i = 0; i < index - 1; i++) {
                System.out.print(filterArray[i] + " ");
            }
        } else if (menuNum == 3) {
            System.out.println("Enter a dividend: ");
            int dividend = reader.nextInt();
            System.out.println("Enter a divisor: ");
            int divisor = reader.nextInt();
            if (isNumberDivisibleByX(dividend, divisor)) {
                System.out.println("Number " + dividend + " is divisible by " + divisor + " .");
            } else {
                System.out.println("Number " + dividend + " is not divisible by " + divisor + " .");
            }
        }
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

    static int div(int x, int y) {
        return x / y;
    }

    static int mul(int x, int y) {
        return x * y;
    }

    static boolean isNumberDivisibleByX(int dividend, int divisor) {
        return (dividend % divisor) == 0;
    }

    static int[] filterArray(int[] array, int numDel) {
        int index = 0;
        int[] filterArray = new int[array.length - 1];
        for (int i = 0; i < filterArray.length; i++) {
            if (array[i] != numDel) {
                filterArray[index++] = array[i];
            }
        }
        return filterArray;
    }

    static boolean wordHasVowels(String wordPalindrome) {
        boolean wordIsPalindrome = true;
        char[] wordPalindromeToCharArray = wordPalindrome.toCharArray();
        char[] reverseWordPalindromeToCharArray = new char[wordPalindromeToCharArray.length];
        for (int i = 0; i < wordPalindromeToCharArray.length; i++) {
            reverseWordPalindromeToCharArray[i] = wordPalindromeToCharArray[wordPalindromeToCharArray.length - 1 - i];
        }
        for (int i = 0; i < wordPalindromeToCharArray.length; i++) {
            if (wordPalindromeToCharArray[i] != reverseWordPalindromeToCharArray[i]) {
                wordIsPalindrome = false;
            } else {
                wordIsPalindrome = true;
            }
        }
        return wordIsPalindrome;
    }
}

