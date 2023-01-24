public class Student extends FinancialSupportOps{

    public int no;
    public String name;
    public int year;
    public int dob;
    public String major;

    public int financialAid;

    public Student(int no, String name, int year, int dob, String major, int financialAid) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
        this.financialAid = financialAid;
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
