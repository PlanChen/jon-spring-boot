package hello.dao.impl;

import org.springframework.stereotype.Repository;

import hello.dao.IUserInfoDao;
import hello.entity.UserInfo;
import hello.hibernate.impl.HibernateBaseDao;

@Repository
public class UserInfoDaoImpl extends HibernateBaseDao<UserInfo> implements IUserInfoDao{

}
