public class Arvutus2{
	
	public static double leiaTakistus(double voimsus, double pinge){
		return pinge/leiaVool(voimsus, pinge);
	}
	
	public static double leiaVool(double voimsus, double pinge){
		return voimsus/pinge;
	}
	
	public static void main(String[] arg){
		System.out.println("Vool on: " + leiaVool(30, 220) + " amprit.");
		System.out.println("Takistus on: " + leiaTakistus(30, 220) + " oomi.");
	}
}

/*

[krispae@greeny 1. tund]$ java Arvutus2
0.13636363636363635

[krispae@greeny 1. tund]$ java Arvutus2
Vool on: 0.13636363636363635 amprit.
Takistus on: 1613.3333333333335 oomi.

*/