package experiment01;

public class TwelveAnimals {
		public static void main(String[] args){
			Year.printAnimal(2000);
		}

	}
class Year{
	    public static void printAnimal (int n){
			int animal= (n-1900)%12;
			if(n<1900){
				System.out.println("Äê·ÝÊäÈëÓÐÎó£¡");
			}
			else{
				switch(animal){
				case 0:
					System.out.println("Êó");break;
				case 1:
					System.out.println("Å£");break;
				case 2:
					System.out.println("»¢");break;
				case 3:
					System.out.println("ÍÃ");break;
				case 4:
					System.out.println("Áú");break;
				case 5:
					System.out.println("Éß");break;
				case 6:
					System.out.println("Âí");break;
				case 7:
					System.out.println("Ñò");break;
				case 8:
					System.out.println("ºï");break;
				case 9:
					System.out.println("¼¦");break;
				case 10:
					System.out.println("¹·");break;
				case 11:
					System.out.println("Öí");break;
				}
			}	
		}
}


