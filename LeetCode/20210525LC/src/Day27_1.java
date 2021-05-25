public class Day27_1 {
    public int Add(int num1,int num2) {
        while(num2 != 0){
            int carry = (num1 & num2) << 1;
            num1 ^= num2;
            num2 = carry;
        }
        return num1;
    }
}
