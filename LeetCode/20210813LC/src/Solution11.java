public class Solution11 {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length-1;
        int res = Integer.MAX_VALUE;
        while (left < right){
            int mid = (left+right)/2;
            if (numbers[right] > numbers[mid]){
                right = mid-1;
            }else if (numbers[right] < numbers[mid]){
                left = mid;
            }else {
                right--;
            }
        }
        return numbers[left];
    }
}
