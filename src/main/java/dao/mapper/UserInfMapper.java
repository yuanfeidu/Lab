package dao.mapper;

import entity.UserInf;

public interface UserInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInf record);

    int insertSelective(UserInf record);

    UserInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInf record);

    int updateByPrimaryKey(UserInf record);
}