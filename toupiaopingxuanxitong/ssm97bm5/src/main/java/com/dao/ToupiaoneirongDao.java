package com.dao;

import com.entity.ToupiaoneirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToupiaoneirongVO;
import com.entity.view.ToupiaoneirongView;


/**
 * 投票内容
 * 
 * @author 
 * @email 
 * @date 2022-03-15 22:49:26
 */
public interface ToupiaoneirongDao extends BaseMapper<ToupiaoneirongEntity> {
	
	List<ToupiaoneirongVO> selectListVO(@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);
	
	ToupiaoneirongVO selectVO(@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);
	
	List<ToupiaoneirongView> selectListView(@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);

	List<ToupiaoneirongView> selectListView(Pagination page,@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);
	
	ToupiaoneirongView selectView(@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ToupiaoneirongEntity> wrapper);
}
