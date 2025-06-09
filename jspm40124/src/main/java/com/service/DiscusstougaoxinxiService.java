package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstougaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstougaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstougaoxinxiView;


/**
 * 投稿信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
public interface DiscusstougaoxinxiService extends IService<DiscusstougaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstougaoxinxiVO> selectListVO(Wrapper<DiscusstougaoxinxiEntity> wrapper);
   	
   	DiscusstougaoxinxiVO selectVO(@Param("ew") Wrapper<DiscusstougaoxinxiEntity> wrapper);
   	
   	List<DiscusstougaoxinxiView> selectListView(Wrapper<DiscusstougaoxinxiEntity> wrapper);
   	
   	DiscusstougaoxinxiView selectView(@Param("ew") Wrapper<DiscusstougaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstougaoxinxiEntity> wrapper);
   	
}

