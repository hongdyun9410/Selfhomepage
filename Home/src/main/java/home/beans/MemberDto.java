package home.beans;

import java.util.Date;

public class MemberDto {
	private String memberId;
	private String memberPw;
	private String memberNick;
	private Date memberBirth;
	private String memberEmail;
	private String memberPhone;
	private Date memberJoin;
	private int memberPoint;
	private String memberGarde;
	
	public Date getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberNick() {
		return memberNick;
	}
	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public Date getMemberJoin() {
		return memberJoin;
	}
	public void setMemberJoin(Date memberJoin) {
		this.memberJoin = memberJoin;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	public String getMemberGarde() {
		return memberGarde;
	}
	public void setMemberGarde(String memberGarde) {
		this.memberGarde = memberGarde;
	}
	public MemberDto() {
		super();
	}
	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberNick=" + memberNick
				+ ", memberBirth=" + memberBirth + ", memberEmail=" + memberEmail + ", memberPhone=" + memberPhone
				+ ", memberJoin=" + memberJoin + ", memberPoint=" + memberPoint + ", memberGarde=" + memberGarde + "]";
	}

	
	
	

}
