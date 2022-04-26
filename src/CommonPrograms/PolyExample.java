package CommonPrograms;
class A
{
    public void methodA()
    {
        System.out.println(" from A");
    }
    
    public void methodB()
    {
        System.out.println(" from A");
    }
}

public class PolyExample extends A{
    public void methodA()
    {
        System.out.println(" from B");
        
    }
    
    
    public static void main(String[] args) {
        A a = new PolyExample();
        a.methodA();
        a.methodB();
        PolyExample c = new PolyExample();
        c.methodA();
    }
}
