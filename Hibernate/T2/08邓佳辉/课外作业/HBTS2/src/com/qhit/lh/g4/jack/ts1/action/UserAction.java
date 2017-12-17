package com.qhit.lh.g4.jack.ts1.action;
import com.opensymphony.xwork2.Action;
import com.qhit.lh.g4.jack.ts1.bean.User;


public class UserAction implements Action  {
private User user;

	public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return Action.SUCCESS;
	}

}