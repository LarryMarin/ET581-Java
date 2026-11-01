package Ex1;

class TestAnimal{
    public static void main(String [] args){
        Animal a = new Animal();
        Tiger t = new Tiger();
        Dog d = new Dog();
        Pig p = new Pig();
        Rat r = new Rat();

        System.out.println(a.getName());
        System.out.println(t.getName());
        System.out.println(d.getName());
        System.out.println(p.getName());
        System.out.println(r.getName());

        Animal [] x = new Animal [4];
        x[0] = new Dog();
        x[1] = new Tiger();
        x[2] = new Pig();
        x[3] = new Rat();

        for(int i = 0; i < x.length; i++){
            System.out.println(x[i].getName());
        }
    }
}