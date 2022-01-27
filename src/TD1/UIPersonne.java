package TD1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UIPersonne extends JPanel{
	Personne Personne;
	JTextField nomTF,
	prenomTF,
	telMaisonTF,
	telPortTF,
	telBurTF,
	faxTF,
	titreTF,
	socTF,
	addTF,
	mailTF;
	public UIPersonne() {
	super();
	init();
	}
	public UIPersonne(Personne p) {
	super();
	Personne = p;
	init();
	}
	public Personne getPersonne() {
	return Personne;
	}
	public void setPersonne(Personne Personne) {
	this.Personne = Personne;
	prenomTF.setText(Personne.getPrenom());
	nomTF.setText(Personne.getNom());
	telBurTF.setText(Personne.getTelephoneBureau());
	telMaisonTF.setText(Personne.getTelephoneMaison());
	telPortTF.setText(Personne.getTelephonePortable());
	faxTF.setText(Personne.getFax());
	titreTF.setText(Personne.getTitre());
	socTF.setText(Personne.getSociete());
	//Adresse
	mailTF.setText(Personne.getMail());
	}
	public void init() {
	this.setLayout(new GridLayout(0, 2));
	add(new JLabel("nom"));
	nomTF = new JTextField("");
	add(nomTF);
	add(new JLabel("prenom"));
	prenomTF = new JTextField("");
	add(prenomTF);
	add(new JLabel("telephone maison"));
	telMaisonTF = new JTextField("");
	add(telMaisonTF);
	add(new JLabel("telephone portable"));
	telPortTF = new JTextField("");
	add(telPortTF);
	add(new JLabel("telephone bureau"));
	telBurTF = new JTextField("");
	add(telBurTF);
	add(new JLabel("fax"));
	faxTF = new JTextField("");
	add(faxTF);
	add(new JLabel("titre"));
	titreTF = new JTextField("");
	add(titreTF);
	add(new JLabel("soci»t»"));
	socTF = new JTextField("");
	add(socTF);
	add(new JLabel("adresse"));
	addTF = new JTextField("");
	add(addTF);
	add(new JLabel("mail"));
	mailTF = new JTextField("");
	add(mailTF);
	JButton save = new JButton("Save");
	save.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	Personne.setPrenom(prenomTF.getText());
	Personne.setNom(nomTF.getText());
	Personne.setTelephoneBureau(telBurTF.getText());
	Personne.setTelephoneMaison(telMaisonTF.getText());
	Personne.setTelephonePortable(telPortTF.getText());
	Personne.setFax(faxTF.getText());
	Personne.setTitre(titreTF.getText());
	Personne.setSociete(socTF.getText());
	//Personne.setAdresse(addTF.getText());
	Personne.setMail(mailTF.getText());
	}
	});
	add(save);
	JButton cancel = new JButton("Cancel");
	cancel.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	prenomTF.setText(Personne.getPrenom());
	nomTF.setText(Personne.getNom());
	telBurTF.setText(Personne.getTelephoneBureau());
	telMaisonTF.setText(Personne.getTelephoneMaison());
	telPortTF.setText(Personne.getTelephonePortable());
	faxTF.setText(Personne.getFax());
	titreTF.setText(Personne.getTitre());
	socTF.setText(Personne.getSociete());
	//Adresse
	mailTF.setText(Personne.getMail());
	}
	});
	add(cancel);
	}
}
