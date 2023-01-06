package entiteti;

public class Osoba {
    private String ime;
    private String prezime;
    private String nadimak;
    private String lozinka;

    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getNadimak() {
        return nadimak;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public Osoba(String ime, String prezime, String nadimak, String lozinka) {
        this.ime = ime;
        this.prezime = prezime;
        this.nadimak = nadimak;
        this.lozinka = lozinka;
    }
}
