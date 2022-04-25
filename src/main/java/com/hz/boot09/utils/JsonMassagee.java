package com.hz.boot09.utils;

import lombok.Data;

@Data
public class JsonMassagee<T> {
    private Integer code; // 错误代码  0代码成功
    private String msg;
    private Integer count;//总条数
    private T data; //数据
}
