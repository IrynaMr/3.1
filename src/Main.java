import java.security.spec.RSAOtherPrimeInfo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        int array[] = new int [50];
        int j =1;
        for (int i = 0; i < array.length; i++) {
            array [i] = j;
            j+=2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+ " ");
        }
        //4
        System.out.println();
        int array1 [] = new int [10];
        int array2 [] = new int [10];
        int array3 [] = new int [10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*10);
            System.out.println(array1[i] +" ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random()*10);
            System.out.println(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.println(array3[i]+ " ");
        }
          //5
        System.out.println();
        int counter = 0;
        int arrayOne [] = new int[15];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) Math.round(Math.random()*10);
            System.out.println(arrayOne[i]+" ");
            if (arrayOne[i]%2==0)
                counter ++;
        }
        System.out.println("Кількість парних елементів у масиві:" + counter);
    }
}