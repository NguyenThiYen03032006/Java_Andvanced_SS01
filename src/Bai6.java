import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
class Logger {
     public static void logError(String message) {
         String time = LocalDateTime.now()
                 .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
         System.out.println("[ERROR] " + time + " - " + message);
     }
 }
 class User {
    private String name;
    private int age;
    public User(String name) {
        this.name = name;
    }
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Tuổi không thể âm!");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
 class UserService {
    public static void processUserData(User user) throws IOException {
        if (user != null && user.getName() != null) {
            System.out.println("Đang xử lý dữ liệu của: " + user.getName());
        } else {
            System.out.println("Không có thông tin người dùng.");
            return;
        }
        saveToFile(user);
    }
    public static void saveToFile(User user) throws IOException {
        System.out.println("Đang lưu dữ liệu vào file...");
        throw new IOException("Không thể ghi dữ liệu xuống file hệ thống.");
    }
}
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            User user = new User(name);
            System.out.print("Nhập tuổi: ");
            String ageStr = sc.nextLine();
            int age = Integer.parseInt(ageStr);
            user.setAge(age);
            UserService.processUserData(user);
        } catch (NumberFormatException e) {
            Logger.logError("Năm sinh không hợp lệ: " + e.getMessage());
        } catch (InvalidAgeException e) {
            Logger.logError("Lỗi nghiệp vụ: " + e.getMessage());
        } catch (IOException e) {
            Logger.logError("Lỗi hệ thống khi ghi file: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Dọn dẹp tài nguyên hoàn tất.");
        }
    }
}
