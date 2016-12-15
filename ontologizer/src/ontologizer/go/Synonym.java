package ontologizer.go;

/**
 * First pass at better synonym handling. To be improved later.
 * 
 * @author sebastiankohler
 *
 */
public class Synonym {

	private String synonym;
	private boolean is_exact,is_related,is_broad,is_narrow,is_layperson;
	
	/**
	 * @param synonym
	 * @param extraInfo e.g. EXACT layperson [orcid.org/0000-0001-5889-4463]
	 */
	public Synonym(String synonym, String extraInfo) {
		this.synonym = synonym;
		if (extraInfo.contains("EXACT"))
			is_exact = true;
		else if (extraInfo.contains("BROAD"))
			is_broad = true;
		else if (extraInfo.contains("RELATED"))
			is_related = true;
		else if (extraInfo.contains("NARROW"))
			is_narrow = true;
		
		if (extraInfo.contains("layperson"))
			is_layperson = true;
	}

	public String getSynonymLabel() {
		return synonym;
	}

	public boolean is_exact() {
		return is_exact;
	}

	public boolean is_related() {
		return is_related;
	}

	public boolean is_broad() {
		return is_broad;
	}

	public boolean is_narrow() {
		return is_narrow;
	}

	public boolean is_layperson() {
		return is_layperson;
	}
	
	

}
