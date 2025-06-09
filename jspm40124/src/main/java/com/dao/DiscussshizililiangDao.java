package com.dao;

import com.entity.DiscussshizililiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshizililiangVO;
import com.entity.view.DiscussshizililiangView;


/**
 * 师资力量评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface DiscussshizililiangDao extends BaseMapper<DiscussshizililiangEntity> {
	
	List<DiscussshizililiangVO> selectListVO(@Param("ew") Wrapper<DiscussshizililiangEntity> wrapper);
	
	DiscussshizililiangVO selectVO(@Param("ew") Wrapper<DiscussshizililiangEntity> wrapper);
	
	List<DiscussshizililiangView> selectListView(@Param("ew") Wrapper<DiscussshizililiangEntity> wrapper);

	List<DiscussshizililiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshizililiangEntity> wrapper);
	
	DiscussshizililiangView selectView(@Param("ew") Wrapper<DiscussshizililiangEntity> wrapper);
	
}
