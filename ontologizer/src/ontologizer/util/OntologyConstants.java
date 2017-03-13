package ontologizer.util;


public class OntologyConstants {

	public static enum Subontology {
		ORGANABNORMALITY, INHERITANCE, MODIFIER, MORTALITY_AGING, FREQUENCY
	}
	
	public static enum EvidenceCode {
		IEA, ITM, ICE, PCS, TAS
	}
	
	public static final String biologicalProcessDomain = "Process";
	public static final String molecularFunctionDomain = "Function";
	public static final String cellularComponentDomain = "Component";
	
	public static final String frequency_Excluded = "HP:0040285";
	public static final String frequency_Very_rare = "HP:0040284";
	public static final String frequency_Occasional = "HP:0040283";
	public static final String frequency_Frequent = "HP:0040282";
	public static final String frequency_Very_frequent = "HP:0040281";
	public static final String frequency_Obligate = "HP:0040280";
	
	public static final String inheritanceRootId = "HP:0000005";
	public static final String modifierRootId = "HP:0012823";
	public static final String organAbnormalityRootId = "HP:0000118";
	public static final String mortalityRootId = "HP:0040006";
	public static final String frequencyRootId = "HP:0040279";
	
	
	/**
	 * @param frequencyOboId
	 * @return if null or empty string are provided, will return 1
	 */
	public static double frequencyOboId2double(String frequencyOboId){
		
		if (frequencyOboId==null || frequencyOboId.equals("")){
			return 1;
		}
		if (frequencyOboId.equals(frequency_Excluded)){
			return 0;
		}
		if (frequencyOboId.equals(frequency_Very_rare)){
			return 0.025;
		}
		if (frequencyOboId.equals(frequency_Occasional)){
			return 0.12;
		}
		if (frequencyOboId.equals(frequency_Frequent)){
			return 0.5;
		}
		if (frequencyOboId.equals(frequency_Very_frequent)){
			return 0.9;
		}
		if (frequencyOboId.equals(frequency_Obligate)){
			return 1;
		}
		
		return -1;
	}
	

}
