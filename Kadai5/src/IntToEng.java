import java.util.Scanner;

public class IntToEng {
	static String str1[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	static String str2[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String str3[] = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }
	
	static String twodigit(int n) {
		return str3[n/10-2]+str1[n%10];
	}
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	
    	if(0 <= n && n <= 10){
    		return str1[n];
    	} else if(11<= n && n <=19){
    		n  = n - 11;
    		return str2[n];
    	} else if(20<=n && n<=99) {
    		return twodigit(n);
    	} else if(100<=n && n<=999) {
    		n = n/100;
    		return str1[n]+"hundred"+twodigit(n);
    	}
    	return "error";
    }
}
