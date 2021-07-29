package system;

public class HouseList {
    private House[] houses = new House[100];
    private int count = 0; // 当前房屋数量

    // 初始化房屋信息
    public HouseList() {
        houses[0] = new House("2-1-301",100.5,"三室一厅两卫");
        houses[1] = new House("4-2-101",50,"一室一厅一卫");
        houses[2] = new House("1-1-501",75.5,"两室一厅一卫");
        houses[3] = new House("6-2-201",160,"四室两厅两卫");
        count = 4;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public House getHouse(int index){
        return houses[index];
    }
    public void setHouse(int index, House house){
        houses[index] = house;
    }
}
