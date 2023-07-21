import java.util.Scanner;

public class Sifre {

    public static void main(String[] args) {

        String password;
        int input;

        Scanner sifre = new Scanner(System.in);

        System.out.print("Lütfen Şifrenizi Giriniz: ");
        password = sifre.nextLine();

        System.out.print("Şifrenizi Sıfırlamak İster Misiniz?(Evet=1, Hayır=2): ");
        input = sifre.nextInt();

        switch (input)
        {
            case 1:
                sifre.nextLine();
                System.out.print("Lütfen Yeni Şifrenizi Giriniz: ");
                String _password = sifre.nextLine();

                if (!password.equals(_password))
                {
                    password = _password;
                    System.out.print("Şifre Başarıyla Oluşturuldu! Yeni Şifreniz: " + password);
                } else {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                }
                break;
            case 2:
                System.out.print("İyi Günler!");
                break;
        }

    }
}
