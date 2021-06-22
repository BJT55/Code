import java.util.Random;
// FY洗牌算法
class Solution384 {
    private int[] array;
    private int[] original;
    Random rand = new Random();

    public Solution384(int[] nums) {
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
        for (int i = 0; i < array.length; i++) {
            swapAt(i,randRange(i,array.length));
        }
        return array;
    }
    private void swapAt(int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    private int randRange(int i, int j){
        return rand.nextInt(j-i)+i;
    }
}
