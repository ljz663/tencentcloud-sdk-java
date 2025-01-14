package com.tencentcloudapi.trp.v20210515;
public enum TrpErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 企业服务时间已到期。
     AUTHFAILURE_CORPEXPIRED("AuthFailure.CorpExpired"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter");
     
    private String value;
    private TrpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

