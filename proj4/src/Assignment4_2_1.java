import java.sql.SQLOutput;
public class Assignment4_2_1{
    String str1="I am Parent child instance variable";
}
class Assignment4_2_2 extends Assignment4_2_1 {
    String str2="I am child class  instance variable";
    void Assignment4_2_2(){
        str1="Parent instance updated";
        str2="Child instance updated";
        System.out.println("Parent instance : "+str1);
        System.out.println("child instance : "+str2);
    }
    void Assignment4_2_2(String[] s){
        str2="Child instance updated with the overloaded constructor";
        System.out.println("child instance : "+str2);
    }
    public static void main(String[] args){

        Assignment4_2_1 o1= new Assignment4_2_1();
        Assignment4_2_2 o2= new Assignment4_2_2();
        System.out.println(o1.str1);
        System.out.println(o2.str2);
        o2.Assignment4_2_2();
    }

}
