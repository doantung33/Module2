import java.util.Scanner;
public class FindValueArray {
    public static void main(String[] args) {
        String[] student= {"Tuan","Hung","Tran","Anh"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhâp tên học sinh");
        String students = scanner.nextLine();
        boolean isStudent = false ;
        for (int i=0;i<student.length;i++){
            if(student[i].equals(students)){
                System.out.println(students +" "+"Có trong mảng tại vị trí "+(i+1));
                isStudent = true;
                break;
            }
        }if(!isStudent) {
            System.out.println(students + " Không có trong mảng");
        }

    }
}
