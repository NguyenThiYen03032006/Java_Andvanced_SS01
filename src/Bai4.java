import java.io.IOException;

public class Bai4 {

    public static void saveToFile() throws IOException {
        System.out.println("Dang luu file");
        throw new IOException("Loi luu file");
    }

    public static void processUserData() throws IOException {
        saveToFile();
    }

    public static void main(String[] args) {
        try {
            processUserData();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Luu thanh cong");
    }
}