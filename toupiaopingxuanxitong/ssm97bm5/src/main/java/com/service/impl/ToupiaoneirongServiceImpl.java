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


import com.dao.ToupiaoneirongDao;
import com.entity.ToupiaoneirongEntity;
import com.service.ToupiaoneirongService;
import com.entity.vo.ToupiaoneirongVO;
import com.entity.view.ToupiaoneirongView;

@Service("toupiaoneirongService")
public class ToupiaoneirongServiceImpl extends ServiceImpl<ToupiaoneirongDao, ToupiaoneirongEntity> implements ToupiaoneirongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ToupiaoneirongEntity> page = this.selectPage(
                new Query<ToupiaoneirongEntity>(params).getPage(),
                new EntityWrapper<ToupiaoneirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ToupiaoneirongEntity> wrapper) {
		  Page<ToupiaoneirongView> page =new Query<ToupiaoneirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ToupiaoneirongVO> selectListVO(Wrapper<ToupiaoneirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ToupiaoneirongVO selectVO(Wrapper<ToupiaoneirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ToupiaoneirongView> selectListView(Wrapper<ToupiaoneirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ToupiaoneirongView selectView(Wrapper<ToupiaoneirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ToupiaoneirongEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ToupiaoneirongEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ToupiaoneirongEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
