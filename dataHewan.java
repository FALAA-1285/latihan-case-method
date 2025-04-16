public class dataHewan {
    hewan[] hewans=new hewan[100];
    int idx=0;
    
    public int TambahData(hewan hwn){
        if(idx<hewans.length){
            hewans[idx++]=hwn;
        }else{
            System.out.println("Data sudah penuh");
        }
        return idx;
    }
    public void tampilkanData(){
        if(idx==0){
            System.out.println("Data hewan belum dimasukkan");
        }else{
            for(int i=0; i<=idx-1; i++){
            hewans[i].tampil();
            }
        }
    }
    public void Sorting(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (hewans[j-1].nama.compareToIgnoreCase(hewans[j].nama)>0) {
                    hewan temp = hewans[j - 1];
                    hewans[j - 1] = hewans[j];
                    hewans[j] = temp;
                }
            }
        }
    }
    public void searchingData(String key, int left, int right){
        if (left <= right) {
            int mid = (left + right) / 2;
            if (hewans[mid].nama.equalsIgnoreCase(key)) {
                hewans[mid].tampil();
                int i = mid - 1;
                while (i >= 0 && hewans[i].nama.equalsIgnoreCase(key)) {
                    hewans[i].tampil();
                    i--;
                }
                int j = mid + 1;
                while (j < idx && hewans[j].nama.equalsIgnoreCase(key)) {
                    hewans[j].tampil();
                    j++;
                }
                return;
            } else if (hewans[mid].nama.compareToIgnoreCase(key) > 0) {
                searchingData(key, left, mid - 1);
                return;
            } else {
                searchingData(key, mid + 1, right);
                return;
            }
        }
        System.out.println("Data tidak ditemukan");
    }
    
}
