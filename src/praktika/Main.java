package praktika;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        SymbolList l = new SymbolList();
        System.out.println("Заполнил лист a a b c - 2-я а не добавится потому-что уже есть");
        l.add('a');
        l.add('a');
        l.add('b');
        l.add('c');
        System.out.println("Вывод данных с листа размер: " + l.size());
        l.printList();
        System.out.println("Меням нулевой эелемент на b - не получилось потому-что b уж есть");
        l.changeElement(0, 'a');
        System.out.println("Вывод данных с листа");
        l.printList();
        System.out.println("Удалил эелемент по 2 индексу");
        l.delete(2);
        System.out.println("Вывод данных с листа");
        l.printList();
        System.out.println("Меням первый по индексу эелемент на 5");
        l.changeElement(1, '5');
        System.out.println("Вывод данных с листа");
        l.printList();
        System.out.println("Лист очистен");
        l.clear();
        System.out.println("Вывод данных с листа");
        l.printList();
    }
}
