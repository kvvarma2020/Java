package Interface;

public class Home implements HomeInterface,SmallHouse{
    @Override
    public void lights() {
    System.out.println("price : 20$");
    }

    @Override
    public void smallLights() {
    System.out.println("price : 10$");
    }
}
