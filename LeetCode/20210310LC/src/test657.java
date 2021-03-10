public class test657 {
    public static void main(String[] args) {
        Solution657 s = new Solution657();
        String moves = "UD";
        System.out.println(s.judgeCircle(moves));
    }
}

class Solution657 {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(int i = 0; i < moves.length(); ++i){
            char c = moves.charAt(i);
            if(c == 'U')
                y += 1;
            if(c == 'D')
                y -= 1;
            if(c == 'R')
                x += 1;
            if(c == 'L')
                x -= 1;
        }
        return x == 0 && y == 0 ;
    }
}