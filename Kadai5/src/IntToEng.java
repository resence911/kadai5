import java.util.Scanner;

public class IntToEng {
	static String one2nineteen[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String ty[] = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(0 <= n && n <= 19){
    		return one2nineteen[n];
    	} else if(20<=n && n<=99) {
    		return twodigit(n);
    	} else if(100<=n && n<=999) {
    		return threedigit(n);
    	} else if(1000<=n && n <=9999){
    		return fourdigit(n);
    	} else if(10000<=n && n <= 99999){
    		return fivedigit(n);
    	} else if(100000<=n && n <= 999999){
    		return sixdigit(n);
    	} else if(1000000<=n && n<=9999999) {
    		return sevendigit(n);
    	} else if(10000000<=n && n<=99999999) {
    		return eightdigit(n);
    	}
    	return "error";
    }

	public static String eightdigit(int n) {
		int a = n/1000000;
		int b = n%1000000;
		return twodigit(a)+"million"+sixdigit(b);
	}

	public static String sevendigit(int n) {
		int a = n/1000000;
		int b = n%1000000;
		return one2nineteen[a]+"million"+sixdigit(b);
	}

	public static String sixdigit(int n) {
		int a = n / 1000;
		int b = n % 1000;
		return threedigit(a) + "thousand" + threedigit(b);
	}

	public static String fivedigit(int n) {
		int a = n / 1000;
		int b = n % 1000;
		return one2nineteen[a]+"thousand"+threedigit(b);
	}

	public static String fourdigit(int n) {
		int a = n/1000;
		int b = n%1000;
		return one2nineteen[a]+"thousand"+threedigit(b);
	}

	public static String threedigit(int n) {
		int a = n/100;
		int b = n%100;
		return one2nineteen[a]+"hundred"+twodigit(b);
	}

	public static String twodigit(int n) {
		return ty[n/10-2]+one2nineteen[n%10];
	}
}
