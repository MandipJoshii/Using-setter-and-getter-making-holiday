public class baisc_1 {

    static class Mandip {
        String cast;
        int age;
 
        public void dis() {
            System.out.println(cast + " " + age);
        }
    }

    public static void main(String[] args) {
        Mandip abc = new Mandip();
        abc.age = 20;
        abc.cast = "Joshi";

        abc.dis();
    }
}
