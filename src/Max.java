import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sezi ;
        int []array;
        do {
            System.out.println("Enter sezi");
            sezi= scanner.nextInt();
            if(sezi>20){
                System.out.println("Retype");
            }
        }while (sezi>20);
        array =new int[sezi];
        int i=0;
        while (i<array.length){
            System.out.print("Enter element "+ (i+1)+ ":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Property list :");
        for (int j=0; j<array.length;j++){
            System.out.println(array[j]+ " ");
        }
        int max= array[0];
        int index =1;
        for (int j =0;j<array.length;j++){
            if (max<array[j]){
                max=array[j];
                index =j+1;
            }
        }
        System.out.println("Max is " + max+ " tại vị trí " + index);
    }
}
