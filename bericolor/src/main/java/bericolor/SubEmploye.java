package bericolor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

@Entity
@PrimaryKeyJoinColumn(name="ID")  
public class SubEmploye extends Employee {
private int val;

public SubEmploye() {
	super();
}

public int getVal() {
	return val;
}

public void setVal(int val) {
	this.val = val;
}
}
