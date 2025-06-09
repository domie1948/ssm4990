package com.dao;

import com.entity.DiscusstougaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstougaoxinxiVO;
import com.entity.view.DiscusstougaoxinxiView;


/**
 * 投稿信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface DiscusstougaoxinxiDao extends BaseMapper<DiscusstougaoxinxiEntity> {
	
	List<DiscusstougaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusstougaoxinxiEntity> wrapper);
	
	DiscusstougaoxinxiVO selectVO(@Param("ew") Wrapper<DiscusstougaoxinxiEntity> wrapper);
	
	List<DiscusstougaoxinxiView> selectListView(@Param("ew") Wrapper<DiscusstougaoxinxiEntity> wrapper);

	List<DiscusstougaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstougaoxinxiEntity> wrapper);
	
	DiscusstougaoxinxiView selectView(@Param("ew") Wrapper<DiscusstougaoxinxiEntity> wrapper);
	
}
