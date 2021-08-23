package main.java;

import java.time.LocalDateTime;

public class FibonacciWithThreadsMain {

    public static void main(String[] args)
    {
        int numberOfThreads = Integer.parseInt(args[0]); // Number of threads
        int cycles = Integer.parseInt(args[1]); // Cycles
        int fibonacciElement = Integer.parseInt(args[2]); //Element of fibonacci sequence to be calculated

        System.out.println("Number of threads: " + numberOfThreads + ", cycles: " + cycles + ", fibonacci element: " + fibonacciElement + ", total times to calculate: " + (numberOfThreads * cycles));
        System.out.println("Start time: " + LocalDateTime.now());

        for (int i = 0; i < numberOfThreads; i++) {
            Fibonacci singleThread = new Fibonacci(cycles, fibonacciElement);
            singleThread.start();
        }
    }
}