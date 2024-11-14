import java.awt.*;

class Datadiri {
    String nama;
    String hobi;
    int umur;
}
    Datadiri (String nama, String hobi, int umur){

        void menyapa(){
            System.out.println("Halo saya" + nama);

        }
    }
    public static void(String[]args){
        Datadiri dataSaya = new Datadiri("arga", "nonton", 27);

        dataSaya.menyapa();
        System.out.println(dataSaya.hobi);
    }

    }


