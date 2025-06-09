package com.dao;

import com.entity.YijiantougaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YijiantougaoVO;
import com.entity.view.YijiantougaoView;


/**
 * 意见投稿
 * 
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface YijiantougaoDao extends BaseMapper<YijiantougaoEntity> {
	
	List<YijiantougaoVO> selectListVO(@Param("ew") Wrapper<YijiantougaoEntity> wrapper);
	
	YijiantougaoVO selectVO(@Param("ew") Wrapper<YijiantougaoEntity> wrapper);
	
	List<YijiantougaoView> selectListView(@Param("ew") Wrapper<YijiantougaoEntity> wrapper);

	List<YijiantougaoView> selectListView(Pagination page,@Param("ew") Wrapper<YijiantougaoEntity> wrapper);
	
	YijiantougaoView selectView(@Param("ew") Wrapper<YijiantougaoEntity> wrapper);
	
}
