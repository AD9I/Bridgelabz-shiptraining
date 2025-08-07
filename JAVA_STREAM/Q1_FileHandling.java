import java.io.*;

public class Q1_FileHandling {
    public static void main(String[] args) {
        String source = "source.txt";
        String dest = "destination.txt";
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");
        } catch (IOException e) {
            System.out.println("Error during file operation: " + e.getMessage());
        }
    }
}
