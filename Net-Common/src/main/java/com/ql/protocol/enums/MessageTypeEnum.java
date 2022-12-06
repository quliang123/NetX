package com.ql.protocol.enums;

/**
 * @description:
 * @author: quliang
 * @create: 2022-09-29 10:53
 **/
public enum MessageTypeEnum {

    MSG((byte) 1),
    ;

    private byte value;

    MessageTypeEnum(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}
