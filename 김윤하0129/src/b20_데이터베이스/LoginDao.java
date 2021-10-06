package b20_데이터베이스;

import b22_윈도우빌더.dto.UserDto;

public interface LoginDao {
	public int login(String id, String password);
	public String getLoginUsername(String id);
	public UserDto getUserDto(String id);
}
