import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int num=1; num<=100; num++){
            if(num == 3)
                System.out.println("Fizz");
            else
                System.out.println(""+num);
        }
    }
}