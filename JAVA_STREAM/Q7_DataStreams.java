import java.io.*;

public class Q7_DataStreams {
    public static void main(String[] args) {
        String filename = "students.dat";
        // Write data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(1);
            dos.writeUTF("Alice");
            dos.writeDouble(8.5);
            dos.writeInt(2);
            dos.writeUTF("Bob");
            dos.writeDouble(7.9);
            dos.writeInt(3);
            dos.writeUTF("Charlie");
            dos.writeDouble(9.1);
            System.out.println("Student data written.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
        // Read data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Reading student data:");
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
