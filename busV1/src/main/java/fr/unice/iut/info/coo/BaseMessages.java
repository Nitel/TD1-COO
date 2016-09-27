package fr.unice.iut.info.coo;

import java.util.ArrayList;

/**
 * Class fr.unice.iut.info.coo.BaseMessages
 * @author vnahi
 * @project busV1
 */
public class BaseMessages {
    private ArrayList<Message> Base;

    public void addMessage(Message message){
        Base.add(message);
    }

    @Override
    public String toString() {
        return "BaseMessages{"+
            "Base="+Base+
            '}';
    }

    public BaseMessages(final ArrayList<Message> base) {
        Base = base;
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o) { return true; }
        if (!(o instanceof BaseMessages)) { return false; }
        BaseMessages that = (BaseMessages) o;
        return Base != null ? Base.equals(that.Base) : that.Base == null;
    }

    @Override
    public int hashCode() {
        return Base != null ? Base.hashCode() : 0;
    }
}
