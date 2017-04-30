import java.util.ArrayList;

public class Main {

    public static ArrayList cats = new ArrayList();
    public Main() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            Main.cats.add(new Main());
            printCats();
        }
    }

    public static void printCats() {
        System.out.println(Main.cats.toString());
    }
}
