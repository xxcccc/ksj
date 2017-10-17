package com.codet.mapper;

import com.codet.pojo.Treatmentreview;
import com.codet.pojo.TreatmentreviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreatmentreviewMapper {
    int countByExample(TreatmentreviewExample example);

    int deleteByExample(TreatmentreviewExample example);

    int deleteByPrimaryKey(Integer ireatmentreviewid);

    int insert(Treatmentreview record);

    int insertSelective(Treatmentreview record);

    List<Treatmentreview> selectByExample(TreatmentreviewExample example);

    Treatmentreview selectByPrimaryKey(Integer ireatmentreviewid);

    int updateByExampleSelective(@Param("record") Treatmentreview record, @Param("example") TreatmentreviewExample example);

    int updateByExample(@Param("record") Treatmentreview record, @Param("example") TreatmentreviewExample example);

    int updateByPrimaryKeySelective(Treatmentreview record);

    int updateByPrimaryKey(Treatmentreview record);
}