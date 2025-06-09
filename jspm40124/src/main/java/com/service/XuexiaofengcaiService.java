package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaofengcaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaofengcaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaofengcaiView;


/**
 * 学校风采
 *
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface XuexiaofengcaiService extends IService<XuexiaofengcaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaofengcaiVO> selectListVO(Wrapper<XuexiaofengcaiEntity> wrapper);
   	
   	XuexiaofengcaiVO selectVO(@Param("ew") Wrapper<XuexiaofengcaiEntity> wrapper);
   	
   	List<XuexiaofengcaiView> selectListView(Wrapper<XuexiaofengcaiEntity> wrapper);
   	
   	XuexiaofengcaiView selectView(@Param("ew") Wrapper<XuexiaofengcaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaofengcaiEntity> wrapper);
   	
}

