package IdCard;

public class Test {

	public static void main(String[] args){
		
		String num="42327620000122486X";
		char ch=num.charAt(16);
		int sex=Integer.parseInt(String.valueOf(ch));
		if(sex%2==0)
		{
			System.out.println("这个人是女性.....");
		}
		else   System.out.println("这个人是男性.....");
		
		String str1=num.substring(10,12);        //出生月
		String str2=num.substring(12,14);        //出生日
		if(str1.startsWith("0"))
		{
			str1=num.substring(11,12);
		}
		if(str2.startsWith("0"))
		{
			str2=num.substring(13,14);
		}
		System.out.println("出生日期是："+num.substring(6, 10)+"年"+str1+"月"+str2+"日");	
		
		
		try 
		{
			IdCard id1=new IdCard("42327620000122486");
		} 
		catch (IdCardException e) 
		{
			System.out.println(e.getMessage());
		}

		try 
		{
			IdCard id2=new IdCard("42327620000122486a");
		} 
		catch (IdCardException e) 
		{
			System.out.println(e.getMessage());
		}
		try 
		{
			IdCard id3=new IdCard("4232762000012268X7");
		} 
		catch (IdCardException e) 
		{
			System.out.println(e.getMessage());
		}

	}
}

