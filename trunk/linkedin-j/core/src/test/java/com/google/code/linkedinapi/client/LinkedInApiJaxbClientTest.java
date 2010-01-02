/**
 * 
 */
package com.google.code.linkedinapi.client;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.code.linkedinapi.client.constant.TestConstants;
import com.google.code.linkedinapi.client.enumeration.NetworkUpdateType;
import com.google.code.linkedinapi.client.enumeration.ProfileField;
import com.google.code.linkedinapi.client.enumeration.ProfileType;
import com.google.code.linkedinapi.client.enumeration.SearchParameter;
import com.google.code.linkedinapi.client.enumeration.SearchSortOrder;
import com.google.code.linkedinapi.schema.Connections;
import com.google.code.linkedinapi.schema.Network;
import com.google.code.linkedinapi.schema.People;
import com.google.code.linkedinapi.schema.Person;
import com.google.code.linkedinapi.schema.UpdateComments;

/**
 * @author Nabeel Mukhtar
 *
 */
public class LinkedInApiJaxbClientTest extends LinkedInApiClientTest {
	private LinkedInApiClient client;
	
	/** 
	 * @see com.google.code.linkedinapi.client.LinkedInApiClientTest#setUp()
	 */
	public void setUp() throws Exception {
		super.setUp();
		client = factory.createLinkedInApiJaxbClient(accessToken);
	}

