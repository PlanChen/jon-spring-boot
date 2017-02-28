package hello.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hello.controller.commons.UserInfoConvert;
import hello.controller.vo.UserInfoVo;
import hello.dao.IUserInfoDao;
import hello.entity.UserInfo;
import hello.service.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService{
	
	@Resource
	private UserInfoConvert userInfoConvert;
	
	@Resource
	private IUserInfoDao userInfoDao;

	@Transactional
	public void saveUserInfo(UserInfoVo userInfoVo) {
		UserInfo userInfo = userInfoConvert.convert2UserInfo(userInfoVo);
		userInfoDao.save(userInfo);
	}

	@Override
	public UserInfoVo getUserInfoByloginNameAndPassword(String loginName, String password) {
		String hql = "";
		Map<String, Object> values = new HashMap<>();
		values.put("loginName", loginName);
		values.put("password", password);
		return userInfoConvert.convert2UserInfoVo(userInfoDao.getObjectByHql(hql, values));
	}

	@Override
	@Transactional(readOnly = true)
	public List<UserInfoVo> listAll() {
		return userInfoConvert.convert2UserInfoVoList(userInfoDao.getAll());
	}

}
