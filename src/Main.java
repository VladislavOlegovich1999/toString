import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private String word;
    private Map<Character, Integer> occurrence = new HashMap<>();

    public Main(String word) {
        this.word = word;
        calculateOccurrence();
    }

    private void calculateOccurrence() {
        for (int counter = 0; counter < word.length(); counter++) {
            // метод charAt(int index) возвращает символ в строке по индексу
            char charAt = word.charAt(counter);
            Integer currentOccurrence = occurrence.get(charAt);
            if (currentOccurrence != null) {
                occurrence.put(charAt, currentOccurrence + 1);
            }
            else {
                occurrence.put(charAt, 1);
            }
        }
    }

    public void printOccurrence() {
        for (char charKey : occurrence.keySet()) {
            System.out.println(
                    "Встречаемость символа " + charKey + " = " + occurrence.get(charKey)
            );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите слово => ");
        String word = scanner.nextLine();
        Main charactersOccurrence = new Main(word);
        charactersOccurrence.printOccurrence();
    }
}
/*
*/
