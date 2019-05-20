import java.util.*;
public class insertionSort {
	public static Scanner in=new Scanner (System.in);
	public static void main(String[] args) {
		int arraySize;
		int numOfSrtd=0;
		int num=0;
		int i=0;
		System.out.println("enter size of array ");
		arraySize= in.nextInt();
		int srtdArray[]= new int [arraySize];
		System.out.println("nter a number:");
		num= in.nextInt();
		srtdArray[0]=num;
		numOfSrtd++;
		while(numOfSrtd<arraySize)
		{
			
			System.out.println("nter a number:");
			num= in.nextInt();
		for(i=0; i<numOfSrtd&& srtdArray[i]<num;i++);
		for(int j=numOfSrtd; j>i; j-- )
		{
			srtdArray[j]=srtdArray[j-1];
		}
		srtdArray[i]=num;
		numOfSrtd++;
		}
		for (int h=0; h<srtdArray.length; h++ )
		{
			System.out.println(srtdArray[h]);
		}
}

}
