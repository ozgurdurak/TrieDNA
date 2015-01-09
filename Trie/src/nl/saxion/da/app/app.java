package nl.saxion.da.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nl.saxion.da.model.Data;
import nl.saxion.da.model.Node;
import nl.saxion.da.model.Trie;



public class app
{
	public 	static void main (String args[]) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File("File.txt"));
		Node boom = new Node();
		System.out.print("programming running \r\n");
		int positie = 0;
		boolean flag = false;
		while (scanner.hasNext()) {

			String woord = scanner.next().toLowerCase();
			ArrayList<Integer> posities = new ArrayList<Integer>();
			for (int counter = 0; counter < woord.length(); counter++) {
				posities.add(positie++);
			}
			System.out.println(posities.toString());

			boom.insert(woord, new Data(posities));
			System.out.print(woord + "\r\n");
			positie++;
		}
		scanner.close();
		boom.prettyPrint();
		
		System.out.println("Ik ga nu searchen");
		
		List<Data> search = boom.search("ozgur");
		
		if (search != null){
			for(Data data : search){
				System.out.println(data.getPositions());
			}
			System.out.println("Woord gevonden");
		}else{
			System.out.println("Woord niet gevonden");
		}


		System.out.print(" \r programming is done");
		
		
		
//		Scanner scanner = new Scanner(new File("File.txt"));
//		Node boom = new Node();
//		System.out.print("programming running \r\n");
//		int positie = 0;
//		 boolean flag = false;
//		while(scanner.hasNext())
//		{
//			
//			String woord = scanner.next().toLowerCase();
//			ArrayList<Integer> posities = new ArrayList<Integer>();
//			for(int counter =0; counter < woord.length(); counter++)
//			{
//				posities.add(positie++);
//			}
////			posities.add(positie);
////			posities.add(woord.length()-1);
//			//System.out.println("huidige positie: " + positie + " dat is letter: " + woord.charAt(positie));
//			System.out.println(posities.toString());
//	
//			boom.insert(woord,new Data(posities));
//			System.out.print(woord +"\r\n");
//			positie++;
////			if(positie % 2 > 0)
////			{
////			positie += woord.length()-1 /2 +1;	
////			}
//		}
//		scanner.close();
//		System.out.println("PrettyPrint?");
//		boom.prettyPrint();
//		
//		System.out.println(boom.search("a") + " <<<<<");
//		
//		String zoekwoord = "ab";
//		char[] letter = zoekwoord.toCharArray();
//		if(letter[0] == 'b')
//		{
//			System.out.println("gelijk");
//		}
//		else{System.out.println("niet gelijk");}
		
		
	
		System.out.print(" \r programming is done");
	}
}
