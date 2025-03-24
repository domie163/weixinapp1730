package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ToupiaoneirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ToupiaoneirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ToupiaoneirongView;


/**
 * 投票内容
 *
 * @author 
 * @email 
 * @date 2022-03-15 22:49:26
 */
public interface ToupiaoneirongService extends IService<ToupiaoneirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToupiaoneirongVO> selectListVO(Wrapper<ToupiaoneirongEntity> wrapper);
   	
   	ToupiaoneirongVO selectVO(@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);
   	
   	List<ToupiaoneirongView> selectListView(Wrapper<ToupiaoneirongEntity> wrapper);
   	
   	ToupiaoneirongView selectView(@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToupiaoneirongEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ToupiaoneirongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ToupiaoneirongEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ToupiaoneirongEntity> wrapper);
}

