public class test415 {

}


/*
class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int sum = 0,i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || sum != 0){
            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';
            sb.append(sum%10);
            sum /= 10;
        }
        return sb.reverse().toString();
    }
}*/

//同思路
class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int sum = 0,i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || sum != 0){
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int ret = x + y + sum;
            sb.append(ret%10);
            sum = ret / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}

