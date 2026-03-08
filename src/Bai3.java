class User{
    private int age;

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Tuoi khong the am");
        }
        this.age = age;
    }
}

public class Bai3 {
    public static void main(String[] args) {
        User us=new User();
        try{
            us.setAge(-1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
