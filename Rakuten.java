Rakuten
----------
92nd
-------



import java.io.*;



class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		
		int[] array = new int[]{10, 20, 50, 45, 1, 2};
		//int[] array = new int[]{};
		
		int max = array[0];
		int secondMax = array[0];
		for(int i=0; i<array.length; i++){
		    
		    if(max < array[i]){
		        secondMax = max;
		        max = array[i];

		    } else if(secondMax < array[i]){
		        secondMax = array[i];
		    }
		}
		
		System.out.println("Max : " + max);
		System.out.println("Second Max : " + secondMax);
		
		//

		
		
	}
}



String str = "Sidharth";

//str = "Aravind";
String str1;

str1 = str.toUpperCase();


when(utilObj.divide(anyInt(), 4)).thenReturn(2);
