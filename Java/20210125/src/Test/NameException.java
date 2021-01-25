package Test;

// 此时创建的的异常为受查异常，继承Exception
// 如果继承 RuntimeException ，则为非受查异常
public class NameException extends Exception {
     public NameException(String log) {
        super(log);
    }
}
