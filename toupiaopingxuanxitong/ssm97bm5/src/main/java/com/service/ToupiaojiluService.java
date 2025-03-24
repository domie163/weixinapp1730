package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ToupiaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ToupiaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ToupiaojiluView;


/**
 * 投票记录
 *
 * @author 
 * @email 
 * @date 2022-03-15 22:49:26
 */
public interface ToupiaojiluService extends IService<ToupiaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToupiaojiluVO> selectListVO(Wrapper<ToupiaojiluEntity> wrapper);
   	
   	ToupiaojiluVO selectVO(@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);
   	
   	List<ToupiaojiluView> selectListView(Wrapper<ToupiaojiluEntity> wrapper);
   	
   	ToupiaojiluView selectView(@Param("ew") Wrapper<ToupiaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToupiaojiluEntity> wrapper);
   	

}

