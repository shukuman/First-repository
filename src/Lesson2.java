public class Lesson2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        a++;
        b--;
        System.out.println("a: " + a + ", b: " + b);

        int c = 5;
        System.out.println(c++);
        System.out.println(c);

        int d = 7;
        System.out.println(++d);
        System.out.println(d);

        int e = 0;
        System.out.println(++e + e++ + e++ + ++e); // 1 + 1 + 2 + 4
        // ++e вывел значение 1 сохранил значение 1
        // e++ вывел значение 1 сохранил значение 2
        // e++ вывел значение 2 сохранил значение 3
        // ++e вывел значение 4 сохранил значение 4

        int f = 5;
        int g = 6;
        System.out.println(f == g); // false, так как 5 не равно 6

        int h = 2;
        int i = 2;
        System.out.println(h == i); // true, так как 2 равно 2

        int j = 5;
        int k = 6;
        System.out.println(j != k); // true, так как 5 не равно 6

        int l = 2;
        int m = 2;
        System.out.println(l != m); // false, так как 2 равно 2

        int n = 60;
        if (n >= 0 && n < 60) {
            System.out.println("Оценка 2");
        } else if (n >= 60 && n < 75) {
            System.out.println("Оценка 3");
        } else if (n >= 75 && n < 90) {
            System.out.println("Оценка 4");
        } else if (n >= 90 && n <= 100) {
            System.out.println("Оценка 5");
        } else {
            System.out.println("Ошибка");
        }

        int o = 1;
        switch (o) {
            case 1:
                System.out.println("Anuar");
            case 2:
            case 3:
                System.out.println("Runtime");
                System.out.println("Runtime");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Abc");
                break;
            default:
                System.out.println("Error");
        }

        String userChoice = "eco";
        if ("fast".equals(userChoice)) {
            System.out.println("fast mode on");
        } else if ("eco".equals(userChoice)) {
            System.out.println("eco mode on");
        } else {
            System.out.println("error");
        }

        int product = 0;
        while (product < 10) {
            System.out.println("Текущее количество корзины: " + product);
            product += 2;
        }

        int x = 1;
        do {
            System.out.println("Digit: " + a);
        } while (x > 5);

        for (int num = 1; num <= 10; num += 3) {
            System.out.println("Количество кусочков картошки: " + num);
        }

        for (int num2 = 0; num2 < 10; num2++) {
            if (num2 % 2 != 0) { // выполняется если false
                continue;
            }
            System.out.println("Carrot number: " + num2);
        }

        for (int p = 1; p < 10; p++) {
            System.out.println("abc");
            if (p == 3) {
                break;
            }
        }

        for (int q = 1; q <= 3; q++) {
            System.out.println("Это первый цикл! Я выполняюсь " + q + " раз");
            for (int r = 1; r <= 10; r++) {
                System.out.println("    Это второй цикл! Я выполняюсь " + r + " раз");
                if (r == 2) {
                    break;
                }
            }
        }

        for (int s = 1; s <= 7; s++) {
            System.out.println(s + ": я выполняюсь перед continue");
            if (s > 2) {
                continue;
            }
            System.out.println("   " + s + ": я выполняюсь всего два раза");
        }
    }
}
