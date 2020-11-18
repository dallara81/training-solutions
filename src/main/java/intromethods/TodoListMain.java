package intromethods;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTodo("Elkészíteni öt dögunalmas leckét");
        todoList.addTodo("Feladni a kib*szott eu-s kérdőívet a postán");
        todoList.addTodo("Keresni egy jó magántanárt");
        todoList.addTodo("Venni valami normális JAVA-könyvet");
        todoList.addTodo("Délután újabb hasznos konzultáció");
        todoList.addTodo("Csinálni valami szórakoztatóbbat");
        todoList.addTodo("Hívni a bankot egy új jelszóért");
        todoList.addTodo("Elkészíteni két újabb dögunalmas leckét");

        // Header
        System.out.println("<<< Napi *****kodás v0.1 >>>");

        // Első kör 4:00
        System.out.println(" ");
        System.out.println("Állapot reggel 4:00-kor >");
        System.out.println(todoList);
        todoList.finishAllTodos(Arrays.asList("Keresni egy jó magántanárt", "Venni valami normális JAVA-könyvet"));

        // Második kör 9:30
        System.out.println(" ");
        System.out.println("Állapot délelőtt 9:30-kor >");
        System.out.println(todoList);
        todoList.finishAllTodos(Arrays.asList("Elkészíteni öt dögunalmas leckét", "Feladni a kib*szott eu-s kérdőívet a postán"));

        // Második kör 12:45
        System.out.println(" ");
        System.out.println("Állapot 12:45-kor >");
        System.out.println(todoList);
        todoList.finishAllTodos(Arrays.asList("Elkészíteni két újabb dögunalmas leckét", "Hívni a bankot egy új jelszóért"));

        // Ötödik kör 15:00
        System.out.println(" ");
        System.out.println("Állapot délután 15:00-kor >");
        System.out.println(todoList);
        todoList.finishAllTodos(Arrays.asList("Délután újabb hasznos konzultáció"));


        // Hatodik kör 16:00
        System.out.println(" ");
        System.out.println("Állapot délután 16:00-kor >");
        System.out.println(todoList);
        todoList.finishTodos("Csinálni valami szórakoztatóbbat");
        System.out.println("WTF, csinálni valami szórakoztatóbbat? No more, hulla fáradt vagyok...");

        // Fennmaradó feladatok
        System.out.println(" ");
        System.out.println("Elvégezetlen feladatok >");
        System.out.println(todoList.todosToFinish());
        System.out.println("Elvégezett feladatok száma >");
        System.out.println(todoList.numberOfFinishedTodos());

    }
}