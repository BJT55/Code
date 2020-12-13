package Book;

public class Test {
	public static void main(String[] args) {
		
		try {
			Book book=new Book("93424578765","清华大学出版社","徐文海",31,306);
		} 
		catch (BookExeception a) {
			System.out.println(a.getMessage());
		}
		
		try{
			Book book=new Book("978730235938A","清华大学出版社","徐文海",31,306);
		}
		catch(BookExeception b){
			System.out.println(b.getMessage());
		}
		
		try {
			Book book=new Book("9787302359388","清华大学出版社","徐文海",-31,306);
		} catch (BookExeception c) {
			System.out.println(c.getMessage());
		}
		
		try {
			Book book=new Book("9787302359388","清华大学出版社","徐文海",31,-306);
		} catch (BookExeception d) {
			System.out.println(d.getMessage());
		}
	}

}
