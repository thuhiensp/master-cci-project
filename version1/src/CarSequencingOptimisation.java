import java.util.Vector;

// pour les changement de l'ordre de la chaine 
// plut�t une interface

public class CarSequencingOptimisation extends CarSequencing {
	
	private Vector<OrdreGeneration> ordreRecord; // pour tout les ordre qu'on a �ffectuer // il faut trouver autre type
	
	// constructor
	public CarSequencingOptimisation(Vector<Option> listOptions, Vector<Voiture> listVoitures, int colorMax,
			Vector<OrdreGeneration> ordreGenerations) {
		super(listOptions, listVoitures, colorMax);
		this.ordreRecord = ordreGenerations;
	}
	
	public void violationConcernantVoiture () {
		
	}
	
	public void chercherLeMeilleur (/* liste of voiture */) {		
		// calculer le co�t quand on d�place la voiture � la fin vers l'ent�te de la liste (et pousser toute les voitures) et voir si �a va �tre meilleur avant de faire le movement
			
			// si c n'est pas la m�me classe, calculer le cas suivant
				// si c'est meilleur
				// il faut sauvegarder l'ordre qui co�te le moins cher et la valeur dans un tableau ???
				// faire le changement
			// sinon d�placer la voiture suivant
		// sinon calculer le cas la voiture suivant
	}
	
	public void changement (/* deux position dans le tableau qu'on a trouv� par la m�thode chercherLeMeilleur */) {
		// d�placer selon le changement donn� 
	}
	
	
	
}
