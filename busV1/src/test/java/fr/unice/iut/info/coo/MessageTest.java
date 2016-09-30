package fr.unice.iut.info.coo;

import junit.framework.TestCase;

import java.util.Date;

/**
 * Created by valentinlaj on 28/09/2016.
 */
public class MessageTest extends TestCase {

    private Message mToTest;
    private String contenu;
    private Date dateMessage;

    public void setUp() throws Exception {
        super.setUp();
        mToTest = new Message(contenu);
        contenu = "contenu de mon message";
        dateMessage = new Date(28,9,2016);



    }

    public void tearDown() throws Exception {

    }

    public void testGetCorpsMessage() throws Exception {
        String message = "Nouveau message";
        mToTest.setCorpsMessage("Nouveau Message");

    }

    public void testGetMessage() throws Exception {
        String message = "Nouveau message";
        mToTest.setMessage("Nouveau Message");

    }

    public void testGetDateMessage() throws Exception {
        Date d0 = new Date(28,9,2016);
        mToTest.setDateMessage(d0);


    }

}