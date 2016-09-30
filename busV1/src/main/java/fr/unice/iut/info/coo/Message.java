package fr.unice.iut.info.coo;


import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Message {
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String corpsMessage;
	private String message;
	private Date dateMessage;

	//CONSTRUCTEUR
	public Message(String corpsMessage)
	{
		System.out.println("Création du constructeur de la classe Message");
		this.corpsMessage = corpsMessage;
		this.message = message;
		this.dateMessage = dateMessage;

	}

	//GENERATION DES ACESSEUR DE CONSULTATION GETTER SETTER

	public String getCorpsMessage() {

		return corpsMessage;
	}

	public void setCorpsMessage(String corpsMessage) {

		this.corpsMessage = corpsMessage;
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}

	public Date getDateMessage() {
		return dateMessage;
	}

	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
//methode toString
	public String toString(){
		return "Contenu du message : " + corpsMessage + "\n Message crée le : "  + dateMessage;
	}






}

