package system;

public class House {
    private String address; // 门牌号
    private double area; // 面积
    private String type; // 户型
    private boolean state = false; // 状态：售出、未售出
    // 构造方法初始化
    public House(String address, double area, String type) {
        this.address = address;
        this.area = area;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double getArea() {
        return area;
    }

    public String getType() {
        return type;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "房屋 [" +
                "地址='" + address + '\'' +
                ", 面积=" + area +
                ", 户型='" + type + '\'' +
                ", 是否售出=" + state +
                ']';
    }
}