	/**
	 * @see com.google.code.linkedinapi.client.LinkedInApiClientTest#tearDown()
	 */
	public void tearDown() throws Exception {
		super.tearDown();
		client = null;
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getConnectionsByEmail(java.lang.String)}.
	 */
	@Test
	public void testGetConnectionsByEmailString() {
		final String email = TestConstants.LINKED_IN_TEST_EMAIL;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Email"), email);
//		Connections connections = client.getConnectionsByEmail(email);
//		assertNotNull("Connections should never be null.", connections);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getConnectionsByEmail(java.lang.String, java.util.Set)}.
	 */
	@Test
	public void testGetConnectionsByEmailStringSetOfProfileField() {
		final String email = TestConstants.LINKED_IN_TEST_EMAIL;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Email"), email);
//		Connections connections = client.getConnectionsByEmail(email, EnumSet.of(ProfileField.FIRST_NAME, ProfileField.LAST_NAME, ProfileField.HEADLINE));
//		assertNotNull("Connections should never be null.", connections);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getConnectionsById(java.lang.String)}.
	 */
	@Test
	public void testGetConnectionsByIdString() {
		final String id = TestConstants.LINKED_IN_TEST_ID;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "ID"), id);
		Connections connections = client.getConnectionsById(id);
		assertNotNull("Connections should never be null.", connections);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getConnectionsById(java.lang.String, java.util.Set)}.
	 */
	@Test
	public void testGetConnectionsByIdStringSetOfProfileField() {
		final String id = TestConstants.LINKED_IN_TEST_ID;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "ID"), id);
		Connections connections = client.getConnectionsById(id, EnumSet.of(ProfileField.FIRST_NAME, ProfileField.LAST_NAME, ProfileField.HEADLINE));
		assertNotNull("Connections should never be null.", connections);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getConnectionsByUrl(java.lang.String)}.
	 */
	@Test
	public void testGetConnectionsByUrlString() {
		final String url = TestConstants.LINKED_IN_TEST_URL;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "URL"), url);
		Connections connections = client.getConnectionsByUrl(url);
		assertNotNull("Connections should never be null.", connections);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getConnectionsByUrl(java.lang.String, java.util.Set)}.
	 */
	@Test
	public void testGetConnectionsByUrlStringSetOfProfileField() {
		final String url = TestConstants.LINKED_IN_TEST_URL;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "URL"), url);
		Connections connections = client.getConnectionsByUrl(url, EnumSet.of(ProfileField.FIRST_NAME, ProfileField.LAST_NAME, ProfileField.HEADLINE));
		assertNotNull("Connections should never be null.", connections);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getConnectionsForCurrentUser()}.
	 */
	@Test
	public void testGetConnectionsForCurrentUser() {
		Connections connections = client.getConnectionsForCurrentUser();
		assertNotNull("Connections should never be null.", connections);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getConnectionsForCurrentUser(java.util.Set)}.
	 */
	@Test
	public void testGetConnectionsForCurrentUserSetOfProfileField() {
		Connections connections = client.getConnectionsForCurrentUser(EnumSet.of(ProfileField.FIRST_NAME, ProfileField.LAST_NAME, ProfileField.HEADLINE));
		assertNotNull("Connections should never be null.", connections);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getNetworkUpdates()}.
	 */
	@Test
	public void testGetNetworkUpdates() {
		Network network = client.getNetworkUpdates();
		assertNotNull("Network Updates should never be null.", network);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getNetworkUpdates(int, int)}.
	 */
	@Test
	public void testGetNetworkUpdatesIntInt() {
		Network network = client.getNetworkUpdates(1, 5);
		assertNotNull("Network Updates should never be null.", network);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getNetworkUpdates(java.util.Date, java.util.Date)}.
	 */
	@Test
	public void testGetNetworkUpdatesDateDate() {
		Network network = client.getNetworkUpdates(getLastWeekDate(), getCurrentDate());
		assertNotNull("Network Updates should never be null.", network);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getNetworkUpdates(java.util.Set)}.
	 */
	@Test
	public void testGetNetworkUpdatesSetOfNetworkUpdateType() {
		Network network = client.getNetworkUpdates(EnumSet.of(NetworkUpdateType.STATUS_UPDATE, NetworkUpdateType.CONNECTION_UPDATE));
		assertNotNull("Network Updates should never be null.", network);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getNetworkUpdates(java.util.Set, int, int)}.
	 */
	@Test
	public void testGetNetworkUpdatesIntIntSetOfNetworkUpdateType() {
		Network network = client.getNetworkUpdates(EnumSet.of(NetworkUpdateType.STATUS_UPDATE, NetworkUpdateType.CONNECTION_UPDATE), 1, 5);
		assertNotNull("Network Updates should never be null.", network);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getNetworkUpdates(java.util.Set, java.util.Date, java.util.Date)}.
	 */
	@Test
	public void testGetNetworkUpdatesDateDateSetOfNetworkUpdateType() {
		Network network = client.getNetworkUpdates(EnumSet.of(NetworkUpdateType.STATUS_UPDATE, NetworkUpdateType.CONNECTION_UPDATE), getLastWeekDate(), getCurrentDate());
		assertNotNull("Network Updates should never be null.", network);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getNetworkUpdates(java.util.Set, int, int, java.util.Date, java.util.Date)}.
	 */
	@Test
	public void testGetNetworkUpdatesIntIntDateDateSetOfNetworkUpdateType() {
		Network network = client.getNetworkUpdates(EnumSet.of(NetworkUpdateType.STATUS_UPDATE, NetworkUpdateType.CONNECTION_UPDATE), 1, 5, getLastWeekDate(), getCurrentDate());
		assertNotNull("Network Updates should never be null.", network);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getNetworkUpdateComments(java.lang.String)}.
	 */
	@Test
	public void testGetNetworkUpdateCommentsString() {
		final String networkUpdateId = TestConstants.LINKED_IN_TEST_NETWORK_UPDATE_ID;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Network Update ID"), networkUpdateId);
		UpdateComments updateComments = client.getNetworkUpdateComments(networkUpdateId);
		assertNotNull("Network Update Comments should never be null.", updateComments);
	}
	
	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getProfileById(java.lang.String, com.google.code.linkedinapi.client.enumeration.ProfileType)}.
	 */
	@Test
	public void testGetProfileByIdStringProfileType() {
		final String id = TestConstants.LINKED_IN_TEST_ID;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "ID"), id);
		Person profile = client.getProfileById(id, ProfileType.STANDARD);
		assertNotNull("Profile should never be null.", profile);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getProfileById(java.lang.String, com.google.code.linkedinapi.client.enumeration.ProfileType, java.util.Set)}.
	 */
	@Test
	public void testGetProfileByIdStringProfileTypeSetOfProfileField() {
		final String id = TestConstants.LINKED_IN_TEST_ID;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "ID"), id);
		Person profile = client.getProfileById(id, ProfileType.STANDARD, EnumSet.of(ProfileField.FIRST_NAME, ProfileField.LAST_NAME, ProfileField.HEADLINE));
		assertNotNull("Profile should never be null.", profile);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getProfileByUrl(java.lang.String, com.google.code.linkedinapi.client.enumeration.ProfileType)}.
	 */
	@Test
	public void testGetProfileByUrlStringProfileType() {
		final String url = TestConstants.LINKED_IN_TEST_URL;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "URL"), url);
		Person profile = client.getProfileByUrl(url, ProfileType.STANDARD);
		assertNotNull("Profile should never be null.", profile);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getProfileByUrl(java.lang.String, com.google.code.linkedinapi.client.enumeration.ProfileType, java.util.Set)}.
	 */
	@Test
	public void testGetProfileByUrlStringProfileTypeSetOfProfileField() {
		final String url = TestConstants.LINKED_IN_TEST_URL;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "URL"), url);
		Person profile = client.getProfileByUrl(url, ProfileType.STANDARD, EnumSet.of(ProfileField.FIRST_NAME, ProfileField.LAST_NAME, ProfileField.HEADLINE));
		assertNotNull("Profile should never be null.", profile);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getProfileForCurrentUser()}.
	 */
	@Test
	public void testGetProfileForCurrentUser() {
		Person profile = client.getProfileForCurrentUser();
		assertNotNull("Profile should never be null.", profile);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#getProfileForCurrentUser(java.util.Set)}.
	 */
	@Test
	public void testGetProfileForCurrentUserSetOfProfileField() {
		Person profile = client.getProfileForCurrentUser(EnumSet.of(ProfileField.FIRST_NAME, ProfileField.LAST_NAME, ProfileField.HEADLINE));
		assertNotNull("Profile should never be null.", profile);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#postComment(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testPostComment() {
		final String networkUpdateId = TestConstants.LINKED_IN_TEST_NETWORK_UPDATE_ID;
		final String commentText = TestConstants.LINKED_IN_TEST_NETWORK_UPDATE_COMMENT;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Network Update ID"), networkUpdateId);
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Comment Text"), commentText);
		client.postComment(networkUpdateId, commentText);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#postNetworkUpdate(java.lang.String)}.
	 */
	@Test
	public void testPostNetworkUpdate() {
		final String networkUpdateText = TestConstants.LINKED_IN_TEST_NETWORK_UPDATE_TEXT;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Network Update Text"), networkUpdateText);
		client.postNetworkUpdate(networkUpdateText);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#searchPeople()}.
	 */
	@Test
	public void testSearchPeople() {
		People people = client.searchPeople();
		assertNotNull("People should never be null.", people);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#searchPeople(java.util.Map)}.
	 */
	@Test
	public void testSearchPeopleMapOfSearchParameterString() {
		final String searchParameters = TestConstants.LINKED_IN_TEST_SEARCH_PARAMS;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Search Parameters"), searchParameters);
		People people = client.searchPeople(getSearchParametersMap(searchParameters));
		assertNotNull("People should never be null.", people);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#searchPeople(int, int)}.
	 */
	@Test
	public void testSearchPeopleIntInt() {
		People people = client.searchPeople(1, 5);
		assertNotNull("People should never be null.", people);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#searchPeople(java.util.Map, int, int)}.
	 */
	@Test
	public void testSearchPeopleMapOfSearchParameterStringIntInt() {
		final String searchParameters = TestConstants.LINKED_IN_TEST_SEARCH_PARAMS;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Search Parameters"), searchParameters);
		People people = client.searchPeople(getSearchParametersMap(searchParameters), 1, 5);
		assertNotNull("People should never be null.", people);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#searchPeople(com.google.code.linkedinapi.client.enumeration.SearchSortOrder)}.
	 */
	@Test
	public void testSearchPeopleSearchSortOrder() {
		People people = client.searchPeople(SearchSortOrder.NUMBER_OF_CONNECTIONS);
		assertNotNull("People should never be null.", people);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#searchPeople(java.util.Map, com.google.code.linkedinapi.client.enumeration.SearchSortOrder)}.
	 */
	@Test
	public void testSearchPeopleMapOfSearchParameterStringSearchSortOrder() {
		final String searchParameters = TestConstants.LINKED_IN_TEST_SEARCH_PARAMS;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Search Parameters"), searchParameters);
		People people = client.searchPeople(getSearchParametersMap(searchParameters), SearchSortOrder.NUMBER_OF_CONNECTIONS);
		assertNotNull("People should never be null.", people);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#searchPeople(int, int, com.google.code.linkedinapi.client.enumeration.SearchSortOrder)}.
	 */
	@Test
	public void testSearchPeopleIntIntSearchSortOrder() {
		People people = client.searchPeople(1, 5, SearchSortOrder.NUMBER_OF_CONNECTIONS);
		assertNotNull("People should never be null.", people);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#searchPeople(java.util.Map, int, int, com.google.code.linkedinapi.client.enumeration.SearchSortOrder)}.
	 */
	@Test
	public void testSearchPeopleMapOfSearchParameterStringIntIntSearchSortOrder() {
		final String searchParameters = TestConstants.LINKED_IN_TEST_SEARCH_PARAMS;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Search Parameters"), searchParameters);
		People people = client.searchPeople(getSearchParametersMap(searchParameters), 1, 5, SearchSortOrder.NUMBER_OF_CONNECTIONS);
		assertNotNull("People should never be null.", people);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#sendInvite(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSendInviteStringStringString() {
		final String inviteText = TestConstants.LINKED_IN_TEST_INVITE_TEXT;
		final String inviteSubject = TestConstants.LINKED_IN_TEST_INVITE_SUBJECT;
		final String inviteRecepient = TestConstants.LINKED_IN_TEST_INVITE_RECEPIENT_IDS;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Invite Text"), inviteText);
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Invite Subject"), inviteSubject);
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Invite Recepient"), inviteRecepient);
		client.sendInvite(inviteRecepient, inviteSubject, inviteText);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#sendInvite(java.lang.String, java.lang.String, java.lang.String, com.google.code.linkedinapi.schema.Authorization)}.
	 */
	@Test
	public void testSendInviteStringStringStringAuthorization() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#sendMessage(java.util.List, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSendMessage() {
		final String messageText = TestConstants.LINKED_IN_TEST_MESSAGE_TEXT;
		final String messageSubject = TestConstants.LINKED_IN_TEST_MESSAGE_SUBJECT;
		final String messageRecepients = TestConstants.LINKED_IN_TEST_MESSAGE_RECEPIENT_IDS;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Message Text"), messageText);
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Message Subject"), messageSubject);
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Message Recepient"), messageRecepients);
		client.sendMessage(getRecepientIdsList(messageRecepients), messageSubject, messageText);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#updateCurrentStatus(java.lang.String)}.
	 */
	@Test
	public void testUpdateCurrentStatus() {
		final String statusText = TestConstants.LINKED_IN_TEST_STATUS_TEXT;
		assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Status Text"), statusText);
		client.updateCurrentStatus(statusText);
	}

	/**
	 * Test method for {@link com.google.code.linkedinapi.client.impl.LinkedInApiJaxbClient#deleteCurrentStatus()}.
	 */
	@Test
	public void testDeleteCurrentStatus() {
		client.deleteCurrentStatus();
	}
	
	/**
	 * 
	 */
	private Date getCurrentDate() {
		return new Date();
	}

	/**
	 * 
	 */
	private Date getLastWeekDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -7);
		return calendar.getTime();
	}

	/**
	 * 
	 */
	private Map<SearchParameter, String> getSearchParametersMap(String searchParameters) {
		Map<SearchParameter, String> map = new EnumMap<SearchParameter, String>(SearchParameter.class);
		String[] entries = searchParameters.split(",");
		for (String entry : entries) {
			String[] tuple = entry.split("=");
			if (tuple.length == 2) {
				map.put(SearchParameter.fromString(tuple[0]), tuple[1]);
			}
						
		}
		return map;
	}

	/**
	 * 
	 */
	private List<String> getRecepientIdsList(String messageRecepients) {
		return Arrays.asList(messageRecepients.split(","));
	}
	
	/**
	 * 
	 */
	private void assertNotNullOrEmpty(String message, String value) {
		assertNotNull(message, value);
		assertFalse(message, "".equals(value));
	}
}
