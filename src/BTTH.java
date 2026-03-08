import java.util.Scanner;
import java.io.FileNotFoundException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
class UserService {
    public static String registerUser(String name, String ageInput, String email)
            throws InvalidAgeException, InvalidEmailException {
        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Tuoi phai la so");
        }
        if (age < 18) {
            throw new InvalidAgeException("Khong du tuoi");
        }
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email khong hop le");
        }
        return "Ten: " + name + ", Tuoi: " + age + ", Email: " + email;
    }

    public static void saveUserToFile(String userData) throws FileNotFoundException {
        throw new FileNotFoundException("Khong tim thay file");
    }
}

public class BTTH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Ten: ");
            String name = scanner.nextLine();

            System.out.print("Tuoi: ");
            String age = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            String userData = UserService.registerUser(name, age, email);

            System.out.println("Dang ky thanh cong");
            System.out.println("Thong tin: " + userData);

            UserService.saveUserToFile(userData);

        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }

    }

}
