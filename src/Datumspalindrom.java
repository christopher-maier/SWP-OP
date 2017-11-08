
public class Datumspalindrom {
	
	private static void countDays(){
		int zaehler = 0;
		for(int i = 2000; i <= 2099; i++){ 
			for(int j = 1; j <= 12; j++){
				for(int k = 0; k <= 30; k++){
					int date = i+j+k;
					String s = Integer.toString(date);
					if(checkDate(s) == true){
						zaehler++;
					}
					
				}
			}
		}
		System.out.println("Annahme: Jedes Monat hat 30 Tage!");
		System.out.println("Im 21Jahrhundert gibt es " + zaehler + " Palindromtage!");
	}
	
	private static boolean checkDate(String s){
		StringBuilder builder = new StringBuilder(s);
		String reversed = builder.reverse().toString();
		if(s.equalsIgnoreCase(reversed)){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		countDays();
	}
}
