import java.io.*;

public class Q5_TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println(firstLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
