/**
 *
 */
package com.google.code.linkedinapi.client.constant;
import java.io.IOException;
import java.util.Properties;

/**
 * @author nmukhtar
 *
 */
public final class TestConstants {

    /** Field description */
    public static final String TEST_CONSTANTS_FILE =
        "com/google/code/linkedinapi/client/constant/TestConstants.properties";

    /** Field description */
    private static final Properties testConstants = new Properties();

    /** Field description */
    public static final String LINKED_IN_TEST_CONSUMER_SECRET =
        testConstants.getProperty("com.google.code.linkedinapi.client.apiConsumerSecret");

    /** Field description */
    public static final String LINKED_IN_TEST_CONSUMER_KEY =
        testConstants.getProperty("com.google.code.linkedinapi.client.apiConsumerKey");

    /** Field description */
    public static final String LINKED_IN_TEST_ACCESS_TOKEN_SECRET =
        testConstants.getProperty("com.google.code.linkedinapi.client.accessTokenSecret");

    /** Field description */
    public static final String LINKED_IN_TEST_ACCESS_TOKEN_KEY =
        testConstants.getProperty("com.google.code.linkedinapi.client.accessTokenKey");

    /** Field description */
    public static final String LINKED_IN_TEST_EMAIL =
        testConstants.getProperty("com.google.code.linkedinapi.client.testEmail");

    /** Field description */
    public static final String LINKED_IN_TEST_ID =
        testConstants.getProperty("com.google.code.linkedinapi.client.testId");

    /** Field description */
    public static final String LINKED_IN_TEST_URL =
        testConstants.getProperty("com.google.code.linkedinapi.client.testUrl");

    /** Field description */
    public static final String LINKED_IN_TEST_SEARCH_PARAMS =
        testConstants.getProperty("com.google.code.linkedinapi.client.testSearchParameters");

    /** Field description */
    public static final String LINKED_IN_TEST_NETWORK_UPDATE_TEXT =
        testConstants.getProperty("com.google.code.linkedinapi.client.testNetworkUpdateText");

    /** Field description */
    public static final String LINKED_IN_TEST_NETWORK_UPDATE_ID =
        testConstants.getProperty("com.google.code.linkedinapi.client.testNetworkUpdateId");

    /** Field description */
    public static final String LINKED_IN_TEST_NETWORK_UPDATE_COMMENT =
        testConstants.getProperty("com.google.code.linkedinapi.client.testNetworkUpdateComment");

    /** Field description */
    public static final String LINKED_IN_TEST_STATUS_TEXT =
        testConstants.getProperty("com.google.code.linkedinapi.client.testStatusText");

    /** Field description */
    public static final String LINKED_IN_TEST_MESSAGE_TEXT =
        testConstants.getProperty("com.google.code.linkedinapi.client.testMessageText");

    /** Field description */
    public static final String LINKED_IN_TEST_MESSAGE_SUBJECT =
        testConstants.getProperty("com.google.code.linkedinapi.client.testMessageSubject");

    /** Field description */
    public static final String LINKED_IN_TEST_MESSAGE_RECEPIENT_IDS =
        testConstants.getProperty("com.google.code.linkedinapi.client.testMessageRecepientIds");

    /** Field description */
    public static final String LINKED_IN_TEST_INVITE_TEXT =
        testConstants.getProperty("com.google.code.linkedinapi.client.testInviteText");

    /** Field description */
    public static final String LINKED_IN_TEST_INVITE_SUBJECT =
        testConstants.getProperty("com.google.code.linkedinapi.client.testInviteSubject");

    /** Field description */
    public static final String LINKED_IN_TEST_INVITE_RECEPIENT_IDS =
        testConstants.getProperty("com.google.code.linkedinapi.client.testInviteRecepientIds");

    static {
        try {
            testConstants.load(TestConstants.class.getClassLoader().getResourceAsStream(TEST_CONSTANTS_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Constructs ...
     *
     */
    private TestConstants() {}
}