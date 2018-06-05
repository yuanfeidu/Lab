package yuanfei.du.hrm.dao.mapper;

import yuanfei.du.hrm.entity.DocumentInf;

public interface DocumentInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocumentInf record);

    int insertSelective(DocumentInf record);

    DocumentInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocumentInf record);

    int updateByPrimaryKey(DocumentInf record);
}