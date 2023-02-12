import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.*;

public class Date {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату рождения человека: ");
        String date = sc.nextLine();
        if (!(date.matches("\\d+ \\d+ \\d+")))
            throw new IllegalArgumentException("Неверный формат даты");
        String[] lst = date.split(" ");
        int day = Integer.parseInt(lst[0]);
        if (day <=0 || day > 31)
            throw new IllegalArgumentException("Некорректные входные данные");
        int month = Integer.parseInt(lst[1]);
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("Некорректные входные данные");
        int year = Integer.parseInt(lst[2]);
        if (year <= 0)
            throw new IllegalArgumentException("Некорректные входные данные");
        String zodiac;
        if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) zodiac = "Овен";
        else if ((day >= 21 && month == 4) || (day <= 20 && month == 5)) zodiac = "Телец";
        else if ((day >= 21 && month == 5) || (day <= 21 && month == 6)) zodiac = "Близнецы";
        else if ((day >= 22 && month == 6) || (day <= 22 && month == 7)) zodiac = "Рак";
        else if ((day >= 23 && month == 7) || (day <= 23 && month == 8)) zodiac = "Лев";
        else if ((day >= 24 && month == 8) || (day <= 23 && month == 9)) zodiac = "Дева";
        else if ((day >= 24 && month == 9) || (day <= 23 && month == 10)) zodiac = "Весы";
        else if ((day >= 24 && month == 10) || (day <= 22 && month == 11)) zodiac = "Скорпион";
        else if ((day >= 23 && month == 11) || (day <= 21 && month == 12)) zodiac = "Стрелец";
        else if ((day >= 22 && month == 12) || (day <= 20 && month == 1)) zodiac = "Козерог";
        else if ((day >= 21 && month == 1) || (day <= 20 && month == 2)) zodiac = "Водолей";
        else zodiac = "Рыбы";
        String chinese = "";
        String[] animals = {"Свиньи", "Крысы", "Быка", "Тигра", "Кролика", "Дракона", "Змеи", "Лошади", "Козы", "Обезьяны"
        , "Петуха", "Собаки"};
        for (int i = 1899; i <= 1910; i++) {
            if ((year - i) % 12 == 0) chinese = animals[i - 1899];
        }
        System.out.println("Знак зодиака: " + zodiac);
        System.out.println("Год: " + chinese);
    }
}