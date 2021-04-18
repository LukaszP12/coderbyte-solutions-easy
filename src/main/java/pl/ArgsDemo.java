package pl;

public class ArgsDemo {

    public static int suma(int arg0, int...args) {

        int wynik = arg0;

        for(int i=0; i<args.length; i++) {

            wynik += args[i];
        }
        return wynik;
    }


    public static void main(String[] args) {
        int suma = suma(5, 10, 15, 20, 25, 30);
        System.out.println(suma);
    }

}
