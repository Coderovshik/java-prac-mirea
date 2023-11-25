
public class Test {
    public static void main(String[] args) {

        String name = "text";

        FileWork task = new FileWork();
        System.out.println("1: запись в файл");
        task.task_1(name);
        System.out.println("2: вывод из файла");
        task.task_2(name);
        System.out.println('\n' + "3: Замена содержимого файла");
        task.task_1(name);
        System.out.println("4: Добавление в конец файла");
        task.task_4(name);
        System.out.println("Результат");
        task.task_2(name);
    }
}