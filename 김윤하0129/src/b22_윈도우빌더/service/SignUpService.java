package b22_���������.service;

public interface SignUpService {
	public boolean isEmptyId(String id);
	// DB�� ���̵� �ִ��� üũ��
	public int idCheck(String id);
	public String isEmptyValue(String[] values);
	public String equalsPassword(String pw_tf, String repw_tf);
	public boolean signUp(String[] values);

}
