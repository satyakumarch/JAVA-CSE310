import java.io.FileOutputStream;

public class resourse {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("java.txt")) {
            String msg = "hello lpu";
            byte[] byteArray = msg.getBytes(); // Corrected method name to getBytes()
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successful");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
