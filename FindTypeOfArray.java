import java.util.*;
public class FindTypeOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int value = CheckTypeOfArray(arr);
		if(value == 1){
			System.out.println("Even");
		}
		else if(value == 2){
			System.out.println("Odd");
		}
		else{
			System.out.println("Mixed");
		}
	}
	public static int CheckTypeOfArray(int[] arr){
		if(Arrays.stream(arr).allMatch(element -> element%2 == 0)){
			return 1;
		}
		if(Arrays.stream(arr).allMatch(element -> element%2 != 0)){
			return 2;
		}
		return 3;
	}
}
