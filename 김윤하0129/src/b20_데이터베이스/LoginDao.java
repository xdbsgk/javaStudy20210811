package b20_�����ͺ��̽�;

import b22_���������.dto.UserDto;


public interface LoginDao {
	public int login(String id, String password);
	public String getLoginUserName(String id);
	public UserDto getUserDto(String id);
}