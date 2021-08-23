package main.java;

class Fibonacci extends Thread {
    private int cycles;
    private int fibonacciElement;

    public Fibonacci(int cycles, int fibonacciElement) {
        this.cycles = cycles;
        this.fibonacciElement = fibonacciElement;
    }

    public void run()
    {
        try {
            for (int i = 0; i < cycles; i++) {
                fibonacci(fibonacciElement);
                //System.out.println("Thread ID: " + Thread.currentThread().getId() + " is running for time: " + i);
            }
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

    public int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}