package ru.vsu.cs.vvp2021.g82.mitrofanov_m_d.Task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();

        double ideal = Solution.idealLog(x);

        double resultN = Solution.cosN(x, n);
        double deltaN = Math.abs(resultN - ideal);

        Result resultE = Solution.cosE(x, e);
        double deltaE = Math.abs(resultE.getSum() - ideal);

        Result resultE_10 = Solution.cosE(x, e*0.1);
        double deltaE_10 = Math.abs(resultE_10.getSum() - ideal);

        System.out.printf("Sum of n terms     : %.15f; delta = %e; count = %d\n", resultN, deltaN, n);
        System.out.printf("Sum of terms > e   : %.15f; delta = %e; count = %d\n", resultE.getSum(), deltaE, resultE.getCount());
        System.out.printf("Sum of terms > e/10: %.15f; delta = %e; count = %d\n", resultE_10.getSum(), deltaE_10, resultE_10.getCount());
        System.out.printf("Ideal value        : %.15f\n", ideal);
    }
}
