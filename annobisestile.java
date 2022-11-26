package esercizicarlo;

import java.util.Scanner;
public class annobisestile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Scrivi un anno");

   Scanner sc = new Scanner(System.in);
     int anno=sc.nextInt();
		
		
		boolean bisestile = (
			      anno > 1584 && 
			      (
			        (anno % 400 == 0) || 
			        (anno %4 == 0 && anno % 100 != 0)
			      )
			    );
		
		if(bisestile==true) {
			System.out.println("--------anno bisestile--------------");
			
		}
		else {System.out.println("---------non e bisestile----------");}
		
		for(int i=1584;i<2051;i++) {
			if(i > 1584 && 
		      (
		        (i % 400 == 0) || 
		        (i %4 == 0 && i % 100 != 0)
		      )) {
				System.out.println(i);
			}
		}
	}

}
