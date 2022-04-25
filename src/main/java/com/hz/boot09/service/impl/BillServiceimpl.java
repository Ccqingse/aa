package com.hz.boot09.service.impl;


import com.hz.boot09.dao.BillDao;
import com.hz.boot09.pojo.Bill;
import com.hz.boot09.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceimpl implements BillService {
    @Autowired(required = false)
    private BillDao billDao;

    /**
     * 根据ID  获得供应商对象
     *
     * @param id
     * @return
     */
    public Bill findBillById(Integer id) {
        return billDao.findBillById(id);
    }


    @Override
    public List<Bill> findBillList(Integer curr_page, Integer page_size, String billCode, String productName, String productUnit) {
       //计算偏移量 = （当前页-1）*每页显示条数
        Integer pyl = (curr_page-1)*page_size;
        return billDao.findBillList(pyl,page_size,billCode,productName,productUnit);
    }

    @Override
    public Integer findBillListCount(String billCode, String productName, String productUnit) {
        return billDao.findBillListCount(billCode,productName,productUnit);
    }


    @Override
    public int insertBill(Bill bill) {
        return billDao.insertBill(bill);
    }

    @Override
    public int updateBill(Bill bill) {
        return billDao.updateBill(bill);
    }


    @Override
    public int deleteBillById(Integer id ) {
        return billDao.deleteBillById(id);
    }


}
