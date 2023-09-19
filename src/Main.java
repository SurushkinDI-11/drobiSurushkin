import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите числитель первой дроби");
        int chisl1= sc.nextInt();
        System.out.println("Введите знаменатель первой дроби");
        int znamn1= sc.nextInt();
        drobi drobi1=new drobi(chisl1,znamn1);

        System.out.println("Введите числитель второй дроби");
        int chisl2= sc.nextInt();
        System.out.println("Введите знаменатель второй дроби");
        int znamn2= sc.nextInt();
        drobi drobi2=new drobi(chisl2,znamn2);

        drobi sum=drobi1.Sum(drobi2);
        System.out.println("Сложение "+sum.getChisl()+"/"+sum.getZnamin());

        drobi vichit=drobi1.Vichit(drobi2);
        System.out.println("Вычитание "+vichit.getChisl()+"/"+vichit.getZnamin());

        drobi umnog=drobi1.Umnog(drobi2);
        System.out.println("Умножение "+umnog.getChisl()+"/"+umnog.getZnamin());

        drobi del=drobi1.Delenie(drobi2);
        System.out.println("Деление "+del.getChisl()+"/"+del.getZnamin());

        System.out.println("\n* Если знаменатель равен нулю, значит, дробь не существует.");
        System.out.println("* Если числитель равен нулю, вся дробь становится равной нулю");
        System.out.println("* Если и числитель и знаменатель равны нулю, то дробь называется неопределенностью вида 0/0, и она уже ничему не равна :-)");
    }
}