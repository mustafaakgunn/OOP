public class MasterStudent extends GraduateStudent{

    public MasterStudent(int no, String name, int year, int dob, String major, String advisor, String thesis, int financialAid) {
        super(no, name, year, dob, major, advisor, thesis, financialAid);
    }

    @Override
    public void study(){
        System.out.println("Master Student is studying...");
    }

    @Override
    public void register(){
        System.out.println("Master Student registered...");
    }

    @Override
    public void writeThesis(){
        System.out.println("Master Student is writing a thesis...");
    }

    @Override
    public void meetWithAdvisor(){
        System.out.println("Master Student is meeting with advisor...");
    }
}
