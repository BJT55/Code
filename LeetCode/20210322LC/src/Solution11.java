class Solution11 {
    public int minArray(int[] numbers) {
        int len = numbers.length - 1;
        int left = 0, right = len;
        while(left < right){
            int mid = left + (right - left)/2;
            if(numbers[right] > numbers[mid]){
                right = mid;
            }
            else if(numbers[right] < numbers[mid]){
                left = mid + 1;
            }
            else{
                right--;
            }
        }
        return numbers[left];
    }
}