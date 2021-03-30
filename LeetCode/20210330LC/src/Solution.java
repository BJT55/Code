class Solution46 {
    int count = 0;
    public int translateNum(int num) {
        return help(num);
    }
    public int help(int num){
        if(num < 9){
            return 1;
        }
        if(num % 100 < 26 && num % 100 > 9){
            return help(num / 100) + help(num / 10);
        }
        else{
            return help(num / 10);
        }
    }
}