public class MainClass {
    public static void main(String arg[]){

        Poly poly=new Poly();
        poly.add(1,2,4);

// dynamic

        Father father = new Son(90);
        father.eyes();

//System.out.println("started");
//
//GrandFather grandFather =new GrandFather(89);
//Father father = new Father(90);
//Son son = new Son(96);
//
//grandFather.eyes();
//father.eyes();
//son.eyes();
//son.setSonResult(20);
//System.out.println(son.getSonResult());

    }
}
