import java.util.*;
public class HJ26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            StringBuilder res = new StringBuilder();
            List<Character> list = new ArrayList<>();
            for(char c : s.toCharArray()){
                if(Character.isLetter(c)){
                    list.add(c);
                }
            }

            list.sort(new Comparator<Character>(){
                @Override
                public int compare(Character o1, Character o2){
                    return Character.toLowerCase(o1) - Character.toLowerCase(o2);
                }
            });

            int index = 0;
            for(char c : s.toCharArray()){
                if(Character.isLetter(c)){
                    res.append(list.get(index++));
                }else{
                    res.append(c);
                }
            }
            System.out.println(res.toString());
        }
    }
}
