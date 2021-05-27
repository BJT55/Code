import java.util.Scanner;

public class Day30_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            StringBuilder res = new StringBuilder();
            for(char c : str.toCharArray()){
                if(c == ' '){
                    res.append(c);
                }
                else if( c > 'E'){
                    res.append((char)(c - 5));
                }
                else {
                    res.append((char)(c - 'A' + 'V'));
                }
            }
            System.out.println(res.toString());
        }
    }
}
