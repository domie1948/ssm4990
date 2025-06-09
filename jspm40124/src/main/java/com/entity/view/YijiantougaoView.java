package com.entity.view;

import com.entity.YijiantougaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 意见投稿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
@TableName("yijiantougao")
public class YijiantougaoView  extends YijiantougaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YijiantougaoView(){
	}
 
 	public YijiantougaoView(YijiantougaoEntity yijiantougaoEntity){
 	try {
			BeanUtils.copyProperties(this, yijiantougaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
