public class Euclid {
	public static int gcd(int a, int b){
		if(a%b==0){
			return b;
		}
		else{
			return gcd(b,a%b);
		}
	}
	
	public static double geometric(int a){
		
		if(a==1){
			return a;
		}
		else{
			
			return 1/(double)Math.pow(2, a-1) + geometric(a-1);
		}
	}
	
	public static double basel(int a){
		if(a==1){
			return a;
		}
		else{
			return 1/(double)Math.pow(a, 2)+ basel(a-1);
		}
	}
	
	public static String scrambler(String a){
		if(a.length()==0){
			return "";
		}
		else if(a.length()==1){
			return a;
		}
		else if(a.length()==2){
			return new StringBuffer(a).reverse().toString();
		}
		else{
			return String.valueOf(a.charAt(a.length()-1))+ scrambler(a.substring(1,(a.length()/2))) + scrambler(a.substring((a.length()/2),a.length()-1)) + String.valueOf(a.charAt(0));
		}
	}

}
