class Parent
{
    public void Fast()
    {
        System.out.println("Ferrari is Faster");
    }
}
class Child extends Parent
{
    public void Fast()
    {
        System.out.println("Aston Martin is Faster");
    }
}
public class Override
{
    public static void main(String args[])
    {
      Parent p=new Child();
      p.Fast();
    }
}