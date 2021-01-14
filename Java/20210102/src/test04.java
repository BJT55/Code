public class test04 {
    public static void main(String[] args) {
        int[] array = {2, 6, 8, 4, 9, 1, 9, 7, 6};
        int[] array_copy = new int[20];
        copyOf(array,array_copy);
        for (int i = 0; i < array.length; i++){
            System.out.print(" "+array_copy[i]);
        }
    }
    private static void copyOf(int[] array, int[] copy) {
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
    }
}
