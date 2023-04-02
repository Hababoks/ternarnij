import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int number;
        number = numberA > numberB ? numberA : numberB;

        System.out.println(number);
        }
    }
