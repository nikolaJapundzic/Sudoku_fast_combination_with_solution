package paket1;

public class Permutacije_moje {

	
		
	public static String unos;
	public static String[]niz;
	public static int brojac;
	
	public static void main(String[] args) {
		unos = "1231";
		niz= unos.split("");
		
		
		
		

		if(niz.length > 2){
			//BROJ MOGUCIH KOMBINACIJA
			int brojKombinacija = 1;
			brojac = niz.length;
			//FAKTORIJEL OD BROJA
			while(brojac > 0) {
				brojKombinacija *= brojac;
				brojac--;
			}
			//FAKTORIJEL OD BROJA
			
			while(brojKombinacija > brojac) {
				
				for(int i = niz.length-1; i>0; i--) {
					niz = zamena(niz, i-1, i);
					brojac++;
					stampajKombinaciju();
				}
				niz = zamena(niz, niz.length-2, niz.length-1);
				brojac++;
				stampajKombinaciju();
				
				
				for(int i = 0; i <niz.length-1; i++) {
					niz = zamena(niz, i, i+1);
					brojac++;
					stampajKombinaciju();
				}
				niz = zamena(niz, 0, 1);
				brojac++;
				stampajKombinaciju();
				
			}
			
			
		}else {
			stampajKombinaciju();
		}


	}
	
	
	
	public static String[] zamena(String [] niz, int leviBroj, int desniBroj){
		String[]nizPermutiran = niz;
		
		String memorija = nizPermutiran[desniBroj];
		nizPermutiran[desniBroj] = nizPermutiran[leviBroj];
		nizPermutiran[leviBroj] = memorija;
		
		return nizPermutiran;
	}
	
	public static void stampajKombinaciju() {
		if(niz.length > 2){
			System.out.print(brojac + " ");
			for(int j = 0; j<niz.length; j++) {
				System.out.print(niz[j]);
			}
			System.out.println();
		}else if(niz.length == 2) {
			System.out.println(niz[0] +""+ niz[1]);
			System.out.println(niz[1] +""+ niz[0]);
		}else if(niz.length == 1) {
			if(unos.equals("")) {
				System.out.println("-1");
			}else {
				System.out.println(niz[0]);
			}
		}
		
	}

}
