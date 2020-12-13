package experiment04;
import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		System.out.println(getNum(22,5));
		System.out.println(getNum(33,7));
		System.out.println("双色球红球"+getNum(33,6));
		System.out.println("双色球蓝球"+getNum(16,1));
	}

	public static String getNum(int num1,int num2) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		Random r=new Random();
		result.add(new Integer(r.nextInt(num1)+1));
		int i=1;
		while(i<num2) {
			Integer temp=r.nextInt(num1)+1;
			if(!result.contains(temp)){
				result.add(temp);
				i++;
			}
		}
		String str=num1+"选"+num2+"产生的的数为：";
		for(int j=0;j<result.size();j++) {
			str=str+" "+result.get(j).toString()+",";
		}
		return str;
	}
}

