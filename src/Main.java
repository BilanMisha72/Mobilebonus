public class Main {
    public static void main(String[] args) {

        int a = 200; //остаток
        int b = 1300; //платеж
        int percent = 0;
        if (b > 1000) {
            percent = 1;
        }
        int bonus = (b / 100) * percent;

        int c = (a + b + bonus);
        System.out.println(c);
    }
}


