public class main {

    public static void main(String[] args) {

        Kare kare1 = new Kare(4);
        Kare kare2 = new Kare(7);

        Dikdortgen dd1 = new Dikdortgen(5,9);
        Dikdortgen dd2 = new Dikdortgen(19,3);

        //Kare büyükKare = alanKarsilastir(kare1,kare2);
        //Dikdortgen büyükDikdortgen = alanKarsilastir(dd1,dd2);

        Kare büyükKare = GalanKarsilastir(kare1,kare2);
        Dikdortgen büyükDikdortgen = GalanKarsilastir(dd1,dd2);

        System.out.println("Büyük olan karenin alani  : " + büyükKare.alanBul());
        System.out.println("Büyük olan dikdortgenin alani : " + büyükDikdortgen.alanBul());
    }

    public static <T extends Sekil> T GalanKarsilastir(T obj1,T obj2){
        if(obj1.alanBul() > obj2.alanBul()){
            return obj1;
        }
        else if(obj2.alanBul() > obj1.alanBul()){
            return obj2;
        }
        else
            return obj1;
    }
    public static Kare alanKarsilastir(Kare k1,Kare k2){
        if(k1.alanBul() > k2.alanBul()){
            return k1;
        }
        else if(k2.alanBul() > k1.alanBul()){
            return k2;
        }
        else
            return k1;
    }

    public static Dikdortgen alanKarsilastir(Dikdortgen d1,Dikdortgen d2){
        if(d1.alanBul() > d2.alanBul()){
            return d1;
        }
        else if(d2.alanBul() > d1.alanBul()){
            return d2;
        }
        else
            return d1;
    }
}
