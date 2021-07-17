public class JZ32 {
    public String PrintMinNumber(int [] numbers) {
        int len = numbers.length;
        int tmp;

        if (len < 1){
            return "";
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                String s1 = numbers[j] + String.valueOf(numbers[j+1]);
                String s2 = numbers[j+1] + String.valueOf(numbers[j]);
                if (s1.compareTo(s2) > 0){
                    tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
        String res = String.valueOf(numbers[0]);
        for (int i = 1; i < len; i++) {
            res += numbers[i];
        }
        return res;
    }
}
