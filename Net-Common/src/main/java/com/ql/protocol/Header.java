package com.ql.protocol;

import com.ql.protocol.enums.MessageTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @author: quliang
 * @create: 2022-09-29 10:34
 **/
@Data
public class Header {
    private int crcCode;
    private long sessionId;
    private byte type;
}
