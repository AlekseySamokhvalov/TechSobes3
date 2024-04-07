public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 4;
            int result = numbers[index]; // Попытка обратиться к элементу массива с недопустимым индексом
            int divisionResult = 10 / 0; // Попытка деления на ноль
            String str = "abc";
            int number = Integer.parseInt(str); // Попытка преобразования строки в число
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            System.out.println("Обработка нескольких исключений одновременно");
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            System.out.println("Обработка нескольких исключений одновременно");
        }
    }
}

