package paket1;

import java.util.ArrayList;

public class Algoritam_resavanje_sudoku_kombinacije extends Algoritam_brz_isecanje {
	
	public static String unos;
	public static String[]nizString;
	public static int brojacString;

	public static void main(String[] args) {
		generisanjeNizaSudoku();
		ispisNaEkranuCeleTabele();
		
		procenatKolikoFaliUTabeli = 45;
		
		int [] niz = generisanjeNizaSudokusaIzuzetim();
		ispisNaEkranuCeleTabele();
		
		
		
		//PROVERA
		int brojac = 0;
		
		//HORIZONTALE
		int [] niz_1_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_1_a[i] = niz[brojac];
			brojac++;
		}
		int [] niz_2_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_2_a[i] = niz[brojac];
			brojac++;
		}
		int [] niz_3_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_3_a[i] = niz[brojac];
			brojac++;
		}
		int [] niz_4_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_4_a[i] = niz[brojac];
			brojac++;
		}
		int [] niz_5_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_5_a[i] = niz[brojac];
			brojac++;
		}
		int [] niz_6_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_6_a[i] = niz[brojac];
			brojac++;
		}
		int [] niz_7_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_7_a[i] = niz[brojac];
			brojac++;
		}
		int [] niz_8_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_8_a[i] = niz[brojac];
			brojac++;
		}
		int [] niz_9_a = new int[9];
		for(int i = 0; i<9; i++) {
			niz_9_a[i] = niz[brojac];
			brojac++;
		}
		//HORIZONTALE
		
		//VERTIKALE
		int [] niz_1_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_1_b[i] = niz[i*9];
		}
		
		int sabirac = 1;
		int [] niz_2_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_2_b[i] = niz[sabirac];
			sabirac+=9;
		}
		
		sabirac = 2;
		int [] niz_3_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_3_b[i] = niz[sabirac];
			sabirac+=9;
		}
		
		sabirac = 3;
		int [] niz_4_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_4_b[i] = niz[sabirac];
			sabirac+=9;
		}
		
		sabirac = 4;
		int [] niz_5_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_5_b[i] = niz[sabirac];
			sabirac+=9;
		}
		
		sabirac = 5;
		int [] niz_6_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_6_b[i] = niz[sabirac];
			sabirac+=9;
		}
		
		sabirac = 6;
		int [] niz_7_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_7_b[i] = niz[sabirac];
			sabirac+=9;
		}
		
		sabirac = 7;
		int [] niz_8_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_8_b[i] = niz[sabirac];
			sabirac+=9;
		}
		
		sabirac = 8;
		int [] niz_9_b = new int[9];
		for(int i = 0; i<9; i++) {
			niz_9_b[i] = niz[sabirac];
			sabirac+=9;
		}
		//VERTIKALE
		
		//KVADRATI
		int [] niz_1_c = new int[9];
		niz_1_c[0] = niz[0];
		niz_1_c[1] = niz[1];
		niz_1_c[2] = niz[2];
		niz_1_c[3] = niz[9];
		niz_1_c[4] = niz[10];
		niz_1_c[5] = niz[11];
		niz_1_c[6] = niz[18];
		niz_1_c[7] = niz[19];
		niz_1_c[8] = niz[20];
		
		
		
		int [] niz_2_c = new int[9];
		niz_2_c[0] = niz[3];
		niz_2_c[1] = niz[4];
		niz_2_c[2] = niz[5];
		niz_2_c[3] = niz[12];
		niz_2_c[4] = niz[13];
		niz_2_c[5] = niz[14];
		niz_2_c[6] = niz[21];
		niz_2_c[7] = niz[22];
		niz_2_c[8] = niz[23];
		
		
		int [] niz_3_c = new int[9];
		niz_3_c[0] = niz[6];
		niz_3_c[1] = niz[7];
		niz_3_c[2] = niz[8];
		niz_3_c[3] = niz[15];
		niz_3_c[4] = niz[16];
		niz_3_c[5] = niz[17];
		niz_3_c[6] = niz[24];
		niz_3_c[7] = niz[25];
		niz_3_c[8] = niz[26];
		
		int [] niz_4_c = new int[9];
		niz_4_c[0] = niz[27];
		niz_4_c[1] = niz[28];
		niz_4_c[2] = niz[29];
		niz_4_c[3] = niz[36];
		niz_4_c[4] = niz[37];
		niz_4_c[5] = niz[38];
		niz_4_c[6] = niz[45];
		niz_4_c[7] = niz[46];
		niz_4_c[8] = niz[47];
		
		int [] niz_5_c = new int[9];
		niz_5_c[0] = niz[30];
		niz_5_c[1] = niz[31];
		niz_5_c[2] = niz[32];
		niz_5_c[3] = niz[39];
		niz_5_c[4] = niz[40];
		niz_5_c[5] = niz[41];
		niz_5_c[6] = niz[48];
		niz_5_c[7] = niz[49];
		niz_5_c[8] = niz[50];
		
		int [] niz_6_c = new int[9];
		niz_6_c[0] = niz[33];
		niz_6_c[1] = niz[34];
		niz_6_c[2] = niz[35];
		niz_6_c[3] = niz[42];
		niz_6_c[4] = niz[43];
		niz_6_c[5] = niz[44];
		niz_6_c[6] = niz[51];
		niz_6_c[7] = niz[52];
		niz_6_c[8] = niz[53];
		
		int [] niz_7_c = new int[9];
		niz_7_c[0] = niz[54];
		niz_7_c[1] = niz[55];
		niz_7_c[2] = niz[56];
		niz_7_c[3] = niz[63];
		niz_7_c[4] = niz[64];
		niz_7_c[5] = niz[65];
		niz_7_c[6] = niz[72];
		niz_7_c[7] = niz[73];
		niz_7_c[8] = niz[74];
		
		int [] niz_8_c = new int[9];
		niz_8_c[0] = niz[57];
		niz_8_c[1] = niz[58];
		niz_8_c[2] = niz[59];
		niz_8_c[3] = niz[66];
		niz_8_c[4] = niz[67];
		niz_8_c[5] = niz[68];
		niz_8_c[6] = niz[75];
		niz_8_c[7] = niz[76];
		niz_8_c[8] = niz[77];
		
		int [] niz_9_c = new int[9];
		niz_9_c[0] = niz[60];
		niz_9_c[1] = niz[61];
		niz_9_c[2] = niz[62];
		niz_9_c[3] = niz[69];
		niz_9_c[4] = niz[70];
		niz_9_c[5] = niz[71];
		niz_9_c[6] = niz[78];
		niz_9_c[7] = niz[79];
		niz_9_c[8] = niz[80];
		//KVADRATI
		
		//RAZVRSTAO SAM PO REDOVIMA I PO KVADRATIMA
		//PLAN:
		
		/*
		for(int i = 0; i<niz_1_a_lista.size(); i++) {
			System.out.print(niz_1_a_lista.get(i));
		}
		System.out.println();
		 */
		ArrayList<Integer> niz_1_a_lista = stoFali(niz_1_a);
		ArrayList<Integer> niz_2_a_lista = stoFali(niz_2_a);
		ArrayList<Integer> niz_3_a_lista = stoFali(niz_3_a);
		ArrayList<Integer> niz_4_a_lista = stoFali(niz_4_a);
		ArrayList<Integer> niz_5_a_lista = stoFali(niz_5_a);
		ArrayList<Integer> niz_6_a_lista = stoFali(niz_6_a);
		ArrayList<Integer> niz_7_a_lista = stoFali(niz_7_a);
		ArrayList<Integer> niz_8_a_lista = stoFali(niz_8_a);
		ArrayList<Integer> niz_9_a_lista = stoFali(niz_9_a);
		
		ArrayList<Integer> niz_1_b_lista = stoFali(niz_1_b);
		ArrayList<Integer> niz_2_b_lista = stoFali(niz_2_b);
		ArrayList<Integer> niz_3_b_lista = stoFali(niz_3_b);
		ArrayList<Integer> niz_4_b_lista = stoFali(niz_4_b);
		ArrayList<Integer> niz_5_b_lista = stoFali(niz_5_b);
		ArrayList<Integer> niz_6_b_lista = stoFali(niz_6_b);
		ArrayList<Integer> niz_7_b_lista = stoFali(niz_7_b);
		ArrayList<Integer> niz_8_b_lista = stoFali(niz_8_b);
		ArrayList<Integer> niz_9_b_lista = stoFali(niz_9_b);
		
		ArrayList<Integer> niz_1_c_lista = stoFali(niz_1_c);
		ArrayList<Integer> niz_2_c_lista = stoFali(niz_2_c);
		ArrayList<Integer> niz_3_c_lista = stoFali(niz_3_c);
		ArrayList<Integer> niz_4_c_lista = stoFali(niz_4_c);
		ArrayList<Integer> niz_5_c_lista = stoFali(niz_5_c);
		ArrayList<Integer> niz_6_c_lista = stoFali(niz_6_c);
		ArrayList<Integer> niz_7_c_lista = stoFali(niz_7_c);
		ArrayList<Integer> niz_8_c_lista = stoFali(niz_8_c);
		ArrayList<Integer> niz_9_c_lista = stoFali(niz_9_c);
		
		
		
		
		//OVO JE KOMBINATORIKA---------------------------------------------------------------------------------------------------------
		
		unos = "1231";
		nizString= unos.split("");
		
		
		
		

		if(nizString.length > 2){
			//BROJ MOGUCIH KOMBINACIJA
			int brojKombinacija = 1;
			brojacString = nizString.length;
			//FAKTORIJEL OD BROJA
			while(brojacString > 0) {
				brojKombinacija *= brojacString;
				brojacString--;
			}
			//FAKTORIJEL OD BROJA
			
			while(brojKombinacija > brojacString) {
				
				for(int i = nizString.length-1; i>0; i--) {
					nizString = zamena(nizString, i-1, i);
					brojacString++;
					stampajKombinaciju();
				}
				nizString = zamena(nizString, nizString.length-2, nizString.length-1);
				brojacString++;
				stampajKombinaciju();
				
				
				for(int i = 0; i <nizString.length-1; i++) {
					nizString = zamena(nizString, i, i+1);
					brojacString++;
					stampajKombinaciju();
				}
				nizString = zamena(nizString, 0, 1);
				brojacString++;
				stampajKombinaciju();
				
			}
			
			
		}else {
			stampajKombinaciju();
		}
		
		//OVO JE KOMBINATORIKA---------------------------------------------------------------------------------------------------------
		
		/*
		 Napraviti nove nizovo od kojih svaki ima duzinu u zavisnosti koliko ima nula (0) u sebi niz od koga se pravi.
		 i u zavisnosti u taj niz uneti brojeve koji su razliciti od kojih ni jedan nije isti sa brojevima iz niza od koga je kreiran
		 */
		
	}
	
	public static ArrayList stoFali(int[]niz_1_a) {
		ArrayList<Integer> niz_1_a_lista = new ArrayList<Integer>();
		
		for(int i = 0; i<niz_1_a.length; i++) {
			if(niz_1_a[i] != 0) {
				niz_1_a_lista.add(niz_1_a[i]);
			}
		}
		ArrayList<Integer> niz_1_a_lista2 = new ArrayList<Integer>();
		int brojacLISTE1 = 0;
		while(niz_1_a_lista2.size()<(9-niz_1_a_lista.size())) {
			brojacLISTE1++;
			if(!niz_1_a_lista.contains(brojacLISTE1)) {
				niz_1_a_lista2.add(brojacLISTE1);
			}
		}
				
		return niz_1_a_lista2;
	}
	
	
	public static String[] zamena(String [] niz, int leviBroj, int desniBroj){
		String[]nizPermutiran = niz;
		
		String memorija = nizPermutiran[desniBroj];
		nizPermutiran[desniBroj] = nizPermutiran[leviBroj];
		nizPermutiran[leviBroj] = memorija;
		
		return nizPermutiran;
	}
	
	public static void stampajKombinaciju() {
		if(nizString.length > 2){
			System.out.print(brojacString + " ");
			for(int j = 0; j<nizString.length; j++) {
				System.out.print(nizString[j]);
			}
			System.out.println();
		}else if(nizString.length == 2) {
			System.out.println(nizString[0] +""+ nizString[1]);
			System.out.println(nizString[1] +""+ nizString[0]);
		}else if(nizString.length == 1) {
			if(unos.equals("")) {
				System.out.println("-1");
			}else {
				System.out.println(nizString[0]);
			}
		}
		
	}

}
