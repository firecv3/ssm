public class Test {

	public static void main(String[] args) {

		name();
	}

	public static void name3() {
		int total = 0;
		for (int m5 = 1; m5 <= 20; m5++) {
			for (int m2 = 1; m2 <= 33; m2++) {
				for (int m1 = 3; m1 <= 99; m1+=3) {
					if (m1/3 + m2 * 3 + m5 * 5 == 100 && m1+m2+m5==100) {
						System.out.println("¹«¼¦:" + m5 + "  Ä¸¼¦:" + m2 + "  Ð¡¼¦:"
								+ m1 );
						total++;
					}

				}
			}
		}
		System.out.println(total);
	}
	public static void nam2e() {
		
	}
	
	public static void name() {
		int num=90;
		  System.out.print(num+" = ");
		  for(int i=2;num!=1;i++) {
		   if(num%i==0) {
		    System.out.print(i);
		    if(num/i!=1) {
		     System.out.print("*");
		    }
		    num/=i;
		    i--;
		   }
		  }
	}
}
