package hello.service;

import java.util.List;

import hello.controller.vo.UserInfoVo;

public interface IUserInfoService {

	void saveUserInfo(UserInfoVo userInfoVo);

	UserInfoVo getUserInfoByloginNameAndPassword(String loginName, String password);

	List<UserInfoVo> listAll();

	

}
