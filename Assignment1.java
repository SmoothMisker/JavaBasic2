import java.util.*;
import java.io.*;

public class Assignment1{

	public static void main(String[] args){
		
		String numb = "";
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){
				System.out.println("Please enter an integer number(or enter EXIT to add the numbers entered so far): ");
				numb = br.readLine();
				numb.toLowerCase();
				if(numb.equals("exit")){
					break;
				}else{
					nums.add(Integer.parseInt(numb));		
				}
			}
			for(int i: nums){
				sum += i;	
			}

			System.out.println("The sum of the numbers entered is: " + sum) ;
		}catch (IOException e){
			System.out.println(e);
		}		
	


	}





}
