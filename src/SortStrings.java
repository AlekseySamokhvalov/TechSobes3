import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C++", "Ruby", "JavaScript"};
        System.out.println("Исходный массив строк: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив строк: " + Arrays.toString(arr));
    }
}

