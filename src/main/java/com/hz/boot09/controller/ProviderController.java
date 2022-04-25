package com.hz.boot09.controller;

import com.hz.boot09.pojo.Provider;
import com.hz.boot09.service.ProviderService;
import com.hz.boot09.utils.JsonMassage;
import com.hz.boot09.utils.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;


    @RequestMapping( "/test")
    public  String test( ){
        System.out.println("进入test");
        return "index";
    }


    @RequestMapping(value = "/findProviderList1",method = RequestMethod.GET)
    @ResponseBody
    public JsonMassage<List<Provider>> findProviderList1(
            @RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
            String proName,
            String proDesc
    ){

        List<Provider> list = providerService.findProviderList1(pageNo,pageSize,proName,proDesc);
        System.out.println(list.toString());
        Integer count = providerService.findProviderListCount1(proName,proDesc);

        JsonMassage<List<Provider>> jsonMassage = new JsonMassage<List<Provider>>();
        jsonMassage.setCode(200);
        jsonMassage.setMsg("ok");
        jsonMassage.setCount(count);
        jsonMassage.setData(list);
        return jsonMassage;
    }
    /**
     * 分页查询  多条件
     * @param page  当前页
     * @param limit1 每页显示条数
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findProviderList" ,method = RequestMethod.GET)
    public JsonMassage<List<Provider>> findProviderList(
            @RequestParam(value = "page",defaultValue = "1")Integer page,
            @RequestParam(value = "limit1",defaultValue = "10")Integer limit1,
            String proName,
            String proDesc,
            String proContact
    ){
        System.out.println("进入findProviderList=========================================");
        List<Provider> list = providerService.findProviderList(page,limit1,proName,proDesc,proContact);
        Integer count =providerService.findProviderListCount(proName,proDesc,proContact);
        JsonMassage<List<Provider>> jsonMassage = new JsonMassage<>();
        jsonMassage.setCode(0);
        jsonMassage.setMsg("请求成功");
        jsonMassage.setCount(count);
        jsonMassage.setData(list);
        return jsonMassage;
    }



    @RequestMapping("/findProviderById/{id}")
    public String findProviderById(@PathVariable("id") Integer id, Model model){

        model.addAttribute("pro",providerService.findProviderById(id));
        System.out.println("进入findProviderById==========================");
        return "provider_edit";
    }

    //    新增数据
    @ResponseBody
    @RequestMapping(value = "insertProvider" ,method = RequestMethod.POST)
    public ResultJson insertProvider(Provider provider){
        System.out.println("进入insertProvider=======");
        int i = providerService.insertProvider(provider);
        System.out.println("受影响行数==================================================================================================="+i);
        return new ResultJson(i);
    }

    //    修改数据
    @ResponseBody
    @RequestMapping(value = "updateProvider" ,method = RequestMethod.POST)
    public ResultJson updateProvider(Provider provider){
        System.out.println("进入updateProvider=======");
        int i = providerService.updateProvider(provider);
        System.out.println("受影响行数==================================================================================================="+i);
        return new ResultJson(i);
    }

    //    删除数据
    @ResponseBody
    @RequestMapping(value = "deleteProviderById" ,method = RequestMethod.POST)
    public ResultJson deleteProviderById(Integer id){
        System.out.println("进入deleteProviderById=======");
        int i = providerService.deleteProviderById(id);
        System.out.println("受影响行数==================================================================================================="+i);
        return new ResultJson(i);
    }
}
