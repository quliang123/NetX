package com.ql.protocol;

import lombok.Data;

/**
 * @description:
 * @author: quliang
 * @create: 2022-09-29 10:27
 **/
@Data
public class Message {
    private Header header;
    private Object body;
}
