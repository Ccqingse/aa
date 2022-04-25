package com.hz.boot09.dao;
import com.hz.boot09.pojo.Bill;
import com.hz.boot09.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillDao {

    /**
     * 根据ID  获得供应商对象
     * @param id
     * @return
     */
    public Bill findBillById(Integer id);

    /**
     * 多条件组合查询
     * 翻页查询供应商信息
     * @param pyl  偏移量
     * @param page_size 每页显示条数
     * @return
     */
    public List<Bill> findBillList(
            @Param("pyl") Integer pyl,
            @Param("page_size") Integer page_size,
            @Param("billCode") String billCode,
            @Param("productName") String productName,
            @Param("productUnit") String productUnit
    );

    /**
     * 获得总条数
     * @return
     */
    public Integer findBillListCount(
            @Param("billCode") String billCode,
            @Param("productName") String productName,
            @Param("productUnit") String productUnit
    );

    /**
     * 新增数据
     * @return
     */
    public int insertBill(Bill bill);


    /**
     * 新增数据
     * @param
     * @return
     */
    public int updateBill(Bill bill);

    /**
     * 删除数据
     * @param
     * @return
     */
    public int deleteBillById(Integer id);
}
