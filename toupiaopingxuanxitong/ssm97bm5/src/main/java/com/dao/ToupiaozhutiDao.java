package com.dao;

import com.entity.ToupiaozhutiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToupiaozhutiVO;
import com.entity.view.ToupiaozhutiView;


/**
 * 投票主题
 * 
 * @author 
 * @email 
 * @date 2022-03-15 22:49:26
 */
public interface ToupiaozhutiDao extends BaseMapper<ToupiaozhutiEntity> {
	
	List<ToupiaozhutiVO> selectListVO(@Param("ew") Wrapper<ToupiaozhutiEntity> wrapper);
	
	ToupiaozhutiVO selectVO(@Param("ew") Wrapper<ToupiaozhutiEntity> wrapper);
	
	List<ToupiaozhutiView> selectListView(@Param("ew") Wrapper<ToupiaozhutiEntity> wrapper);

	List<ToupiaozhutiView> selectListView(Pagination page,@Param("ew") Wrapper<ToupiaozhutiEntity> wrapper);
	
	ToupiaozhutiView selectView(@Param("ew") Wrapper<ToupiaozhutiEntity> wrapper);
	

}
