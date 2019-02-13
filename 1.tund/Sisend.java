public class Sisend{
	public static void main(String[] argumendid){
		System.out.println("Argumendid: " + argumendid.length);
		//mitu argumenti lisasid
		int summa = 0;
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i]);
			summa += argumendid[i].length();
		}
		//näitab argumendi sõna
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i].substring(0,1)+ " "+ argumendid[i].length());
		}
		System.out.println("Sõnade tähtede summa on: " + summa);
		//Kuvage argumenteides olevate sõnade tähtede arvu summa
	}
}