import java.util.Random;

public class RegistrationOffice {

    public Student studentToRegister;

    Random rand = new Random();

    public void randStudent(){

    switch ((int)Math.ceil(Math.random() * 6))
    {
        case 1:
            studentToRegister = new Student(1,"student",2015,1990,"science", rand.nextInt(15000));
            break;
        case 2:
            studentToRegister = new VocationalStudent(1,"student",2015,1990,"science", rand.nextInt(15000));
            break;
        case 3:
            studentToRegister = new GraduateStudent(1,"student",2015,1990,"science","teacher","thesis", rand.nextInt(15000));
            break;
        case 4:
            studentToRegister = new UndergraduateStudent(1,"student",2015,1990,"science", rand.nextInt(15000));
            break;
        case 5:
            studentToRegister = new MasterStudent(1,"student",2015,1990,"science","teacher","thesis", rand.nextInt(15000));
            break;
        case 6:
            studentToRegister = new PhdStudent(1,"student",2015,1990,"science","teacher","thesis", rand.nextInt(15000));
            break;
    }
    }
}
