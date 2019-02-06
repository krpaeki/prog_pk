public class Andmed1{
	
	public static int leiaSuurim(int[] andmed){
		int suurim = 0;
		for(int i=0; i<andmed.length; i++){
			if (andmed[i] > suurim){
				suurim = andmed[i];
			}
		}
		return suurim;	
	}
	
	public static int leiaSuurim2(int[] andmed){
		if(andmed.length == 0){return -1;}
		int suurim2=andmed[0];
		int koht = 1;
		while(koht<andmed.length){
			if(andmed[koht]>suurim2){suurim2=andmed[koht];}
			koht++;
		}		
		return suurim2;
	}
	
	public static void main(String [] arg){
		int[] pikkused=new int[4];
		pikkused[0]=168;
		pikkused[1]=158;
		pikkused[2]=178;
		pikkused[3]=173;
		System.out.println(pikkused[pikkused.length-1]);
		System.out.println(leiaSuurim(pikkused));
		System.out.println(leiaSuurim2(pikkused));
	}
}