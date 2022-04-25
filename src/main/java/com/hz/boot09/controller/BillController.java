package com.hz.boot09.controller;

import com.hz.boot09.pojo.Bill;
import com.hz.boot09.service.BillService;
import com.hz.boot09.utils.JsonMassage;
import com.hz.boot09.utils.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;


    @RequestMapping( "/test")
    public  String test( ){
        System.out.println("进入test");
        return "test";
    }

    /**
     * 分页查询  多条件
     * @param page  当前页
     * @param limit1 每页显示条数
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findBillList" ,method = RequestMethod.GET)
    public JsonMassage<List<Bill>> findBillList(
            @RequestParam(value = "page",defaultValue = "1")Integer page,
            @RequestParam(value = "limit1",defaultValue = "10")Integer limit1,
            String billCode,
            String productName,
            String productUnit
    ){
        System.out.println("进入findBillList=======================");
        List<Bill> list = billService.findBillList(page,limit1,billCode,productName,productUnit);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Integer count =billService.findBillListCount(billCode,productName,productUnit);
        JsonMassage<List<Bill>> jsonMassage = new JsonMassage<>();
        jsonMassage.setCode(0);
        jsonMassage.setMsg("请求成功");
        jsonMassage.setCount(count);
        jsonMassage.setData(list);
        System.out.println(jsonMassage.toString());
        return jsonMassage;
    }



    @RequestMapping("/findBillById/{id}")
    public String findBillById(@PathVariable("id") Integer id, Model model){
        System.out.println("进入findBillById==========================");
        Bill bill = billService.findBillById(id);
        System.out.println(bill.getId());
        System.out.println(bill.getCreatedBy());
        System.out.println(bill.getCreationDate());
        System.out.println(bill.getProductName());
        model.addAttribute("bi",billService.findBillById(id));
        return "Bill_edit";
    }

    //    新增数据
    @ResponseBody
    @RequestMapping(value = "insertBill" ,method = RequestMethod.POST)
    public ResultJson insertBill(Bill bill){
        System.out.println("进入insertBill=======");
        int i = billService.insertBill(bill);
        System.out.println(bill.getCreatedBy());
        System.out.println("受影响行数==================================================================================================="+i);
        return new ResultJson(i);
    }

    //    修改数据
    @ResponseBody
    @RequestMapping(value = "updateBill" ,method = RequestMethod.POST)
    public ResultJson updateBill(Bill bill){
        System.out.println("进入updateBill=======");
        int i = billService.updateBill(bill);
        System.out.println("受影响行数==================================================================================================="+i);
        return new ResultJson(i);
    }

    //    删除数据
    @ResponseBody
    @RequestMapping(value = "deleteBillById" ,method = RequestMethod.POST)
    public ResultJson deleteBillById(Integer id){
        System.out.println("进入deleteProviderById=======");
        int i = billService.deleteBillById(id);
        System.out.println("受影响行数==================================================================================================="+i);
        return new ResultJson(i);
    }
}
