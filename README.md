# Coding Dojo Advanced OOP topics

Hello, and welcome to my repo for my solutions to Coding Dojo exercises in the **Java Academy self-directed Alumni course.**

The solutions to these exercises are my own - no posted solution was available, so the test of whether it was right or not was whether it workedn ..and was it as elegant as I could make it in a reasonable time frame before I wanted to move on.

Exercise text is commented above the class implementations. 

More interesting ones are listed first:

- [DoublyLinkedList](https://github.com/s-graham42/DojoJavaOOPAdv/blob/master/src/com/sgraham/DoublyLinkedList/DLL.java#L129):
    - Implementation of a doubly linked list.
    - **The most fun method** was the palindrome checker method which is what is linked.

- [Calculator II](https://github.com/s-graham42/DojoJavaOOPAdv/blob/master/src/com/sgraham/calculatortwo/Calculator2.java#L59):
    - This one was more interesting than Calculator I below:  Build the calculator class again...
    - This time allow any number of operands, and the same function will accept either a Double or a "+, -, *, /" or "=" to deal with.
    - The getResults() method will work through the entries and do the ~~PE~~MDAS operations in the right order and return a result.
    - Once again, there was no solution given by the platform, so this is my unadulterated solution.

- [Calculator I](https://github.com/s-graham42/DojoJavaOOPAdv/blob/master/src/com/sgraham/calculator/Calculator.java):
    - Build a claculator that for some reason takes 5 function calls to add or subtract two operands.
    - Cementing fundamental concepts of Java Beans.

- [Bank Account](https://github.com/s-graham42/DojoJavaOOPAdv/blob/master/src/com/sgraham/bank/BankAccount.java):
    - This was pretty Straightforward:
    - Build a BankAccount Class that can hold savings and checking account information as well as the Bank's total number of accounts and balance.
    - Write getters and setters for all the things.

- [Phones](https://github.com/s-graham42/DojoJavaOOPAdv/tree/master/src/com/sgraham/phones):
    - This was pretty straightforward too:
    - Working on Abstract Classes, Inheritance and Interfaces.
    - There's a *Ringable* interface, a *Phone* abstract class, and *Iphone* and *Galaxy* classes that inherit from *Phone*.

- [Tries](https://github.com/s-graham42/DojoJavaOOPAdv/blob/master/src/com/sgraham/triesintro/Trie.java):
    - Implementing Tries.
    - ToDo:  Write final method - recursive method to print all the keys.
