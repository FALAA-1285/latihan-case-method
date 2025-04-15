public class hewan{
    String id;
    String nama;
    String jenis;
    int umur;

    hewan(){

    }
    hewan(String id, String nama, String jenis, int umur){
        this.id=id;
        this.nama=nama;
        this.jenis=jenis;
        this.umur=umur;
    }
    void tampil(){
        System.out.println("ID      : "+id);
        System.out.println("Nama    : "+nama);
        System.out.println("Jenis   : "+jenis);
        System.out.println("umur    : "+umur);
        System.out.println("--------------------");
    }
}