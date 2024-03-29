package laba6;

public class Example7 {
    public static void main(String[] args) {
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Example_7.convertCharArray(alphabet);
        Example_7.viewArray();

    }

    private static class Example_7 {
        static int[] IntArray;

        //статический методом, аргументом которому передастся символьный массив
        private static int[] convertCharArray(char ChArray[]) {
            IntArray = new int[ChArray.length];
            for (int i = 0; i < ChArray.length; i++) {
                IntArray[i] = (int)ChArray[i];
            }
            //результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента
            return IntArray;
        }

        private static void viewArray() {
            for (int i = 0; i < IntArray.length; i++) {
                System.out.println("IntArray[" + i + "] = " + IntArray[i]);
            }
        }
    }
}