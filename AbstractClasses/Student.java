public abstract class Student {

    public int no;
    public String name;
    public int year;
    public int dob;
    public String major;

    public Student(int no, String name, int year, int dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    public abstract void study();

    public abstract void register();

    public String toString(){
        return (name + " " + no);
    }
}
