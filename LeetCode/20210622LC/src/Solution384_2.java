import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 暴力法
class Solution384_2 {
    private int[] array;
    private int[] original;
    private Random rand = new Random();

    public Solution384_2(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array = original;
        original = original.clone();
        return array;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> aux = getArrayCopy();

        for (int i = 0; i < array.length; i++) {
            int removeIndex = rand.nextInt(aux.size());
            array[i] = aux.get(removeIndex);
            aux.remove(removeIndex);
        }
        return array;
    }

    private List<Integer> getArrayCopy() {
        List<Integer> asList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            asList.add(array[i]);
        }
        return asList;
    }
}
