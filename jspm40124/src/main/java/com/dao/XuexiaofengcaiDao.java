package com.dao;

import com.entity.XuexiaofengcaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaofengcaiVO;
import com.entity.view.XuexiaofengcaiView;


/**
 * 学校风采
 * 
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface XuexiaofengcaiDao extends BaseMapper<XuexiaofengcaiEntity> {
	
	List<XuexiaofengcaiVO> selectListVO(@Param("ew") Wrapper<XuexiaofengcaiEntity> wrapper);
	
	XuexiaofengcaiVO selectVO(@Param("ew") Wrapper<XuexiaofengcaiEntity> wrapper);
	
	List<XuexiaofengcaiView> selectListView(@Param("ew") Wrapper<XuexiaofengcaiEntity> wrapper);

	List<XuexiaofengcaiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaofengcaiEntity> wrapper);
	
	XuexiaofengcaiView selectView(@Param("ew") Wrapper<XuexiaofengcaiEntity> wrapper);
	
}
