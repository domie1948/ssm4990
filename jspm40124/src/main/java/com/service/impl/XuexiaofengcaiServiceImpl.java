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


import com.dao.XuexiaofengcaiDao;
import com.entity.XuexiaofengcaiEntity;
import com.service.XuexiaofengcaiService;
import com.entity.vo.XuexiaofengcaiVO;
import com.entity.view.XuexiaofengcaiView;

@Service("xuexiaofengcaiService")
public class XuexiaofengcaiServiceImpl extends ServiceImpl<XuexiaofengcaiDao, XuexiaofengcaiEntity> implements XuexiaofengcaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaofengcaiEntity> page = this.selectPage(
                new Query<XuexiaofengcaiEntity>(params).getPage(),
                new EntityWrapper<XuexiaofengcaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaofengcaiEntity> wrapper) {
		  Page<XuexiaofengcaiView> page =new Query<XuexiaofengcaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaofengcaiVO> selectListVO(Wrapper<XuexiaofengcaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaofengcaiVO selectVO(Wrapper<XuexiaofengcaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaofengcaiView> selectListView(Wrapper<XuexiaofengcaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaofengcaiView selectView(Wrapper<XuexiaofengcaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
