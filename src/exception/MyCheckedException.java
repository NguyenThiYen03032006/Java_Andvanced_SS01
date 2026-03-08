package exception;

public class MyCheckedException extends Exception{
    // phuong thuc, thuoc tinh
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MyCheckedException(String message){
        super(message);
    }
}
