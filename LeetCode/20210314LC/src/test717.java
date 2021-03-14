public class test717 {
}


class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        int oneNum = 0;
        for(int i = bits.length - 2; i >= 0; --i){
            if(bits[i] == 1)
                oneNum++;
            else break;
        }
        if(oneNum%2 == 1)
            return false;
        return true;
    }
}