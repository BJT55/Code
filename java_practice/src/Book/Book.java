package Book;

public class Book {
	private String num;  //ISBN编号
	private String press;  //出版社
	private String author;   //作者
	private float price;    //价格
	private int page;    //页码
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) throws BookExeception{
		if(num.length()!=13){
			throw new BookExeception("ISBN编号不是13位");
		}
		else  
		{
			if(!numIsAllDigit(num))
			{
				throw new BookExeception("ISBN编号中有非数字字符");
			}
			else
			{
				this.num = num;
			}
		}
	}
	public boolean numIsAllDigit(String num)
	{
		boolean result=true;
		for(int i=0;i<num.length();i++)
		{
			char ch=num.charAt(i);
			if((ch<'0')||(ch>'9'))
			{
				result=false;
				break;
			}
		}
		return result;
	}
	
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public float getPrice(){
		return price;
	}
	public void setPrice(float price)  throws BookExeception{
		if(price<0){
			throw new BookExeception("图书价格不为负值");
		}
		else  this.price = price;
	}
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) throws BookExeception{
		if(page<=0){
			throw new BookExeception("页码数应该为正整数");
		}
		this.page = page;
	}
	public Book(String num,String press,String author,float price,int page) throws BookExeception{
		setNum(num);
		setPress(press);
		setPrice(price);
		setPage(page);
	}
}
