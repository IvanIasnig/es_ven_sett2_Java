package App;

public class Libri extends Catalogo{
	private String autore;
	private String genere;
	
	public Libri(Integer isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
    @Override
    public String toString() {
        return  "Titolo=" + getTitolo()  +
        		", ISBN=" + getIsbn() +
                ", anno pubblicazione=" + getAnnoPubblicazione() +
                ", numero pagine=" + getNumeroPagine() +
                ", autore:" + autore +  
                ", genere:" + genere ;
    }

}
