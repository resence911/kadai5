import java.util.Scanner;

public class IntToEng {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String str1[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    	String str2[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	if(0 <= n && n <= 10){
    		return str1[n];
    	} else if(11<= n && n <=19){
    		n  = n - 11;
    		return str2[n];
    	}
    	return "error";
    }
}
