import java.io.*;

public class Q8_PipedStreams {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);
        Thread writer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    String msg = "Message " + i + "\n";
                    pos.write(msg.getBytes());
                    Thread.sleep(100);
                }
                pos.close();
            } catch (Exception e) {
                System.out.println("Writer error: " + e.getMessage());
            }
        });
        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
                pis.close();
            } catch (IOException e) {
                System.out.println("Reader error: " + e.getMessage());
            }
        });
        writer.start();
        reader.start();
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
