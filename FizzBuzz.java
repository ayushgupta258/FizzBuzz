import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int num=1; num<=100; num++){
            if(num % 3 == 0)
                System.out.println("Fizz");
            else if(num % 5 == 0)
                System.out.println("Buzz");
            else if(num % 3 == 0 && num % 5 == 0)
                System.out.println("FizzBuzz");
            else if(Integer.toString(num).contains("3"))
                System.out.println("Fizz");
            else if(Integer.toString(num).contains("5"))
                System.out.println("Buzz");
            else
                System.out.println(""+num);
        }
    }
}