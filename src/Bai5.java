class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
class Users{
    private int age;

    public Users() {
    }

    public int getAge() {
        return age;
    }

     void setAge (int age) throws InvalidAgeException {
        if(age<0){
            throw new InvalidAgeException("Tuoi khong the am");
        }
        this.age = age;
    }
}
public class Bai5 {
    public static void main(String[] args) {
        Users usr=new Users();
        try{
            usr.setAge(-1);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
