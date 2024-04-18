package org.example.cardemo.service;

import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        final int totalPages = 5;
        final int pageSize = 10;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the page number to display (1-5) or 0 to exit:");
            int pageNumber = scanner.nextInt();

            if (pageNumber == 0) {
                break;
            }

            if (pageNumber < 1 || pageNumber > totalPages) {
                System.out.println("Invalid page number. Please enter a number between 1 and " + totalPages);
                continue;
            }

            int start = (pageNumber - 1) * pageSize + 1;
            int end = pageNumber * pageSize;

            System.out.println("Showing results for page " + pageNumber + ":");
            for (int i = start; i <= end; i++) {
                System.out.println("Result " + i);
            }
            System.out.println("--- Page " + pageNumber + " of " + totalPages + " ---");
        }


        scanner.close();
    }
}
