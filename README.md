# FibonacciWithThreads

This is a very simple project that calculates a Fibonacci sequence element many times and with threads to simulate a batch process that can use threads.

The simple code written in Java requires 3 parameters  
1. Number of threads
2. Cycles (number of times one thread will calculate the fibonacci number)
3. Element of fibonacci sequence to be calculated

The total number of times qur the code will calculate the fibonacci element is numberOfThreads * cycles


## Notes
This can kill your machine so keep the numbers of numberOfThreads, cycles, and Element of fibonacci LOW e.g:
- Number of threads: 80
- Cycles: 50
- Element of fibonacci sequence: 38
