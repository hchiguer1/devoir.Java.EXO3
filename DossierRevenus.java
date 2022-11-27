package devoir.Exo4;

public class DossierRevenus extends Dossier{
public DossierRevenus(long id,double ca) {
		super(id);
		this.ca=ca;
	}
private double ca;
public double getCa() {
	return ca;
}
public void setCa(double ca) {
	this.ca = ca;
}
@Override
	protected void calculerMontant() {
		// TODO Auto-generated method stub
		montant=ca*(1-0.15);
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		calculerMontant();
		return "15% de revenus "+ca+" : "+montant+"\n";
	}
}
