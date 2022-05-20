public class Main{

    public static void main(String[] args) {


        Mektup mektup = new Mektup();
        new Thread(new OkuyucuThreadClass(mektup)).start();
        new Thread(new YaziciThreadClass(mektup)).start();

        /* mektup nesnemiz var. içinde string bi değer var ekrana basmak için.
        bu nesnemizin oku ve yaz diye iki ayrı fonksiyonumuz var.
        iki farklı thread den bu fonksiyonlara ulaşıp işlem yapmak istiyoruz.
        fakat fonksiyonlara ulaşıp işlem yaparken datalar bazen eşitlenmiyor, bu yüzden synchronized kullanıyoruz.
        eğer bir fonksiyonumuzu kullanırken diğerinin işleminin bitmesine ihtiyacımız varsa synchronized kullandığımızdan
        dolayı oluşan lock u kaldırıyoruz ve diğer threadin erişmek istediği diğer fonksiyonu kullanmasına izin veriyoruz.
        bu lock u wait() ile kaldırırız, yani threadi beklemeye alırız.diğer thread notifyAll() diyerek onu uyandırır.
         */


    }

}