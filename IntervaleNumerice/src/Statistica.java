

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Statistica {

	public static void main(String[] args) {
		
		
		
		try {
			
			BufferedReader nrIntervaleInput = new BufferedReader(new FileReader("resources/statisticiPeIntervaleNumerice/intervale.dat"));
			
			String linie;
			int nrIntervale = 0;
			
			while((linie = nrIntervaleInput.readLine()) != null)
				nrIntervale++;
			
			Interval.setNrIntervale(nrIntervale);
			
			nrIntervaleInput.close();
			
			
			BufferedReader intervaleInput = new BufferedReader(new FileReader("resources/statisticiPeIntervaleNumerice/intervale.dat"));
			
			linie = "";
			
			Interval[] intervale = new Interval[nrIntervale];
			int i = 0;
			
			while((linie = intervaleInput.readLine()) != null) {
				linie = linie.replace("[", "").replace("]", "");
				String[] valori = linie.split(",");
				
				
				Double min = Double.valueOf(valori[0]);
				Double max = Double.valueOf(valori[1]);
				
				
				intervale[i] = new Interval(min, max);
				
				
				i++;
				
				}
				intervaleInput.close();
			
			
		
				BufferedReader br = new BufferedReader(new FileReader("resources/statisticiPeIntervaleNumerice/numere.dat"));
			
				linie = "";
			
				while((linie = br.readLine()) != null) {
					Double numar = Double.valueOf(linie);
					for(i = 0; i < nrIntervale; i++) 
						intervale[i].verificare(numar);
					
					Interval.numereTestate();
				
				}
				
				br.close();
				
				
				BufferedWriter bw = new BufferedWriter(new FileWriter("resources/statisticiPeIntervaleNumerice/statistica.dat"));
				
				for(i=0; i< nrIntervale; i++) {
					bw.write(intervale[i].scriereFisier());
					//System.out.println(intervale[i].scriereFisier());
				}
				
				bw.close();
				
			} catch (Exception e) {
				System.out.println("Eroare la citirea fisierului " + e.getMessage());
			}
			
		
		
		

	}

}