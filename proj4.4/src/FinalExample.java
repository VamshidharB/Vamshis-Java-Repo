 final class  FinalExample {
    final static int a=10;
    final void FinalMethod(){
        System.out.println("This is an example of final Method");
    }

    public static void main(String[] args) {
        FinalExample ob=new FinalExample();
        System.out.println("Value of the final variable is "+a);
        System.out.println("Calling the final method ");
        ob.FinalMethod();
        abc abject=new abc();
        abject.a();


    }
}

class abc {
    void a(){
        FinalExample o=new FinalExample();
        System.out.println("/n");
        o.FinalMethod();


    }

}