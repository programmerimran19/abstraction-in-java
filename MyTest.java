/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytest;

//import java.util.Scanner;

/**
 *
 * @author Programmer Imran
 */
public abstract class MyTest {

    abstract void calculate(int i,int j);
    
    public static void main(String[] args) {
        
        /*System.out.println("Java Abstraction Implementation");
        
        System.out.println("Addition Input");
        Scanner add = new Scanner(System.in);
        int i = add.nextInt();
        int j = add.nextInt();*/
        
        
        Addition A = new Addition();
        A.calculate(30, 10);
        //A.calculate(i, j);
        
        /*System.out.println("Subtraction Input");
        Scanner sub = new Scanner(System.in);
        int a = sub.nextInt();
        int b = sub.nextInt();*/
        //Subtraction s = new Subtraction();
        //s.calculate(30, 10);
        //s.calculate(a, b);
        
        /*System.out.println("Multiplication 1input");
        Scanner mul = new Scanner(System.in);
        int x = mul.nextInt();
        int y = mul.nextInt();*/
        //Multiplication m = new Multiplication();
        //m.calculate(30, 10);
        //m.calculate(x, y);
        
    }
    
}
