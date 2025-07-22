package java8.terminalmethod;

class Outer
{
    static class Inner
    {
        public void methodOne(){
            System.out.println("inner class method");
        }
    }
    public static void main(String[] args)
    {
        Inner in=new Inner(){
            public void methodOne(){
                System.out.println("Main class method");
            }
        };
        in.methodOne();

    }
}

