import java.util.Scanner;

public class hewanMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println(" === MENU === ");
            System.out.println("1. Tambah data hewan");
            System.out.println("2. tampilkan data hewan ");
            System.out.println("3. urutkan data hewan berdasarkan nama (A-Z)");
            System.out.println("4. Search data hewan berdasarkan nama");
            System.out.println("5. keluar");
            System.out.print("pilih menu : ");
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi");
                    return;
                default :
                    System.out.println("menu tidak tersedia!! ");
                    break;
            }
        }while (true);
    }
}
