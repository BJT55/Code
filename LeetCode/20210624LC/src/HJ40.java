import java.util.Scanner;

public class HJ40 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            int letter = 0, blank = 0, digit = 0, other = 0;
            for(char c : s.toCharArray()){
                if(Character.isLetter(c)){
                    letter++;
                }else if(Character.isDigit(c)){
                    digit++;
                }else if(c == ' '){
                    blank++;
                }else{
                    other++;
                }
            }
            System.out.println(letter);
            System.out.println(blank);
            System.out.println(digit);
            System.out.println(other);
        }
    }
}
