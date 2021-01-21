package Test;

public class Cat extends Animal{
    public String gender = "母";
    public String getGender(){
        return gender;
    }
    public void eat(String food){
        System.out.println("猫正在吃" + food);
    }
}
