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


import com.dao.DiscussxuexiaofengcaiDao;
import com.entity.DiscussxuexiaofengcaiEntity;
import com.service.DiscussxuexiaofengcaiService;
import com.entity.vo.DiscussxuexiaofengcaiVO;
import com.entity.view.DiscussxuexiaofengcaiView;

@Service("discussxuexiaofengcaiService")
public class DiscussxuexiaofengcaiServiceImpl extends ServiceImpl<DiscussxuexiaofengcaiDao, DiscussxuexiaofengcaiEntity> implements DiscussxuexiaofengcaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexiaofengcaiEntity> page = this.selectPage(
                new Query<DiscussxuexiaofengcaiEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexiaofengcaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexiaofengcaiEntity> wrapper) {
		  Page<DiscussxuexiaofengcaiView> page =new Query<DiscussxuexiaofengcaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuexiaofengcaiVO> selectListVO(Wrapper<DiscussxuexiaofengcaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexiaofengcaiVO selectVO(Wrapper<DiscussxuexiaofengcaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexiaofengcaiView> selectListView(Wrapper<DiscussxuexiaofengcaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexiaofengcaiView selectView(Wrapper<DiscussxuexiaofengcaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
