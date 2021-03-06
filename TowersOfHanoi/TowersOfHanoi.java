
import java.util.Scanner;
public class Hanoi {
	public static int COUNTMOVES = 0;
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Let's play Towers of Hanoi!");
		System.out.println("Select a number of disks from 1 to 6: ");
		int disks = user.nextInt();
		while(disks > 6){
			System.out.println("Please enter a number from 1 to 6: ");
			disks = user.nextInt();
		}
		playTowers(disks, "A", "C", "B");
		System.out.println("f(n) = " + COUNTMOVES + " single moves");
	}
	
	public static void playTowers(int n, String A, String C, String B){
		if (n == 1) {
			System.out.println("1st Disk moves from " + A + " to "+ B);
			COUNTMOVES++;
	    } 
		else {
			playTowers(n-1, A, B, C);
			System.out.println("Disk " + n + " moves from " + A + " to " + B);
			COUNTMOVES++;
			playTowers(n-1, C, A, B);
	    }
	}
}
