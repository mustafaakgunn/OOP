import java.util.Random;

public class Main {

    public static void main(String[] args) {

        RegistrationOffice register = new RegistrationOffice();
        register.randStudent();

        Random rand = new Random();

        // Sorry for polluted-looking if blocks :)
        // Main purpose in here is Demonstration of Downcasting and Upcasting and Polymorphism.

        // Random selected class is actuate it's behaviours without any runtime casting error caused by
        // Parent to Child casting...

        if(register.studentToRegister instanceof MasterStudent){
            MasterStudent master = new MasterStudent(1,"student",2015,1990,"science","teacher","thesis", rand.nextInt(15000));
            master.study();
            master.financialSupportPayment(master);
        } else if (register.studentToRegister instanceof PhdStudent) {
            PhdStudent phd = new PhdStudent(1,"student",2015,1990,"science","teacher","thesis", rand.nextInt(15000));
            phd.study();
            phd.financialSupportPayment(phd);
        } else if (register.studentToRegister instanceof GraduateStudent) {
            GraduateStudent grad = new GraduateStudent(1,"student",2015,1990,"science","teacher","thesis", rand.nextInt(15000));
            grad.study();
            grad.financialSupportPayment(grad);
        } else if (register.studentToRegister instanceof UndergraduateStudent) {
            UndergraduateStudent ugrad = new UndergraduateStudent(1,"student",2015,1990,"science", rand.nextInt(15000));
            ugrad.study();
            ugrad.financialSupportPayment(ugrad);
        } else if (register.studentToRegister instanceof VocationalStudent) {
            VocationalStudent voc = new VocationalStudent(1,"student",2015,1990,"science", rand.nextInt(15000));
            voc.study();
            voc.financialSupportPayment(voc);
        } else if (register.studentToRegister instanceof Student) {
            Student stud = new Student(1,"student",2015,1990,"science", rand.nextInt(15000));
            stud.study();
            stud.financialSupportPayment(stud);
        }
    }
}