package fr.unice.iut.info.coo;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Message
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

    public char Titre;
	public char Contenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
     * @param titre
     * @param text
	 */
	public Message(final char titre, final char text){
		super();
	}

    public Message(final char contenu) {
        Contenu = contenu;
    }

    public static Builder builder() { return new Builder();}

    public static class Builder {
        private char Contenu;

        public Builder setContenu(final char Contenu) {
            this.Contenu = Contenu;
            return this;
        }

        public Message build() {
            return new Message(this.Contenu);
        }
    }

    public char getContenu() {

        return Contenu;
    }

    @Override
    public String toString() {
        return "Message{"+
            "Contenu="+Contenu+
            ", Tire="+Titre+
            '}';
    }

    public char getTire() {

        return Titre;
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o) { return true; }
        if (!(o instanceof Message)) { return false; }
        Message message = (Message) o;
        return Titre == message.Titre;
    }

    @Override
    public int hashCode() {
        return (int) Titre;
    }
}

