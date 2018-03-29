package sairi;
public class tikar {
       double lebar;
      double panjang;

    public tikar() {
        panjang=50;
        lebar=210;
    }

    public tikar(double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
      
      
      
      void cetakInfo(){
          System.out.println("Panjang       :"+lebar);
          System.out.println("Panjang       :"+panjang); 
    }
     
    double hitungluas (){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
          double hitungLuas (){
          double luas;
          luas=panjang*lebar;
          return luas;
          }
}
