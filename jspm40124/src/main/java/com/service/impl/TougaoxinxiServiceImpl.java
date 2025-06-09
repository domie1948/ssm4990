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


import com.dao.TougaoxinxiDao;
import com.entity.TougaoxinxiEntity;
import com.service.TougaoxinxiService;
import com.entity.vo.TougaoxinxiVO;
import com.entity.view.TougaoxinxiView;

@Service("tougaoxinxiService")
public class TougaoxinxiServiceImpl extends ServiceImpl<TougaoxinxiDao, TougaoxinxiEntity> implements TougaoxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TougaoxinxiEntity> page = this.selectPage(
                new Query<TougaoxinxiEntity>(params).getPage(),
                new EntityWrapper<TougaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TougaoxinxiEntity> wrapper) {
		  Page<TougaoxinxiView> page =new Query<TougaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TougaoxinxiVO> selectListVO(Wrapper<TougaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TougaoxinxiVO selectVO(Wrapper<TougaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TougaoxinxiView> selectListView(Wrapper<TougaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TougaoxinxiView selectView(Wrapper<TougaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
