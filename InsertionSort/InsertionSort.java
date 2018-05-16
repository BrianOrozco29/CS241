
import java.util.Arrays;


public class Isort {
	public static int COMPCOUNT;
	public static void main(String[] args) {
		smallN();
		System.out.println();
		bigN();
		
	}
	
	public static int[] doIsort(int[] a, int n){
		
		COMPCOUNT = 0;
		int temp;
		for (int i = 1; i < n; i++){
			for(int j =i; j>0 && a[j] < a[j-1]; j--){
				smaller(a, i, j);
				temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				
			}
		}
		return a;
	}
	
	public static boolean smaller(int[] a, int i, int j){
		
		if(a[i] < a[j]){
			COMPCOUNT++;
			return true;
		}
		COMPCOUNT++;
		return false;
	}
	
	public static void smallN(){
		int[] sm = new int[32];
		for(int i=0; i<sm.length; i++){
			sm[i] = (int) (Math.random() * 100);
		}
		System.out.println("n = " + sm.length + '\n' + Arrays.toString(sm));
		doIsort(sm, sm.length);
		System.out.println(Arrays.toString(sm) + "\n" + "COMPCOUNT = "+ COMPCOUNT);
	}
	
	public static void bigN(){
		
		System.out.println("Running Big N insertion sorts:");
		int[] big1 = new int[100];
		for(int i=0; i<big1.length; i++){
			big1[i] = (int) (Math.random() * 100);
		}
		System.out.println("n = " + big1.length);
		doIsort(big1, big1.length);
		System.out.println("COMPCOUNT = "+ COMPCOUNT + "\n");
		
		int[] big2 = new int[1000];
		for(int i=0; i<big2.length; i++){
			big2[i] = (int) (Math.random() * 100);
		}
		System.out.println("n = " + big2.length);
		doIsort(big2, big2.length);
		System.out.println("COMPCOUNT = "+ COMPCOUNT + "\n");
		
		int[] big3 = new int[10000];
		for(int i=0; i<big3.length; i++){
			big3[i] = (int) (Math.random() * 100);
		}
		System.out.println("n = " + big3.length);
		doIsort(big3, big3.length);
		System.out.println("COMPCOUNT = "+ COMPCOUNT + "\n");
		
	}
	
}
