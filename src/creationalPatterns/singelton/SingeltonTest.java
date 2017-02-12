package creationalPatterns.singelton;

public class SingeltonTest {
    public static void main(String[] args) {
        Singelton.getInstance().echo(); //
        Singelton.getInstance().echo();
        Singelton.getInstance().message();
    }
}
