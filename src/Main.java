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
            System.out.println("Which operation would you like to use: *,/,+,-?");
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
}

