public class Day27_1 {
    public int Add(int num1,int num2) {
        while(num1 != 0){
            int tmp = num1^num2;
            num1 = (num1&num2)<<1;
            num2 = tmp;
        }
        return num2;
    }
}