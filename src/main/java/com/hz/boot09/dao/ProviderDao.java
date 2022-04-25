package com.hz.boot09.dao;
import com.hz.boot09.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderDao {


    public Integer findProviderListCount1(String proName,String proDesc);

    public List<Provider> findProviderList1(
            @Param("pyl") Integer pyl,
            @Param("page_size") Integer page_size,
            @Param("proName")String proName,
            @Param("proDesc")String proDesc
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
     * @param pyl  偏移量
     * @param page_size 每页显示条数
     * @return
     */
    public List<Provider> findProviderList(
            @Param("pyl") Integer pyl,
            @Param("page_size") Integer page_size,
            @Param("proName") String proName,
            @Param("proDesc") String proDesc,
            @Param("proContact") String proContact
    );

    /**
     * 获得总条数
     * @return
     */
    public Integer findProviderListCount(
            @Param("proName") String proName,
            @Param("proDesc") String proDesc,
             @Param("proContact") String proContact
    );

    /**
     * 新增数据
     * @return
     */
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
