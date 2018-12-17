package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] five = {"A" , "B" , "C" , "D" , "E"};
		//2. print the third element in the array
		System.out.println( five[2]);
		//3. set the third element to a different value
		five[2] = "F";
		//4. print the third element again
		System.out.println(five[2]);
		//5. use a for loop to print all the values in the array
		for(int i = 0; i < five.length; i++){
			System.out.println(five[i]);
		}
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		int[] fifty = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for(int i = 0; i < fifty.length; i++){
			fifty[i] = ran.nextInt();
			System.out.println(fifty[i]);
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = fifty[0];
		for(int i = 0; i < fifty.length; i++){
			if(fifty[i] < smallest){
				smallest = fifty[i];
			}
		}
		System.out.println(smallest);
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int largest = fifty[0];
		for(int i = 0; i < fifty.length; i++){
			if(fifty[i] > largest){
				largest = fifty[i];
			}
		}
		System.out.println(largest);
	}
}
