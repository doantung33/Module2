import java.util.Scanner;

public class ReverseTheArrayElement {
    public static void main(String[] args) {
        System.out.println("Application");
        int sezi;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a sezi");
            sezi= scanner.nextInt();
            if(sezi>20){
                System.out.print(" Sezi dose not exceed 20");
            }
        }while (sezi>20);
        array= new int[sezi];
        int i =0;
        while (i<array.length){
            System.out.print("Enter element " +(i+1)+ " :");
            array[i]= scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Element in array:"," ");
        for (int j=0 ;j<array.length;j++){
            System.out.print(array[j]+ "  ");
        }
        for (int j=0;j<array.length/2 ;j++){
            int c = array[j];
            array[j]=array[sezi-1-j];
            array[sezi-1-j]=c;
        }
        System.out.printf("%-20s" ,"Reverse array:" , " ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j] + "  ");
        }
    }
}
