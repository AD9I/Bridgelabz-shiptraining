import java.io.*;
import java.util.Arrays;

public class Q5_ImageByteArray {
    public static void main(String[] args) {
        String inputImage = "input.jpg";
        String outputImage = "output.jpg";
        try (FileInputStream fis = new FileInputStream(inputImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            byte[] imageBytes = baos.toByteArray();
            // Write back to file
            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(outputImage)) {
                while ((len = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                }
            }
            // Verify
            boolean identical = compareFiles(inputImage, outputImage);
            System.out.println("Files identical: " + identical);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static boolean compareFiles(String f1, String f2) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(f1);
             FileInputStream fis2 = new FileInputStream(f2)) {
            int b1, b2;
            do {
                b1 = fis1.read();
                b2 = fis2.read();
                if (b1 != b2) return false;
            } while (b1 != -1 && b2 != -1);
            return b1 == b2;
        }
    }
}
