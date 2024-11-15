import java.util.ArrayList;
import java.util.Arrays;

public class LoopExample {
    public static void main(String[] args) {

        System.out.println("********** Задача №1 **********");
        int[] numbs = new int[7];

        // Заполняем массив цифрами от 1 до 7
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = i+1;
        }

        // Проходим по циклу, выводим значения. прерываемся на 5
        for (int j = 0; j < numbs.length; j++) {
            if (numbs[j] == 5) {
                break;
            }
            System.out.printf("%d-й элемент массива numbs = %d%n", j, numbs[j]);
        }

        System.out.println("");
        System.out.println("********** Задача №2 **********");

        int popular = 10_000_000;
        int daysInEar = 365;
        int plus = 14; // прирост на 1000 человек
        int minus = 8; // убыль на 1000 человек
        int years = 10;  // кол-во лет для рассчёта
        int total = popular/1000 * (plus - minus) * years * daysInEar + popular;
        System.out.printf("Через %d лет при зданных параметрах население будет составлять %d человек%n", years, total);

        System.out.println("");
        System.out.println("********** Задача №3 **********");
        ArrayList<String> anime = new ArrayList<String>(Arrays.asList(new String[]{
                "Naturo",
                "Blich",
                "Attaks of Titans",
                "Shaman king", "Akira",
                "Pokemon", "Sailor moon",
                "Great Teacher Onitsuka",
                "Dead note",
                "Hunter x hunter"
        }));

        for (String title: anime){
            System.out.printf("Посмотри %s!%n", title );
        };
    }
}
