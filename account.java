import java.util.Scanner;
public class hesap {
     private String kullaniciAdi;
     private String parola;
     private double bakiye;

     public hesap(String kullaniciAdi, String parola, double bakiye){
          this.kullaniciAdi=kullaniciAdi;
          this.parola=parola;
          this.bakiye=bakiye;
     }
     public void paraYatir(double miktar){
          bakiye += miktar;
          System.out.println("Yeni bakiye " + bakiye);
     }
     public void paraCek(double miktar){
         if(bakiye-miktar<0){
              System.out.println("Yetersiz bakiye... Bakiyeniz: "+ bakiye );
         }else if(miktar>1500){
              System.out.println("Fazla cekim talebi...");
         } else {
              bakiye -= miktar;
              System.out.println("Yeni bakiye " + bakiye);
         }
     }

     public String getkullaniciAdi(){
          return kullaniciAdi;
     }
     public void setkullaniciAdi(){
          this.kullaniciAdi=kullaniciAdi;
     }

     public String getparola(){
          return parola;
     }
     public void setparola(){
          this.parola=parola;
     }
     public double getbakiye(){
          return bakiye;
     }
     public void setbakiye(){
          this.bakiye=bakiye;
     }
}

