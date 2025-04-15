
public class Interval {
	
	private double min;
	private double max;
	private static int nrTestate=0;
	private int nrContinute;
	private static int nrIntervale = 0;
	
	public Interval(Double min, Double max) {
		this.min = min;
		this.max = max;
		
	}
	
	public String toString() {
		return "[" + this.min + "," + this.max + "]";
	}
	
	public void verificare(Double numar) {
		//for(int i = 1; i <= nrIntervale; i++) {
			if(numar > min && numar < max)
				nrContinute++;
		//}
		
	}

	public static void setNrIntervale(int x) {
		nrIntervale = x;
	}
	
	
	public static void numereTestate() {
		nrTestate++;
	}

	public static int getNrIntervale() {
		return nrIntervale;
	}
	
	public String scriereFisier() {
		return "[" + min + "," + max + "] :" + nrContinute + "%\n";
	}
	

}