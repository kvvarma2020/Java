package Java;

public class Son extends Father {

    public Son(int j) {
        super(j);
    }

    public int getSonResult() {
        return sonResult;
    }

    public void setSonResult(int sonResult) {
        this.sonResult = sonResult;
    }

    int sonResult= result+1;

    @Override
    public void eyes() {
      //  super.eyes();
        System.out.println(sonResult);
    }
}
