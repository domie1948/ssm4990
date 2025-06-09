package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YijiantougaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YijiantougaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YijiantougaoView;


/**
 * 意见投稿
 *
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface YijiantougaoService extends IService<YijiantougaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YijiantougaoVO> selectListVO(Wrapper<YijiantougaoEntity> wrapper);
   	
   	YijiantougaoVO selectVO(@Param("ew") Wrapper<YijiantougaoEntity> wrapper);
   	
   	List<YijiantougaoView> selectListView(Wrapper<YijiantougaoEntity> wrapper);
   	
   	YijiantougaoView selectView(@Param("ew") Wrapper<YijiantougaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YijiantougaoEntity> wrapper);
   	
}

