package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ToupiaozhutiDao;
import com.entity.ToupiaozhutiEntity;
import com.service.ToupiaozhutiService;
import com.entity.vo.ToupiaozhutiVO;
import com.entity.view.ToupiaozhutiView;

@Service("toupiaozhutiService")
public class ToupiaozhutiServiceImpl extends ServiceImpl<ToupiaozhutiDao, ToupiaozhutiEntity> implements ToupiaozhutiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ToupiaozhutiEntity> page = this.selectPage(
                new Query<ToupiaozhutiEntity>(params).getPage(),
                new EntityWrapper<ToupiaozhutiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ToupiaozhutiEntity> wrapper) {
		  Page<ToupiaozhutiView> page =new Query<ToupiaozhutiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ToupiaozhutiVO> selectListVO(Wrapper<ToupiaozhutiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ToupiaozhutiVO selectVO(Wrapper<ToupiaozhutiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ToupiaozhutiView> selectListView(Wrapper<ToupiaozhutiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ToupiaozhutiView selectView(Wrapper<ToupiaozhutiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
