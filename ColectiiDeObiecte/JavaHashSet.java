package ColectiiDeObiecte;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(); // Numarul de perechi
            String string = scanner.nextLine(); // Trec peste caracterul de sfarsit de linie

            HashSet<String> strings = new HashSet<String>();

            for (int i = 0; i < n; i++) {
                String string2 = scanner.nextLine();
                String[] strings2 = string2.split(" ");
                strings.add(Arrays.toString(strings2));
                System.out.println(strings.size());
            }
        }

    }
}
