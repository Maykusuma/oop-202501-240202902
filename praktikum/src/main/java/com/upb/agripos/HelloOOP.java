package main.java.com.upb.agripos;
    // HelloOOP.java
class Produk {
   String nama;
   String NIM;
   Mahasiswa(String nama, String NIM){
      this.nama=nama;
      this.NIM=NIM;
   }
   

   void sapa(){System.out.println("Hello World, I am" + " " + nama + "-" + NIM);}
public class HelloOOP {
   public static void main(String[] args) {
       Mahasiswa m = new Mahasiswa ("Mayang", "240202902");
       m.sapa();
   }
}
}

