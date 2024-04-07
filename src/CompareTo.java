public class CompareTo {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = str1.compareTo(str2);

        //Если результат сравнения отрицателен, то str1 идет перед str2
        if (result < 0) {
            System.out.println("Строка str1 перед строкой str2");
        } else if (result > 0) {
            System.out.println("Строка str1 идет после строки str2");
        } else {
            System.out.println("Строки str1 и str2 равны");
        }
    }
}
