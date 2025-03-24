package com.entity.view;

import com.entity.ToupiaozhutiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投票主题
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 22:49:26
 */
@TableName("toupiaozhuti")
public class ToupiaozhutiView  extends ToupiaozhutiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ToupiaozhutiView(){
	}
 
 	public ToupiaozhutiView(ToupiaozhutiEntity toupiaozhutiEntity){
 	try {
			BeanUtils.copyProperties(this, toupiaozhutiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
