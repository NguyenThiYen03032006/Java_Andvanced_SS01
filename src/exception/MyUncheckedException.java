package exception;

public class MyUncheckedException extends RuntimeException {
    // phuong thuc, thuoc tinh
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MyUncheckedException(String message){
        super(message);
    }
}
