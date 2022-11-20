public class PhdStudent extends GraduateStudent{

    public boolean qualifyingExamTaken;

    public PhdStudent(int no, String name, int year, int dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study(){
        System.out.println("PhD Student is studying...");
    }

    @Override
    public void register(){
        System.out.println("PhD Student registered...");
    }

    @Override
    public void writeThesis(){
        System.out.println("PhD Student is writing a thesis...");
    }

    @Override
    public void meetWithAdvisor(){
        System.out.println("PhD Student is meeting with advisor...");
    }

    public void writePaper(){
        System.out.println("PhD Student is writing paper...");
    }

}
