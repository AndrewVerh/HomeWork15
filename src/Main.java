import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shopList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Список доступных операций: ");
            System.out.println("1 - Добавить покупку");
            System.out.println("2 - Показать покупки");
            System.out.println("3 - Удалить покупку");
            System.out.println("4 - Поиск по ключевым словам");
            System.out.println();

            System.out.println("Выберите операцию:");
            String inputAction = scanner.next();


            switch (inputAction) {
                case ("1"):
                    System.out.println("Какую покупку хотите добавить?");

                    String inputItem = scanner.next();
                    shopList.add(inputItem);
                    System.out.println("В списке покупок: " + shopList.size());
                    break;

                case ("2"):
                    System.out.println("Итого в списке покупок: ");
                    for (int i = 0; i < shopList.size(); i++) {
                        System.out.println((i + 1) + ". " + shopList.get(i));
                    }
                    break;

                case ("3"):
                    System.out.println("Список покупок: ");
                    for (int i = 0; i < shopList.size(); i++) {
                        System.out.println((i + 1) + ". " + shopList.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название:");

                    String removeItem = scanner.next();

                    char isString = removeItem.charAt(0);
                    if (Character.isLetter(isString)) {
                        shopList.remove(removeItem);
                        System.out.println("Покупка " + removeItem + " удалена, список покупок:");
                        for (int i = 0; i < shopList.size(); i++) {
                            System.out.println((i + 1) + ". " + shopList.get(i));
                        }
                    } else {
                        int removeItemInt = Integer.parseInt(removeItem);
                        shopList.remove(removeItemInt - 1);
                        System.out.println("Покупка " + removeItemInt + " удалена, список покупок:");
                        for (int i = 0; i < shopList.size(); i++) {
                            System.out.println((i + 1) + ". " + shopList.get(i));
                        }
                    }
                    break;

                case ("4"):
                    System.out.println();
                    System.out.println("Введите текст для поиска");

                    String input4 = scanner.next();
                    System.out.println("Найдено: ");

                    for (int i = 0; i < shopList.size(); i++) {
                        String itemLower = shopList.get(i).toLowerCase();
                        String queryLower = input4.toLowerCase();

                        if (itemLower.contains(queryLower)) {
                            System.out.println((i + 1) + ". " + itemLower);
                        }
                    }

                    //itemLower - название покупки к нижнему регистру
                    //queryLower - приведённый к нижнему регистру текст запроса


            }
        }
    }
}
