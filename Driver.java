public class Driver {
    public static void main(String[] args){
        Box joe = new Box(10,10,50,30);
        System.out.println(joe);

        joe.moveto(20,20);
        System.out.println(joe);

        NamedBox jane = new NamedBox(40,40,80,60,"Jane");
        jane.rotate(45);
        jane.grow(50);
        System.out.println(jane);

        Ebox Jason = new Ebox(50,60,90,80,"Tom",45, 50,true);
        Jason.rotate(90);
        Jason.changeName("Mike");
        Jason.setValue(false);
        System.out.println(Jason);




    }
}
