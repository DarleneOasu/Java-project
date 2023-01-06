package entiteti;

import java.time.LocalDate;

public class Korisnik extends Osoba{
    private Integer id;
    private LocalDate datumRođenja;
    private String spol;
    private String najvisiStupanjObrazovanja;

    public LocalDate getDatumRođenja() {
        return datumRođenja;
    }

    public void setDatumRođenja(LocalDate datumRođenja) {
        this.datumRođenja = datumRođenja;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public String getNajvisiStupanjObrazovanja() {
        return najvisiStupanjObrazovanja;
    }

    public void setNajvisiStupanjObrazovanja(String najvisiStupanjObrazovanja) {
        this.najvisiStupanjObrazovanja = najvisiStupanjObrazovanja;
    }

    public Korisnik(String ime, String prezime, String nadimak, String lozinka) {
        super(ime, prezime, nadimak, lozinka);
    }

    public Korisnik(String ime, String prezime, String nadimak, String lozinka, Integer id, LocalDate datumRođenja, String spol, String najvisiStupanjObrazovanja) {
        super(ime, prezime, nadimak, lozinka);
        this.id = id;
        this.datumRođenja = datumRođenja;
        this.spol = spol;
        this.najvisiStupanjObrazovanja = najvisiStupanjObrazovanja;
    }
}
