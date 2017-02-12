package Singelton;

//подкл к БД, конфиг настройки
//в многопоточности пробл
public class Singelton {

    private static Singelton instance;

    //private Constructor
    private Singelton() {
    }

    public static Singelton getInstance() {

        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }

    public void echo() {
        System.out.println(this);
    }

    public void message(){
        System.out.println("message");
    }
}
