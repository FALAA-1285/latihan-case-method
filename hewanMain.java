import java.util.Scanner;

public class hewanMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dataHewan list=new dataHewan();
        int idx=0;
        do{
            System.out.println(" === MENU === ");
            System.out.println("1. Tambah data hewan");
            System.out.println("2. tampilkan data hewan ");
            System.out.println("3. urutkan data hewan berdasarkan nama (A-Z)");
            System.out.println("4. Search data hewan berdasarkan nama");
            System.out.println("5. keluar");
            System.out.print("pilih menu : ");
            int menu=sc.nextInt();
            sc.nextLine();
            switch(menu){
                case 1:
                    System.out.println("\n === TAMBAH DATA HEWAN === ");
                    String jawab;
                    do{
                    System.out.print("Id      : ");
                    String id=sc.nextLine();
                    System.out.print("nama    : ");
                    String nama=sc.nextLine();
                    System.out.print("Jenis   : ");
                    String jenis=sc.nextLine();
                    System.out.print("Umur    : ");
                    int umur=sc.nextInt();
                    sc.nextLine();
                    idx=list.TambahData(new hewan(id, nama, jenis, umur));
                    System.out.print("Tamabah hewan lagi? (y/n) : ");
                    jawab=sc.nextLine();
                    }while (jawab.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\n === TAMPILKAN DATA HEWAN === ");
                    list.tampilkanData();
                    break;
                case 3:
                    System.out.println("\n === URUTKAN DATA HEWAN === ");
                    list.Sorting();
                    list.tampilkanData();
                    break;
                case 4:
                    System.out.println("\n === SEARCH DATA HEWAN === ");
                    System.out.print("Masukkan key: ");
                    String key=sc.nextLine();
                    list.searchingData(key, 0, idx);
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
