import java.util.Scanner;

public class array02 {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int[] AbsGanjil = new int[10];
        int[] AbsGenap = new int[10];
        int gnp=0,gjl=0;

        for(int i=1;i<=20;i++) {
            if(i%2==1)	{
                AbsGanjil[gjl]=i;
                gjl++;
            }
            else {
                AbsGenap[gnp]=i;
                gnp++;
            }
        }

        System.out.println("Data Absen Ganjil");
        for(int i=0;i<10;i++) {
            System.out.println("Ganjil ke "+i+"="+AbsGanjil[i]);
        }

        System.out.println("Data Absen Genap");
        for(int i=0;i<10;i++) {
            System.out.println("Genap ke "+i+"="+AbsGenap[i]);
        }
    }

}