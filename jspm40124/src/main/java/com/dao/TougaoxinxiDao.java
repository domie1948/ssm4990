package com.dao;

import com.entity.TougaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TougaoxinxiVO;
import com.entity.view.TougaoxinxiView;


/**
 * 投稿信息
 * 
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface TougaoxinxiDao extends BaseMapper<TougaoxinxiEntity> {
	
	List<TougaoxinxiVO> selectListVO(@Param("ew") Wrapper<TougaoxinxiEntity> wrapper);
	
	TougaoxinxiVO selectVO(@Param("ew") Wrapper<TougaoxinxiEntity> wrapper);
	
	List<TougaoxinxiView> selectListView(@Param("ew") Wrapper<TougaoxinxiEntity> wrapper);

	List<TougaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TougaoxinxiEntity> wrapper);
	
	TougaoxinxiView selectView(@Param("ew") Wrapper<TougaoxinxiEntity> wrapper);
	
}
