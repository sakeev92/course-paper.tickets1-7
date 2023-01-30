import java.util.Arrays;

public class Main {
    private static void StringPalindrome() {
        //Задача 2
        String myString = "anna";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if (myString.equals(data)) {
            System.out.println("Данная строка является палиндромом");
        } else {
            System.out.println("Данная строка не является палиндромом");
        }
    }
    public static int[] removeDuplicates(int[] arr) {
        //Задача 4
        return Arrays.stream(arr).distinct().toArray();
    }
    private static int[] copyArray1() {
        //Задача 6
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Получаем на входе массив чисел:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
        }
        System.out.println("Все четные числа увеличиваем на единицу:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Возвращаем кусок списка с 3-го по 7-й элемент:");

        int[] subArray = Arrays.copyOfRange(arr, 2, 7);
        System.out.println(Arrays.toString(subArray));
        return subArray;
    }
    public static int pow(int value) {
        //Задача 7
        System.out.print(value + " в квадрате равно: ");
        return value * value;
    }
    public static void main(String[] args) {
       tickets1();
       tickets2();
       tickets3();
       tickets4();
       tickets5();
       tickets6();
       tickets7();

    }

    public static void tickets1() {
        System.out.println("Билет 1");
/*
      - Переменная — это ячейка в памяти компьютера, которой можно присвоить имя и в которой можно хранить данные.
        Тип Переменных:
        var - это универсальный тип переменной, в которую мы можем записывать любое значение (например, целые, дробные числа или символы),
         а Java определяет, что это за данные и как их лучше сохранять.

        Целочисленные:      byte  от -128 до 127
                            short от -32 768 до 32 767
                            int   от -2 147 483 648 до 2 147 483 647
                            long  от -9 223 372 036 854 775 808 до -9 223 372 036 854 775 807
        С плавающей точкой:  float от -3,4
                            double от - 1.7Е+308 до 1.7Е+308
        Символичные :       char  от 0 до 65 536
        Логические:         boolean true или false

      - Методы бывают типов: Геттер и Сеттер.
      --------
      - Метод-геттер (Getter - с англ. получатель) - это метод, с помощью которого получают (считывают) значение переменной, доступ к которой напрямую ограничен.
*/
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void tickets2() {
        System.out.println("Билет 2");
/*
        -if(если) и else(иначе)
        Конструкция if() — условный оператор или оператор ветвления.
        Он позволяет запускать код только в том случае, когда условия, помещенные в скобки, являются истиной, т. е. соблюдаются.
        Конструкция if-else
        Представляет собой аналог второго if() из кода выше, но не требует дополнительного условия выполнения,
        так как выполняется в тот момент, когда основной блок if() получил в условие значение false и сработать не смог.
       - Массив — это структура данных, которая позволяет хранить несколько значений одного типа.
       - Метод-сеттер (Setter, от англ.set - устанавливать) - это метод,с помощью которого задают или изменяют значение переменной (присваивают какое-либо значение инкапсулированному полю),
       например, обработав при этом недопустимые присваивания.
*/
        StringPalindrome();


    }

    public static void tickets3() {
        System.out.println("Билет 3");
/*    -  for - Такой цикл помогает выполнять многократно повторяющиеся действия.(оюъявление переменной, условик которое должно выполняться, действие которое должно выполняться)
        while - сначала проверяет условие в скобках и затем выполняет блок
        do-while - сначала запускает блок, а потом проверяет условие.
      ------

 */
        String line = "Владислав Сергеевич";
        String[] words = line.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void tickets4() {
        System.out.println("Билет 4");
/*  -------
    -------
 */
        int[] arr = {2, 4, 1, 2, 1, 2, 4, 5};

        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));



    }

    public static void tickets5() {
        System.out.println("Билет 5");
        /*
      - Для сравнения строк используют метод equals(). Этот метод в качестве параметра принимает другую строку и возвращает true/false.
        При использовании оператора == сравниваться будут значения ссылок, а не сами объекты.
        Объекты будут равными только в том случае, когда ссылки и правда ссылаются на единый объект в памяти.
      -----
      - Сигнатура метода — это имя и параметры метода, причем порядок параметров внутри скобок имеет значение.
         */

        String[] books = {"Космос", "Планета земля!", "Сигареты"};
        String[] author = {"И.И.Иванов", "С.С.Землянин", "В.В.Куряга"};
        String[] c = new String[books.length + author.length];
        for (int i = 0; i < books.length; i++) {
            c[i] = "«" + books[i] + "»" + " " + author[i];

            System.out.println(c[i] + " ");
        }
    }

    public static void tickets6() {
        System.out.println("Билет 6");
    /*
  - String — это класс в Java, который прописан в пакете java.lang. Это не примитивный тип данных, как int и long.
    Класс String представляет строковый набор символов. Строки используются практически по всех Java-приложениях, и есть несколько фактов, которые мы должны знать о классе String.
  - При использовании оператора == сравниваться будут значения ссылок, а не сами объекты.
    Метод equals() вызывается у одного объекта, а к нему в скобки в качестве параметра передается другой объект, «равняться» с которым мы будем.
    Т. е. примитивы сравниваем через ==, а объекты — через метод equals().
  - Оператор return используется для выполнения явного возврата из метода. То есть он снова передает управление объекту, который вызвал данный метод.
   Как таковой этот оператор относится к операторам перехода.
     */
        copyArray1();



    }


    public static void tickets7() {
        System.out.println("Билет 7");
    /*
  - Цикл while - это цикл типа 'пока' в языке Java, который используется, когда один фрагмент кода должен выполняться, пока выполняется какое-то заданное условие.
  - Метод toString
  -
      */
        System.out.print(pow(7));
    }
}

