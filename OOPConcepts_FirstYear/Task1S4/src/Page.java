
class Page {

	private int pageNumber;
	private int nbOfWords;
	private String footnote;

	public Page(int pageNumber, int nbOfWords, String footnote) {
		super();
		this.pageNumber = pageNumber;
		this.nbOfWords = nbOfWords;
		this.footnote = footnote;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getNbOfWords() {
		return nbOfWords;
	}

	public void setNbOfWords(int nbOfWords) {
		this.nbOfWords = nbOfWords;
	}

	public String getFootnote() {
		return footnote;
	}

	public void setFootNote(String footnote) {
		this.footnote = footnote;
	}

	@Override
	public String toString() {
		return "Paige [paigeNumber=" + pageNumber + ", nbOfWords=" + nbOfWords + ", footnote=" + footnote + "]";
	}

}
