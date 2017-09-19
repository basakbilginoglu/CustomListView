package lstview.com.tr.customlistview;



public class Kisi {


    private String  isim;

    public int getPosition() {
        return position;
    }

    private int position;
    private boolean kadinMi;
    public Kisi(String isim, boolean kadinMi) {
        super();
        this.isim = isim;
        this.kadinMi = kadinMi;
    }

    @Override
    public String toString() {
        return isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isKadinMi() {
        return kadinMi;
    }

    public void setKadinMi(boolean kadinMi) {
        this.kadinMi = kadinMi;
    }
}
