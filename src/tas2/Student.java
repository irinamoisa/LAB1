package tas2;

public class Student {
    private String name;
    private int year;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override

    public String toString() {
        return "Studentul{" +
                "name=" + name +
                ", year=" + year +
                '}';
    }
}
