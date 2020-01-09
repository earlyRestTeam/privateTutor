package com.czb.privatetutor.mapper;

import com.czb.privatetutor.pojo.JobInformation;
import com.czb.privatetutor.pojo.JobInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobInformationMapper {
    long countByExample(JobInformationExample example);

    int deleteByExample(JobInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobInformation record);

    int insertSelective(JobInformation record);

    List<JobInformation> selectByExample(JobInformationExample example);

    JobInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobInformation record, @Param("example") JobInformationExample example);

    int updateByExample(@Param("record") JobInformation record, @Param("example") JobInformationExample example);

    int updateByPrimaryKeySelective(JobInformation record);

    int updateByPrimaryKey(JobInformation record);
}