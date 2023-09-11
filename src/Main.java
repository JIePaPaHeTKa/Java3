public class Main {
    public static void main(String[] args) {

        int count = 153; // количество денег на счету
        int rub = 14000; // количество денег при пополнении
        int percent = (1 * 100 / 100); // формула вычисления процентов
        int bonus; // переменная бонусов
        if (rub > 100) {
            bonus = percent * rub / 100; // условие при платеже более 100 руб.
        } else {
            bonus = rub * 0; // условие при платеже менее 100 руб.
        }

        System.out.println("Сумма пополнения составила " + (rub + bonus) + " рубля(ей)");
        System.out.println("Из них бонусов: " + bonus + " рубля(ей)");
        System.out.println("Итого на Вашем счету: " + (count + rub + bonus));
    }
}