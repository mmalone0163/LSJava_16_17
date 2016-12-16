package lsrhs.java;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RPNMain {
	public static String readLine(String prompt) {
//        String line = null;
//        Console c = System.console();
//        if (c != null) {
//             line = c.readLine(prompt);
//        } else {
//            System.out.print(prompt);
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            try {
//                 line = bufferedReader.readLine();
//            } catch (IOException e) {
//                //Ignore
//            }
//        }
//        return line;
		System.out.print(prompt);
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		return s;
	}
	
	public static String[] getTokens(String s) {
		return s.split(" ");
	}


	public static void main(String[] args) {
		RPNStack myStack = new RPNStack();
	
		myStack.registerOperator(new RPNAddOperator());
		
		String [] tokens = getTokens(readLine(": "));
		for (String t : tokens) {
			//System.out.println(t);
			myStack.push(t);
		}
		
		myStack.print();
		
//		myStack.push("3");
//		myStack.push("4");
//		
//		myStack.print();
//		
//		myStack.push("+");
//		
//		myStack.print();
		
		//  add 4+ items to stack
		// print stack
		// pop off a couple
		// print again
	}

}
