package com.ahsanburney;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer =new Customer("BOB",54.96);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balnace for Customer " + customer.getName() + " is " + customer.getBalance() );

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0;i<intList.size();i++){
            System.out.println(i + ": " + intList.get(i));
        }

        System.out.println("==================================");

        intList.add(1,2);
        for(int i=0;i<intList.size();i++){
            System.out.println(i + ": " + intList.get(i));
        }


    }
}
