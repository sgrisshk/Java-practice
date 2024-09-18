import java.lang.Math;
import java.util.Scanner;
public class NeuroConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your amount?:");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        converter(amount);
    }

    public static void converter(double amount) {
        int neuroWholeAmount1 = 0;
        int neuroWholeAmount9 = 0;
        int neuroWholeAmount49 = 0;
        int neuroWholeAmount = (int) (amount);
        amount -= neuroWholeAmount;

        // Округление до двух знаков после запятой
        amount = Math.round(amount * 100.0) / 100.0;
        System.out.println(amount);

        if (amount >= 0.49) {
            while (amount >= 0.49) {
                amount -= 0.49;
                neuroWholeAmount49 += 1;
                amount = Math.round(amount * 100.0) / 100.0;  // Повторное округление после вычитания
            }
        }

        if (amount >= 0.09) {
            while (amount >= 0.09) {
                amount -= 0.09;
                neuroWholeAmount9 += 1;
                amount = Math.round(amount * 100.0) / 100.0;  // Повторное округление
            }
        }
        if (amount >= 0.01) {
            while (amount >= 0.01) {
                amount -= 0.01;
                neuroWholeAmount1 += 1;
                amount = Math.round(amount * 100.0) / 100.0;  // Повторное округление
            }
        }

        System.out.println(neuroWholeAmount);
        System.out.println(neuroWholeAmount49);
        System.out.println(neuroWholeAmount9);
        System.out.println(neuroWholeAmount1);

    }
}