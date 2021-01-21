package Test;

public class Test {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Animal animal = null;
//        // 向上转型
//        animal = cat;

        //  上述表达合并
//        Animal animal = new Cat();

        // 向上转型 也看发横在方法传参的过程
        // 方法传参 本质上也就是在进行“赋值”操作
//        func(new Cat());

        // 向上转型 也肯能发生在方法返回的时候
//        Animal animal = func2();
//        System.out.println(animal.name);
//        System.out.println(animal.gender);
        // gender 是子类的属性 是无法访问到的
        // 由于访问属性这件事 是编译过程中确定的 编译时候编译器就会检查当前的属性是否存在
        // 在类中存在

        // 如果 eat 方法只在父类中存在，此时调用的方法是父类的方法（不涉及动态绑定）
        // 如果 eat 方法只在子类中存在，此时调用的的方法就变编译报错（也不涉及）
        // 如果 eat 方法在父类和子类中都存在，并且参数相同，此时调用 eat 方法就会涉及到动态绑定
        // 运行时，看 animal 究竟指向一个父类还是一个子类实例 指向父类实例就调用父类的eat 指向子类实例就调用子类的eat

//        Animal animal = new Cat();
//        animal.eat("鱼");


        //体现多态
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Flower();
//
        draw(shape1);
        draw(shape2);
        draw(shape3);
//
//        shape1.draw();
//        shape2.draw();
//        shape3.draw();

        Shape[] shapes = {
                new Circle(),
                new Rectangle(),
                new Flower()
        };
        for (Shape shape : shapes){
            draw(shape);
        }

    }

    public static void draw(Shape shape){
        shape.draw();
    }



//    public static void func(Animal animal){
//
//    }

//    public static Animal func2(){
//        return new Cat();
//    }




}
