package com.hz.boot09.service;

import com.hz.boot09.pojo.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BillService {


    /**
     * 根据ID  获得供应商对象
     * @param id
     * @return
     */
    public Bill findBillById(Integer id);

    /**
     * 多条件组合查询
     * 翻页查询供应商信息
     * @param curr_page  当前页
     * @param page_size 每页显示条数
     * @return
     */
    public List<Bill> findBillList(Integer curr_page, Integer page_size, String billCode, String productName, String productUnit);
    /**
     * 获得总条数
     * @return
     */
    public Integer findBillListCount(String billCode, String productName, String productUnit);

    //新增对象
    public int insertBill(Bill bill);

    /**
     * 修改数据
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
