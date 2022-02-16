public class Assignment2{

	public static void main(String[] args){
	int [][] arr = {{22, 14, 55}, {66, 32, 99}, {15, 84, 92}};
	String position = "";
	int max = 0;
	for(int i = 0; i < arr.length; i++){
		for(int j = 0; j < arr.length; j++){
			System.out.print(arr[i][j] + " ");
			if(arr[i][j] > max){ 
				max = arr[i][j];
				position = "column " + (j+1) + ", row " + (i+1); 
			}
		}
		System.out.println();
	
	}
	System.out.println("Max is: " + max + " and its position is: " + position); 



	}
	




}
