import java.util.ArrayList;

public class MySet<T> {
    private ArrayList<T> elements; //Реализация множества с помощью ArrayList

    public MySet() {
        elements = new ArrayList<>();
    }
//Добавление элементов
    public void add(T element) {
        if (!elements.contains(element)) { //Если такого элемента в множестве нет, добавляем
            elements.add(element);
        }
    }
//Удаление элементов
    public void remove(T element) {
        elements.remove(element);
    }
//Проверяем, содержится ли элемент в множестве
    public boolean contains(T element) {
        return elements.contains(element);
    }
//Количество элементов в множестве
    public int size() {
        return elements.size();
    }
//Очистка множества
    public void clear() {
        elements.clear();
    }
//Переопределение функции преобразования в строку для вывода множества
    @Override
    public String toString() {
        return elements.toString();
    }
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();

        // Добавление элементов
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1); // Дубликат, не будет добавлен

        System.out.println("Множество: " + mySet);

        // Проверка наличия элемента
        System.out.println("Содержит 2? " + mySet.contains(2));
        System.out.println("Содержит 4? " + mySet.contains(4));

        // Удаление элемента
        mySet.remove(1);
        System.out.println("Множество после удаления элемента 1: " + mySet);

        // Получение размера множества
        System.out.println("Размер множества: " + mySet.size());

        // Очистка множества
        mySet.clear();
        System.out.println("Множество после очистки: " + mySet);
}}
