package ontologizer.go;

import java.io.Serializable;

/**
 * This class is used to specify a parent accompanied with
 * the kind of relationship.
 *
 * @author sba
 */
public class ParentTermID implements Serializable
{

    	private static final long serialVersionUID = 2476703600560059329L;
    	
	public TermID termid;
	public TermRelation relation;

	public ParentTermID(TermID parent, TermRelation relation)
	{
		this.termid = parent;
		this.relation = relation;
	}
}
