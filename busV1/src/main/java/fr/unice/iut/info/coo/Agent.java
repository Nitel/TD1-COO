package fr.unice.iut.info.coo;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Agent extends Bus
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Message message;
	public char Nom;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Agent(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Message EffacerMessage(Message message) {
		// TODO implement me
		message = null;
		return null;
	}

    @Override
    public String toString() {
        return "Agent{"+
            "message="+message+
            ", Nom="+Nom+
            '}';
    }

    public Agent(final Message message) {
        this.message = message;
    }

    public static Builder builder() { return new Builder();}

    public static class Builder {
        private Message message;

        public Builder setMessage(final Message message) {
            this.message = message;
            return this;
        }

        public Agent build() {
            return new Agent(this.message);
        }
    }

    public Message getMessage() {

        return message;
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o) { return true; }
        if (!(o instanceof Agent)) { return false; }
        Agent agent = (Agent) o;
        if (Nom != agent.Nom) { return false; }
        return message != null ? message.equals(agent.message) : agent.message == null;
    }

    @Override
    public int hashCode() {
        int result = message != null ? message.hashCode() : 0;
        result = 31*result+(int) Nom;
        return result;
    }
}

