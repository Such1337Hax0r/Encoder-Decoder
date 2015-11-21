import java.util.*;
public class QEncoder {
	public static void main(String[] Args){
		System.out.println("Enter A Word");
		Scanner S = new Scanner(System.in);
	String IA = S.nextLine();
	char[] IAC = IA.toCharArray();
	int len = IAC.length;
	int[] IAI = new int[len];
	String[] AnotherOne = new String[len];
	for(int i = 0; i < IAC.length; i++){
		IAI[i] = IAC[i];
	}
	for(int i = 0; i < IAC.length; i++){
		IAI[i] = IAI[i] + 1;
	}
	for(int i = 0; i < IAC.length; i++){
		AnotherOne[i] = Integer.toBinaryString(IAI[i]);
	}
	for(int i = 0; i < AnotherOne.length; i++){
		System.out.print(AnotherOne[i] + " ");
		
	}
	}
}
