//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int initiflBalance = 150; // начальный счет
        int addent = 1400; // сумма пополнения для бонуса
        int bonus = 0;

        if (addent > 1000) {
            bonus = addent / 100;
            int finalBalance = initiflBalance + addent + bonus;

            System.out.println("Итоговый баланс:" + finalBalance);
        } else {


            System.out.println(" Всего на счету");
        }


    }
}