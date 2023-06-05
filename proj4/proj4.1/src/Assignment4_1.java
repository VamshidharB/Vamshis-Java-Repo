interface Area1{
    void area1();
}
interface Area2{
    void  area2();
}
public class Assignment4_1 implements Area1, Area2
{
    public void area1(){
        System.out.println("This calculates  area 1");
    }
    public void area2(){
        System.out.println("This calculates  area 2");
    }

    public static void main(String[] args) {
        Assignment4_1 m=new Assignment4_1();
        m.area1();
        m.area2();

    }
}