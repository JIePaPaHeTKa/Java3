public class Main {
    public static void main(String[] args) {

        int rub = 12122; // количество денег
        int percent = (1 * 100 / 100); // формула вычисления процентов
        int bonus; // переменная бонусов
        if (rub > 100) {
            bonus = percent * rub / 100; // условие при платеже более 100 руб.
        } else {
            if (rub < 100);
            bonus = rub * 0; // условие при платеже менее 100 руб.
        }

        System.out.println("Количество бонусов составит " + bonus + " рубля(ей)");
    }
}