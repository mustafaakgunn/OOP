public class Student {

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

    public void study(){
        System.out.println("Student is studying...");
    }

    public void register(){
        System.out.println("Student registered...");
    }

    public String toString(){
        return (name + " " + no);
    }
}
