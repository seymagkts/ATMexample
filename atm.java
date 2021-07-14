import java.util.Scanner;
public class atm {
    public void calis(hesap hesap) {
        login giris = new login();
        int girisHakki = 3;
        while (true) {
            if (login.giris(hesap)) {
                System.out.println("Giris basarılı...");
                break;
            } else {
                System.out.println("Hatalı giris...");
                girisHakki--;
                System.out.println("Kalan hak: " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Giris Hakkınız Dolmustur...");
                return;
            }
        }
      
        String İslemler = "1. Bakiye Ogrenme \n"
                + "2. Para Cekme \n"
                + "3. Para Yatırma\n"
                + "Cıkıs için q'ya basın\n";
        System.out.println(İslemler);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("İşlem seçin:");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.print("Programdan cıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + hesap.getbakiye());
            } else if (islem.equals("2")) {
                System.out.println("Cekmek istenilen tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);

            } else if (islem.equals("3")) {
                System.out.println("Yatırılmak istenilen tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            } else {
                System.out.println("Gecersiz islem...");
            }
        }
    }
}
