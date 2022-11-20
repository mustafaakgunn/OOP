public class RegistrationOffice {

    public Student studentToRegister;


    public void randStudent(){

    switch ((int)Math.ceil(Math.random() * 6))
    {
        case 1:
            studentToRegister = new Student(1,"student",2015,1990,"science");
            break;
        case 2:
            studentToRegister = new VocationalStudent(1,"student",2015,1990,"science");
            break;
        case 3:
            studentToRegister = new GraduateStudent(1,"student",2015,1990,"science","teacher","thesis");
            break;
        case 4:
            studentToRegister = new UndergraduateStudent(1,"student",2015,1990,"science");
            break;
        case 5:
            studentToRegister = new MasterStudent(1,"student",2015,1990,"science","teacher","thesis");
            break;
        case 6:
            studentToRegister = new PhdStudent(1,"student",2015,1990,"science","teacher","thesis");
            break;
    }
    }
}
