public class Main {

    public static void main(String[] args) {

        //Member Inner class is here...
        Member member = new Member();
        Member.Inner inner = member.new Inner();
        inner.numberReader();


        //Static Inner is here...
        Static.InnerStatic innerStatic = new Static.InnerStatic();
        innerStatic.staticNumberReader();


        //Anonymous Inner class is here...
        Anonymous anon = new Anonymous() {
            @Override
            void number() {
                System.out.println("anonymous number");
            }
        };
        anon.number();

        //Local Inner class is here...
        Local local=new Local();
        local.numberReader();


    }
}
