package experiment04;

public class IdCardXiAn {
	public static void main(String[] args){
		String str="610112200007084093";
		checkId(str);
	}
	public static void checkId(String str)
	{
		if( str.startsWith("610112") )
		{
			System.out.println("这个人是陕西省西安市未央区的.....");
		}
		int sex=Integer.parseInt(String.valueOf(str.charAt(16)));
		if(sex%2!=0)
		{
			System.out.println("这个人是男性.......");
		}
	}
}

