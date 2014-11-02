package test.java.daos;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.mahin.daos.FriendsDAOimpl;
import com.mahin.models.Friends;
public class FriendsDAOimpleTest {

	Friends friends = new Friends();
	FriendsDAOimpl friendsDAO=new FriendsDAOimpl();
	
	@Test
	@Rollback(true)
	public void TESTaddFriend() {
	 friends.setGranted(true);
	 friends.setRank(1);
	 friends.setReqreceiver(1);
	 friends.setReqsender(2);
	friendsDAO.addFriend(friends);
	}
	
	@Test
	@Rollback(true)
	public void TESTupdateFriend() {
		friends.setFriendid(1);
		 friends.setGranted(true);
		 friends.setRank(5);
		 friends.setReqreceiver(1);
		 friends.setReqsender(2);
		friendsDAO.updateFriend(friends);
	}
	
	@Test
	public void TESTgetFriend() {
		
		friendsDAO.getFriend(1);
	}
	
	@Test
	@Rollback(true)
	public void TESTdeleteFriend() {

		friendsDAO.deleteFriend(1);
	}
	
	@Test
	public void TESTgetFriends() {
		
		friendsDAO.getFriends();
	}
}
