

class cal{
    public void p()
    {
        System.out.println("111");
    }
}
public class Calculate {

    private cal ca;
    public Calculate(){
        this.ca=new cal();
    }
    public void pp(){
        ca.p();
    }

    public int add(int a,int b){

        return a+b;

    }

    public int subtract(int a,int b){

        return a-b;

    }

    public int multiply(int a,int b){

        return a*b;

    }

    public int divide(int a,int b){

        return a/b;

    }

}