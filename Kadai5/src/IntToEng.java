import java.util.Scanner;

public class IntToEng {
	static String one2ten[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	static String eleven2nineteen[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String ty[] = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(0 <= n && n <= 10){
    		return one2ten[n];
    	} else if(11<= n && n <=19){
    		n  = n - 11;
    		return eleven2nineteen[n];
    	} else if(20<=n && n<=99) {
    		return twodigit(n);
    	} else if(100<=n && n<=999) {
    		return threedigit(n);
    	} else if(1000<=n && n <=9999){
    		return fourdigit(n);
    	}
    	return "error";
    }

	public static String fourdigit(int n) {
		int a = n/1000;
		int b = n%1000;
		return one2ten[a]+"thousand"+threedigit(b);
	}

	public static String threedigit(int n) {
		int a = n/100;
		int b = n%100;
		return one2ten[a]+"hundred"+twodigit(b);
	}

	public static String twodigit(int n) {
		return ty[n/10-2]+one2ten[n%10];
	}
}
