package com.hz.boot09.service.impl;


import com.hz.boot09.dao.ProviderDao;
import com.hz.boot09.pojo.Provider;

import com.hz.boot09.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceimpl implements ProviderService {
    @Autowired
    private ProviderDao providerDao;


    @Override
    public List<Provider> findProviderList1(Integer curr_page, Integer page_size,String proName,String proDesc) {
        //计算偏移量 = (当前页-1)*每页显示条数
        Integer pyl = (curr_page-1)*page_size;
        return providerDao.findProviderList1(pyl,page_size,proName,proDesc);
    }
    @Override
    public Integer findProviderListCount1(String proName,String proDesc) {
        return providerDao.findProviderListCount1(proName,proDesc);
    }

    /**
     * 根据ID  获得供应商对象
     *
     * @param id
     * @return
     */
    public Provider findProviderById(Integer id) {
        return providerDao.findProviderById(id);
    }

    @Override
    public List<Provider> findProviderList(Integer curr_page, Integer page_size, String proName, String proDesc, String proContact) {
        //计算偏移量 = （当前页-1）*每页显示条数
        Integer pyl = (curr_page-1)*page_size;
        return providerDao.findProviderList(pyl,page_size,proName,proDesc,proContact);
    }


    @Override
    public Integer findProviderListCount(String proName, String proDesc,String proContact) {
        return providerDao.findProviderListCount(proName,proDesc,proContact);
    }

    @Override
    public int insertProvider(Provider provider) {
        return providerDao.insertProvider(provider);
    }

    @Override
    public int updateProvider(Provider provider) {
        return providerDao.updateProvider(provider);
    }

    @Override
    public int deleteProviderById(Integer id ) {
        return providerDao.deleteProviderById(id);
    }


}
