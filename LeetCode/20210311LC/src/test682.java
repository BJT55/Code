public class test682 {
}

class Solution682 {
    public int calPoints(String[] ops) {
        int[] arr = new int[ops.length];
        int i = 0;
        for(String s : ops){
            switch (s){
                case "+":
                    arr[i] = arr[i-1] + arr[i-2];
                    i++;
                    break;
                case "D":
                    arr[i] = arr[i-1]*2;
                    i++;
                    break;
                case "C":
                    arr[i-1] = 0;
                    i--;
                    break;
                default:
                    arr[i] = Integer.valueOf(s);
                    i++;
            }
        }
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}