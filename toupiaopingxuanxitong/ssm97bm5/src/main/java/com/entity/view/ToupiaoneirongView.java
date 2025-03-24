package com.entity.view;

import com.entity.ToupiaoneirongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投票内容
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 22:49:26
 */
@TableName("toupiaoneirong")
public class ToupiaoneirongView  extends ToupiaoneirongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ToupiaoneirongView(){
	}
 
 	public ToupiaoneirongView(ToupiaoneirongEntity toupiaoneirongEntity){
 	try {
			BeanUtils.copyProperties(this, toupiaoneirongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
