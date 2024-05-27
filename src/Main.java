import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        System.out.println(array[0]);

        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
        int [] array2 = new int[4];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<array2.length;i++ ){
            array2 [i]=scan.nextInt();

        }
        for(int i = 0; i<array2.length;i++){
            System.out.println(array2[i]);
        }

        for(int value:array){
            System.out.println(value);
        }













    }
}