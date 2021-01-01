package package01;

public class Date {
    public int year;
    public int month;
    public int day;

    // alt + insert  --> toString()
    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    // alt + insert  --> constructor
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDay(Date this, int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
