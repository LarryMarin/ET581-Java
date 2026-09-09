public class StrEx2 {
    public static void main(String [] args){
        String city = "nyc";
        System.out.println(city);
        city = city.toUpperCase();
        System.out.println(city);
        city = city.replace('Y', 'e').replace('C', 'w');
        System.out.println(city);
        city = city + " York";
        System.out.println(city);
        city += " City";
        System.out.println(city);
        System.out.println(city.replace('C', 'c'));
        city = city.toLowerCase();
        System.out.println(city);
        city = city.substring(9);
        System.out.println(city);
    }
}
