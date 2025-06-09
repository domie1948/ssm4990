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


import com.dao.YijiantougaoDao;
import com.entity.YijiantougaoEntity;
import com.service.YijiantougaoService;
import com.entity.vo.YijiantougaoVO;
import com.entity.view.YijiantougaoView;

@Service("yijiantougaoService")
public class YijiantougaoServiceImpl extends ServiceImpl<YijiantougaoDao, YijiantougaoEntity> implements YijiantougaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YijiantougaoEntity> page = this.selectPage(
                new Query<YijiantougaoEntity>(params).getPage(),
                new EntityWrapper<YijiantougaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YijiantougaoEntity> wrapper) {
		  Page<YijiantougaoView> page =new Query<YijiantougaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YijiantougaoVO> selectListVO(Wrapper<YijiantougaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YijiantougaoVO selectVO(Wrapper<YijiantougaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YijiantougaoView> selectListView(Wrapper<YijiantougaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YijiantougaoView selectView(Wrapper<YijiantougaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
