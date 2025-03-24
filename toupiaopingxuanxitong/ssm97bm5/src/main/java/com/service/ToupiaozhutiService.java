package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ToupiaozhutiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ToupiaozhutiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ToupiaozhutiView;


/**
 * 投票主题
 *
 * @author 
 * @email 
 * @date 2022-03-15 22:49:26
 */
public interface ToupiaozhutiService extends IService<ToupiaozhutiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToupiaozhutiVO> selectListVO(Wrapper<ToupiaozhutiEntity> wrapper);
   	
   	ToupiaozhutiVO selectVO(@Param("ew") Wrapper<ToupiaozhutiEntity> wrapper);
   	
   	List<ToupiaozhutiView> selectListView(Wrapper<ToupiaozhutiEntity> wrapper);
   	
   	ToupiaozhutiView selectView(@Param("ew") Wrapper<ToupiaozhutiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToupiaozhutiEntity> wrapper);
   	

}

