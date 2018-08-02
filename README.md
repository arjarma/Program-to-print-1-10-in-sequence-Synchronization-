# Program-to-print-1-10-in-sequence-Synchronization-

you can see there is a new class Printer which is the thread runnable interface which  has been implemented .

E:\arma project>javac Printing.java

E:\arma project>java Printing
Thread[Thread-0,5,main] 1
Thread[Thread-0,5,main] 2
Thread[Thread-0,5,main] 3
Thread[Thread-0,5,main] 4
Thread[Thread-0,5,main] 5
Thread[Thread-1,5,main] 6
Thread[Thread-1,5,main] 7
Thread[Thread-1,5,main] 8
Thread[Thread-1,5,main] 9
Thread[Thread-1,5,main] 10

here synchronozation has been implemented as the object has been pass in thread constructor and the 
the thread has been synchronized as object has put a lock until the thread of thread-0 has not finished.
NOTE:- Interview Question
