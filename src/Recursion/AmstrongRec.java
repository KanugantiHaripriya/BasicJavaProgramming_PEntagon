package Recursion;

public class AmstrongRec {
	
	public static int digits(int num,int count) {
		if (num==0) {
			return count;
		}
		return digits(num/10,count+=1);
	}
	
	public static int amstrongRec(int num,int res,int digits) {
		if(num==0) {
			return res;
		}
		else {
			return amstrongRec(num/10,(int)Math.pow(num%10,digits)+res,digits);
		}
	}

	public static void main(String[] args) {
		int num=123;
		int digits=digits(num,0);
		int res= amstrongRec(num,0,digits);
		if(num==res) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not an Amstrong number");
		}
	}
}
