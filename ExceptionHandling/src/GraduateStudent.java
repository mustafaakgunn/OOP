public class GraduateStudent extends Student{

    public String advisor;
    public String thesis;

    public GraduateStudent(int no, String name, int year, int dob, String major, String advisor, String thesis, int financialAid) {
        super(no, name, year, dob, major, financialAid);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study(){
        System.out.println("Graduate Student is studying...");
    }

    @Override
    public void register(){
        System.out.println("Graduate Student registered...");
    }

    public void writeThesis(){
        System.out.println("Graduate Student is writing a thesis...");
    }

    public void meetWithAdvisor(){
        System.out.println("Graduate Student is meeting with advisor...");
    }

}
