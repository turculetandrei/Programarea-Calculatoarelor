
import java.util.HashSet;
import java.util.Scanner;

public class javaHashset {

    String first;
    String second;

    javaHashset(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        javaHashset pair = (javaHashset) obj;
        return first.equals(pair.first) && second.equals(pair.second);
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        HashSet<javaHashset> pairSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String first = scanner.next();
            String second = scanner.next();

            pairSet.add(new javaHashset(first, second));
            System.out.println(pairSet.size());
        }


        scanner.close();
    }
}