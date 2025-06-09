package com.dao;

import com.entity.DiscussxuexiaofengcaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexiaofengcaiVO;
import com.entity.view.DiscussxuexiaofengcaiView;


/**
 * 学校风采评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface DiscussxuexiaofengcaiDao extends BaseMapper<DiscussxuexiaofengcaiEntity> {
	
	List<DiscussxuexiaofengcaiVO> selectListVO(@Param("ew") Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
	
	DiscussxuexiaofengcaiVO selectVO(@Param("ew") Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
	
	List<DiscussxuexiaofengcaiView> selectListView(@Param("ew") Wrapper<DiscussxuexiaofengcaiEntity> wrapper);

	List<DiscussxuexiaofengcaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
	
	DiscussxuexiaofengcaiView selectView(@Param("ew") Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
	
}
