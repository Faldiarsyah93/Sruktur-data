public class array2 {
    public static void main(String[] args) {
        System.out.println("Faldiarsyah Dwiki Permana");
        System.out.println("UTS");int [] bil = {2, 4, 10, 11, 13, 16, 19, 200,112,116,119, 45, 23, 89, 111};
        System.out.print("Bilangan Genap  :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
    }
}