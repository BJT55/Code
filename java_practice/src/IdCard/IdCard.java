package IdCard;

public class IdCard {
	private String num;
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) throws IdCardException{
		char[] charArray=num.toCharArray();
		if(num.length()!=18)
		{
			throw new IdCardException("身份证号位数不是18位......");
		}
		else 
		{
			for(int i=0;i<18;i++)
			{
				if( i<=16 && !numIsAllDigit(charArray[i]) )
				{
					throw new IdCardException("身份证号前17位有非数字符号......");
				}
				else  
				{
					if(i==17&&!numIsNotDigitOrXx(charArray[i]))
					{
						throw new IdCardException("身份证号第18位有非数字或字母X/x以外的符号......");
					}
					else this.num=num;
				}
			}
			
		}
	}
	
	public boolean numIsAllDigit(char ch)
	{
		boolean result=true;
		if((ch<'0')||(ch>'9'))
		{
			result=false;
		}
		return result;
	}
	public boolean numIsNotDigitOrXx(char ch)
	{
		boolean result=true;
		if(   (ch<'0')||(ch>'9') || ch!='X' || ch!='x')
		{
			result=false;
		}
		return result;
	}
	public IdCard(String num) throws IdCardException{
		setNum(num);
	}
}
