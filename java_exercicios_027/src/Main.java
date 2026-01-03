import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();
        System.out.print("Entre com o caminho completo do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int score = Integer.parseInt(fields[1]);
                if (!votes.containsKey(name)) {
                    votes.put(name, score);
                } else {
                    votes.put(name, votes.get(name) + score);
                }
                line = br.readLine();
            }

            votes.forEach((key, value) -> System.out.println(key + ": " + value));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}