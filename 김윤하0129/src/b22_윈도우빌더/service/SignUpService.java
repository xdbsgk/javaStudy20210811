package b22_윈도우빌더.service;

public interface SignUpService {
	public boolean isEmptyId(String id);
	// DB에 아이디가 있는지 체크함
	public int idCheck(String id);
	public String isEmptyValue(String[] values);
	public String equalsPassword(String pw_tf, String repw_tf);
	public boolean signUp(String[] values);

}
