package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusstougaoxinxiDao;
import com.entity.DiscusstougaoxinxiEntity;
import com.service.DiscusstougaoxinxiService;
import com.entity.vo.DiscusstougaoxinxiVO;
import com.entity.view.DiscusstougaoxinxiView;

@Service("discusstougaoxinxiService")
public class DiscusstougaoxinxiServiceImpl extends ServiceImpl<DiscusstougaoxinxiDao, DiscusstougaoxinxiEntity> implements DiscusstougaoxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstougaoxinxiEntity> page = this.selectPage(
                new Query<DiscusstougaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusstougaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstougaoxinxiEntity> wrapper) {
		  Page<DiscusstougaoxinxiView> page =new Query<DiscusstougaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstougaoxinxiVO> selectListVO(Wrapper<DiscusstougaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstougaoxinxiVO selectVO(Wrapper<DiscusstougaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstougaoxinxiView> selectListView(Wrapper<DiscusstougaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstougaoxinxiView selectView(Wrapper<DiscusstougaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
