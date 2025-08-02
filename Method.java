package method;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
    	        Scanner scanner = new Scanner(System.in);

    	        System.out.print("Enter the number of elements in the array: ");
    	        int n = scanner.nextInt();

    	        int[] arr = new int[n];

    	        System.out.println("Enter the elements of the array:");
    	        for (int i = 0; i < n; i++) {
    	            arr[i] = scanner.nextInt();
    	        }

    	        System.out.println("Prime numbers in the array:");
    	        for (int num : arr) {
    	            if (isPrime(num)) {
    	                System.out.print(num + " ");
    	            }
    	        }
    	    }

    	    public static boolean isPrime(int num){
    	        if (num <= 1) {
    	            return false;
    	        }
    	        if(num <= 3) {
    	        	return true;
    	        }
    	     
    	         for(int i = 2; i <= num / 2; i++){
    	            	if(num % i == 0)
    		        return false;
    	 }
    	            return true;
 }
}