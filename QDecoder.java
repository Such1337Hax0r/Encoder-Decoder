import java.util.*;
public class QDecoder {
	public static void main(String[] Args){
		boolean B = true;
		Scanner S = new Scanner(System.in);
		
		while(B){
			System.out.println("Enter A Binary String");
			String J = "";
			J = S.nextLine();
			String[] NS = new String[J.split(" ").length];
			if(J.contains(" ")){
				NS = J.split(" ");
				for(int X = 0; X < NS.length; X++){
					System.out.print(Character.toChars(((Integer.parseInt(NS[X], 16) -1) * 2) / 3));
				}
				
				
			}
			System.out.println("");
			System.out.println("More? (Y/N)");
			if(S.nextLine().equalsIgnoreCase("N")){
				B = false;
			}
		}
	}
}
