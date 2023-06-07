package test;
import java.util.Scanner;
public class Proj1 {

	public static void main(String[] args) {
		int [] array = new int[15];
		Scanner in = new Scanner(System.in);
		for(int i=0; i<array.length; i++)
		{
			System.out.format("inserisci il %d numero: ", i+1);
			array[i]=in.nextInt();
			if(array[i]<5)
			{
				System.out.println("Il numero é minore di 5");
			}
		}
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		in.close();
		
	}

}
