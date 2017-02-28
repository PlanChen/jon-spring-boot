package hello.controller.commons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import hello.controller.vo.UserInfoVo;
import hello.entity.UserInfo;
import hello.utils.BeanUtils;

@Component
public class UserInfoConvert {
	public UserInfo convert2UserInfo(UserInfoVo userInfoVo) {
		UserInfo userInfo = null;
		if(userInfoVo != null) {
			userInfo = new UserInfo();
			BeanUtils.deepCopy(userInfoVo, userInfo);
		}
		
		return userInfo;
	}
	
	public UserInfoVo convert2UserInfoVo(UserInfo userInfo) {
		UserInfoVo userInfoVo = null;
		if(userInfo != null) {
			userInfoVo = new UserInfoVo();
			BeanUtils.deepCopy(userInfo, userInfoVo);
		}
		
		return userInfoVo;
	}
	
	public List<UserInfoVo> convert2UserInfoVoList(List<UserInfo> userInfoList) {
		List<UserInfoVo> userInfoVoList = new ArrayList<UserInfoVo>();
		if(userInfoList.size() > 0) {
			for(UserInfo userInfo : userInfoList) {
				userInfoVoList.add(this.convert2UserInfoVo(userInfo));
			}
		}
		return userInfoVoList;
	}
	
	public List<UserInfo> convert2UserInfoList(List<UserInfoVo> userInfoVoList) {
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		if(userInfoVoList.size() > 0) {
			for(UserInfoVo userInfoVo : userInfoVoList) {
				userInfoList.add(this.convert2UserInfo(userInfoVo));
			}
		}
		return userInfoList;
	}
}
