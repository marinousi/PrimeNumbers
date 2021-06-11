import java.util.Scanner;

//CHALLENGE: https://edabit.com/challenge/z8vvSdWjAPu5ufBuR
public class Main {

    public static int primeNumbers(int num) {
        int prime = 0;
        int holder;

        for(int i = 2; i <= num; i++){           //both for's start with 2 because the minimum quantity of numbers that has a prime is 2
            holder = 0;

            for(int j = 2; j < i; j++){
                if(i % j == 0)                  //even numbers
                    holder++;
            }
            if(holder == 0)                      //if holder is 0, then it means it's a prime number
                prime++;
        }
        return prime;
    }


    public static void main(String[] args) {

        Scanner prompt = new Scanner (System.in);
        //so testing could be easier
        System.out.println("Type -1 to start the program.");
        System.out.println("Type -2 to stop the program.");
        int choice = prompt.nextInt();

        while (choice == -1) {
            System.out.print("Type a number: ");
            int number = prompt.nextInt();

            System.out.println("primeNumbers(" + number + ") -> " + primeNumbers(number));

            System.out.println("Type -1 to continue the program.");
            System.out.println("Type -2 to stop the program.");
            choice = prompt.nextInt();

            if (choice == -2) {
                System.out.println("Program ended!");
                break;
            }
        }


    }

}
