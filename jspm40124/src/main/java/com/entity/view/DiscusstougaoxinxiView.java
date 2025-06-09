package com.entity.view;

import com.entity.DiscusstougaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投稿信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
@TableName("discusstougaoxinxi")
public class DiscusstougaoxinxiView  extends DiscusstougaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstougaoxinxiView(){
	}
 
 	public DiscusstougaoxinxiView(DiscusstougaoxinxiEntity discusstougaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusstougaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
