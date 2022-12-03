import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int result = 1;
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i = i + 1) {
            result = result * i;
            }
            System.out.println("Факториал числа " + value + " равен " + result);
        }

    }


