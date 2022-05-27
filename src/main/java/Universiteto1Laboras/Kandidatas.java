package Universiteto1Laboras;

public class Kandidatas {

    private String vardas;
    private String pavarde;
    private String pareigos;
    private int patirtisMetais;
    private int pageidaujamasAtlyginimas;

    public Kandidatas(String vardas, String pavarde, String pareigos, int patirtisMetais, int pageidaujamasAtlyginimas){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pareigos = pareigos;
        this.patirtisMetais = patirtisMetais;
        this.pageidaujamasAtlyginimas = pageidaujamasAtlyginimas;
    }

    public String getVardas(){
        return  vardas;
    }
    public String getPavarde(){
        return pavarde;
    }
    public String getPareigos(){
        return pareigos;
    }
    public int getPatirtisMetais(){
        return patirtisMetais;
    }
    public int getPageidaujamasAtlyginimas(){
        return pageidaujamasAtlyginimas;
    }
    public void setVardas(String vardas){
        this.vardas=vardas;
    }
    public void setPavarde(String pavarde){
        this.pavarde=pavarde;
    }
    public void setPareigos(String pareigos){
        this.pareigos = pareigos;
    }
    public void setPatirtisMetais(int patirtisMetais){
        this.patirtisMetais = patirtisMetais;
    }
    public void setPageidaujamasAtlyginimas(int pageidaujamasAtlyginimas){
        this.pageidaujamasAtlyginimas= pageidaujamasAtlyginimas;
    }

    @Override
    public String toString() {
        return
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", pareigos='" + pareigos + '\'' +
                ", patirtisMetais=" + patirtisMetais +
                ", pageidaujamasAtlyginimas=" + pageidaujamasAtlyginimas
                ;
    }
}
