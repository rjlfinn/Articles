package reflection.app;

public class Apple {

    public Apple() {
    }

    public void appleMethodOne() {
        System.out.println("executing method one!");
    }

    public void appleMethodTwo() {
        System.out.println("executing method two!");
    }

    public void appleMethodWithArg(String argOne) {
        System.out.println("executing method with arg " + argOne);
    }

    public String appleMethodWithReturn() {
        return " returning Object of type String ";
    }
}
