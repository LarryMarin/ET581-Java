import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
class test{
    public static void main(String [] args){
        ArrayList<String> name = new ArrayList<String>();
        name.add("Larry");
        name.add("Marin");
        name.add("Antonio");
        System.out.println(name);
        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));

        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("apple");
        System.out.println(fruit);
        fruit.add("banana");
        System.out.println(fruit);
        fruit.add("kiwi");
        System.out.println(fruit);
        fruit.set(2, "pear");
        System.out.println(fruit);
        fruit.remove(1);
        System.out.println(fruit);
        ArrayList<String> fruit2 = new ArrayList<String>();
        fruit2.add("Orange");
        fruit2.add("Strawberry");
        fruit.addAll(fruit2);
        System.out.println(fruit);
        fruit.removeIf(str -> str.contains("r"));
        System.out.println(fruit);
        fruit.clear();
        System.out.println(fruit);

        ArrayList<String> month = new ArrayList<String>();
        month.add("Jan");
        month.add("Feb");
        month.add("Mar");
        month.add("Apr");
        month.add("May");
        month.add("Jun");

        for(int i = 0; i < month.size(); i++){
            System.out.println(month.get(i));
        }

        month.set(5, "June");
        month.set(3, "April");
        for(String i: month){
            System.out.println(i);
        }

        ArrayList<String> month2 = new ArrayList<String>();
        month2.add("Jan");
        month2.add("Feb");
        month2.add("Mar");
        month2.add("Agu");
        month2.add("Oct");
        month2.add("Nov");
        month2.add("Dec");
        month2.add("Apr");
        month2.add("May");
        month2.add("Jun");
        month2.add("Jul");
        Collections.sort(month2);
        System.out.println(month2);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 11; i++){
            numbers.add((int)(Math.random()*100 + 1));
        }
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(numbers.get(5));

        LinkedList<String> month3 = new LinkedList<String>();
        month3.add("Jan");
        month3.add("Feb");
        month3.add("Mar");
        month3.add("Apr");
        month3.add("May");
        month3.add("Jun");
        month3.add("Jul");
        month3.add("Agu");
        month3.add("Oct");
        month3.add("Nov");
        month3.add("Dec");
        System.out.println(month3);
        month3.remove(5);
        System.out.println(month3);
        month3.remove("Nov");
        System.out.println(month3);
    }
}
