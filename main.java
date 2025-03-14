
public class Main {
    public static void main(String[] args) {
    	
    	
        Sertar s1=new Sertar(40, 50, 20);
        Sertar s2=new Sertar(45, 55, 25);
        Birou birou=new Birou(120, 60, 75, s1, s2);

        birou.tipareste();
    }
}
