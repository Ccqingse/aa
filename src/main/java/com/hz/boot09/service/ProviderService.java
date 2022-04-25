package com.hz.boot09.service;

import com.hz.boot09.pojo.Provider;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProviderService {


    public Integer findProviderListCount1(String proName,String proDesc);

    public List<Provider> findProviderList1(
            Integer curr_page, Integer page_size,
            String proName,String proDesc
    );

    /**
     * 根据ID  获得供应商对象
     * @param id
     * @return
     */
    public Provider findProviderById(Integer id);
    /**
     * 多条件组合查询
     * 翻页查询供应商信息
     * @param curr_page  当前页
     * @param page_size 每页显示条数
     * @return
     */
    public List<Provider> findProviderList(Integer curr_page, Integer page_size, String proName, String proDesc,String proContact);
    /**
     * 获得总条数
     * @return
     */
    public Integer findProviderListCount(String proName, String proDesc,String proContact);
    //新增对象
    public int insertProvider(Provider provider);

    /**
     * 新增数据
     * @param provider
     * @return
     */
    public int updateProvider(Provider provider);
    /**
     * 删除数据
     * @param
     * @return
     */

    public int deleteProviderById(Integer id);
}
