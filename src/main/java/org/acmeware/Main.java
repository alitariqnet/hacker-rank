package org.acmeware;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scan = new Scanner("42");
        int i = scan.nextInt();
        scan = new Scanner("33.22");

        double d = scan.nextDouble();
        scan = new Scanner("Islam is the answer to life, the universe, and everything!");

        String s = "";//scan.next();
        while(scan.hasNext()){
//            s = s+ scan.nextLine();
            System.out.println(scan.nextLine());
        }
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}