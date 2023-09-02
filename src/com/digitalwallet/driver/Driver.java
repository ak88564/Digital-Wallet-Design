package com.digitalwallet.driver;

import com.digitalwallet.service.WalletService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        WalletService wService = new WalletService();
        Scanner sc = new Scanner(System.in);
        outer: while (true) {
            System.out.println("\n OPTIONS");
            System.out.println("1. Create wallet");
            System.out.println("2. Transfer Amount");
            System.out.println("3. Account statement");
            System.out.println("4. Overview");
            System.out.println("5. Exit");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("You selected create wallet");
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter amount");
                    BigDecimal amount = sc.nextBigDecimal();
                    wService.createWallet(name, amount);
                    break ;
                case 2:
                    System.out.println("You selected transfer");
                    System.out.println("Enter sender account number");
                    int from = sc.nextInt();
                    System.out.println("Enter receiver account number");
                    int to = sc.nextInt();
                    System.out.println("Enter amount");
                    BigDecimal amount1 = sc.nextBigDecimal();
                    wService.transfer(from, to, amount1);
                    break;
                case 3:
                    System.out.println("You selected account statement");
                    System.out.println("Enter account num");
                    wService.statement(sc.nextInt());
                    break ;
                case 4:
                    System.out.println("You selected overview");
                    wService.overview();
                    break ;
                case 5:
                    System.out.println("Application stopped");
                    break outer;
                default:
                    System.out.println("You have selected invalid option");
                    break ;

            }

        }
    }
}
