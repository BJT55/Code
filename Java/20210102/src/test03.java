public class test03 {
    public static void main(String[] args) {
        int[] array = {1,4,7,9,23,45,67,78,98,99};
        if (binSearch(array,78) != -1){
            System.out.println("该值的下标为："+binSearch(array,78));
        }else{
            System.out.println("未找到....");
        }
    }

    public static int binSearch(int []array, int num) {
        int low = 0;
        int high = array.length - 1;
        while (low<high){
            int mid = (low + high) / 2;
            if (array[mid] == num){
                return mid;
            }else {
                if (array[mid] > num){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
