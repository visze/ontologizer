package ontologizer.util;

public class OntologyConstants {

	public static enum Subontology {
		ORGANABNORMALITY, INHERITANCE, MODIFIER, MORTALITY_AGING
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

	

}
