package com.haiyu.manager.service;

import com.haiyu.manager.pojo.Disease;
import com.haiyu.manager.pojo.Temperature;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName DiseaseShowService
 * @Description
 * @Author 李策
 * @Date 2021-3-01 21:58
 */
public interface TemperatureService {
    List<Temperature> getAll();
    boolean insertTemperature(Temperature temperature);
    List<Temperature> findWeekTemp(String monday,String sunday);
    //年+月
    List<Temperature> findMonthTemp(String date);
}
