public class Local {
    private int number = 135;

    void numberReader() {
        class LocalInner {
            void msg() {
                System.out.println(number);
            }
        }
        LocalInner inner = new LocalInner();
        inner.msg();
    }
}
