import com.sun.corba.se.impl.orb.ParserTable;

public class Ogrenci implements Comparable<Ogrenci>{

    private int ogrNo,ogrNot;

    public Ogrenci(int ogrNo, int ogrNot) {
        this.ogrNo = ogrNo;
        this.ogrNot = ogrNot;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getOgrNot() {
        return ogrNot;
    }

    public void setOgrNot(int ogrNot) {
        this.ogrNot = ogrNot;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if(this.ogrNo == o.ogrNo) {
            return 0;
        }else if(this.ogrNo > o.ogrNo){
            return 1;
        }else if(this.ogrNo < o.ogrNo){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrNo=" + ogrNo +
                ", ogrNot=" + ogrNot +
                '}';
    }
}
