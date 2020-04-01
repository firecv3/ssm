package com.ssm.dto;

public class UserInfo {
	private int userId;
	private String userName;
	private String userPwd;
	private int userIsJoinKq;
	private int userType;
	private int userEdu;
	private String userDate;
	private String userMail;
	private String userTel;
	private String userInfo;
	private int userIsOnlne;
	private int deptId;
	public UserInfo() {
		super();
	}
	public UserInfo(int userId, String userName, String userPwd, int userIsJoinKq, int userType, int userEdu,
			String userDate, String userMail, String userTel, String userInfo, int userIsOnlne, int deptId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userIsJoinKq = userIsJoinKq;
		this.userType = userType;
		this.userEdu = userEdu;
		this.userDate = userDate;
		this.userMail = userMail;
		this.userTel = userTel;
		this.userInfo = userInfo;
		this.userIsOnlne = userIsOnlne;
		this.deptId = deptId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserIsJoinKq() {
		return userIsJoinKq;
	}
	public void setUserIsJoinKq(int userIsJoinKq) {
		this.userIsJoinKq = userIsJoinKq;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getUserEdu() {
		return userEdu;
	}
	public void setUserEdu(int userEdu) {
		this.userEdu = userEdu;
	}
	public String getUserDate() {
		return userDate;
	}
	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public int getUserIsOnlne() {
		return userIsOnlne;
	}
	public void setUserIsOnlne(int userIsOnlne) {
		this.userIsOnlne = userIsOnlne;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptId;
		result = prime * result + ((userDate == null) ? 0 : userDate.hashCode());
		result = prime * result + userEdu;
		result = prime * result + userId;
		result = prime * result + ((userInfo == null) ? 0 : userInfo.hashCode());
		result = prime * result + userIsJoinKq;
		result = prime * result + userIsOnlne;
		result = prime * result + ((userMail == null) ? 0 : userMail.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPwd == null) ? 0 : userPwd.hashCode());
		result = prime * result + ((userTel == null) ? 0 : userTel.hashCode());
		result = prime * result + userType;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (deptId != other.deptId)
			return false;
		if (userDate == null) {
			if (other.userDate != null)
				return false;
		} else if (!userDate.equals(other.userDate))
			return false;
		if (userEdu != other.userEdu)
			return false;
		if (userId != other.userId)
			return false;
		if (userInfo == null) {
			if (other.userInfo != null)
				return false;
		} else if (!userInfo.equals(other.userInfo))
			return false;
		if (userIsJoinKq != other.userIsJoinKq)
			return false;
		if (userIsOnlne != other.userIsOnlne)
			return false;
		if (userMail == null) {
			if (other.userMail != null)
				return false;
		} else if (!userMail.equals(other.userMail))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPwd == null) {
			if (other.userPwd != null)
				return false;
		} else if (!userPwd.equals(other.userPwd))
			return false;
		if (userTel == null) {
			if (other.userTel != null)
				return false;
		} else if (!userTel.equals(other.userTel))
			return false;
		if (userType != other.userType)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userIsJoinKq="
				+ userIsJoinKq + ", userType=" + userType + ", userEdu=" + userEdu + ", userDate=" + userDate
				+ ", userMail=" + userMail + ", userTel=" + userTel + ", userInfo=" + userInfo + ", userIsOnlne="
				+ userIsOnlne + ", deptId=" + deptId + "]";
	}
	
	
}
