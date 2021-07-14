import java.util.Scanner;
public class login {
    public static boolean giris(hesap hesap){

    String kullaniciAdi;
    String parola;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adı girin: ");
        String kullanici = scanner.nextLine();
        System.out.println("Parola girin: ");
        String password = scanner.nextLine();

        if (hesap.getparola().equals(password) && hesap.getkullaniciAdi().equals(kullanici)) {
            System.out.println("Giris Basarılı " + kullanici);
            return true;
        } else {
            return false;
        }
    }
  }


