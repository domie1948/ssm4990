package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TougaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TougaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TougaoxinxiView;


/**
 * 投稿信息
 *
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface TougaoxinxiService extends IService<TougaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TougaoxinxiVO> selectListVO(Wrapper<TougaoxinxiEntity> wrapper);
   	
   	TougaoxinxiVO selectVO(@Param("ew") Wrapper<TougaoxinxiEntity> wrapper);
   	
   	List<TougaoxinxiView> selectListView(Wrapper<TougaoxinxiEntity> wrapper);
   	
   	TougaoxinxiView selectView(@Param("ew") Wrapper<TougaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TougaoxinxiEntity> wrapper);
   	
}

