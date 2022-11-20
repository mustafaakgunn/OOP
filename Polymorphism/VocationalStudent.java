public class VocationalStudent extends Student{

    public VocationalStudent(int no, String name, int year, int dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study(){
        System.out.println("Vocational Student is studying...");
    }

    @Override
    public void register(){
        System.out.println("Vocational Student registered...");
    }

    @Override
    public String toString(){
        return (name + " " + no);
    }
}
