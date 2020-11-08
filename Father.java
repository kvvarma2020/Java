public class Father extends GrandFather {

    int result= i+1;

    public Father(int j) {
        super(j);
    }

    @Override
    public void eyes() {
       // super.eyes();
       System.out.println(result);

    }

}
