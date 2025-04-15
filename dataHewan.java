public class dataHewan {
    hewan[] hewans=new hewan[100];
    int idx=0;
    
    public void TambahData(hewan hwn){
        if(idx<hewans.length){
            hewans[idx++]=hwn;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    public void tampilkanData(){
        for(int i=0; i<=idx-1; i++){
            if(idx==0){
                System.out.println("Data hewan belum dimasukkan");
            }else{
                    hewans[i].tampil();
            }
        }
    }
}
