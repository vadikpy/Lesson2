import java.util.Scanner;
import java.util.Random;
import lombok.*;


public class Main {
    public static void main(String[] args) {Car n1 = new Car("Mercedes","CLS","Black",40000,1);
       Car n2 = new Car("BMW","M4","Green",80000,2);
       Car n3 = new Car("BMW","520i","White",15000,1);
       Car n4 = new Car("Toyota","Supra","Red",100000,1);

       System.out.println(n1.toString());

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());




    }




}