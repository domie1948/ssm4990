package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexiaofengcaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexiaofengcaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexiaofengcaiView;


/**
 * 学校风采评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface DiscussxuexiaofengcaiService extends IService<DiscussxuexiaofengcaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexiaofengcaiVO> selectListVO(Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
   	
   	DiscussxuexiaofengcaiVO selectVO(@Param("ew") Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
   	
   	List<DiscussxuexiaofengcaiView> selectListView(Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
   	
   	DiscussxuexiaofengcaiView selectView(@Param("ew") Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexiaofengcaiEntity> wrapper);
   	
}

