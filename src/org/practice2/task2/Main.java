package org.practice2.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Transport> transportMap = new HashMap<>();

        transportMap.put("101A", new Transport("Tram", "101A", "Ivan Petrov", 60, true));
        transportMap.put("3B", new Transport("Tram", "3B", "Anna Ivanova", 70, false));
        transportMap.put("5C", new Transport("Tram", "5C", "Oleg Sidorov", 65, true));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter tram route number (or 'exit' to quit):");
            String route = scanner.nextLine();

            if (route.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            if (transportMap.containsKey(route)) {
                System.out.println("org.practice2.task2.Transport information:");
                System.out.println(transportMap.get(route));
            } else {
                System.out.println("No tram found for route number: " + route);
            }
        }

        scanner.close();
    }
}