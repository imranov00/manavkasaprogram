import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double e= 2.14 ;
        double a=3.67;
        double d=1.11;
        double m=0.95;
        double p=5.00;
        double tutar;

        Scanner elma=new Scanner(System.in);
        System.out.println("Elma Kaç Kilo?:  " );
        e=e*elma.nextDouble();


        Scanner armut=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo?: ");
        a = a* armut.nextDouble();


        Scanner domates= new Scanner(System.in);
        System.out.println("Domates Kaç Kilo: ");
        d= d* domates.nextDouble();

        Scanner muz = new Scanner(System.in);
        System.out.println("Muz Kaç Kilo: ");
        m= m* muz.nextDouble();

        Scanner patlican= new Scanner(System.in);
        System.out.println("Patlıcan Kaç Kilo");
        p= p * patlican.nextDouble();

        tutar= p+m+d+a+e;
        System.out.println("Toplam Tutar: " + tutar);







    }
}