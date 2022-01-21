package Final;

class Final_Keyword {
    static final int MAX;
    final int MIN = 1;
    final int NORMAL;
    static {
        MAX = 10;
    }
    Final_Keyword() {
            NORMAL = 0;
    }

}
class test {
    public static void main(String[] args) {
        Final_Keyword  f = new Final_Keyword();
        System.out.println(f.MIN);
        System.out.println(f.MAX);
        System.out.println(f.NORMAL);



    }
}