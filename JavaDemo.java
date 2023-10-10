public class JavaDemo {
    public static void main(String[] args) {
        String a = "ab";
        String c = new String("a");
        System.out.println(a.compareTo(c));
        System.out.print(Temp.test);
    }
    public void callThis(){
        System.out.println("test is called");
    }
}

class Temp{
    public static final JavaDemo test = null;
    public static void setTest(){
        System.out.println("Test");
    }
}