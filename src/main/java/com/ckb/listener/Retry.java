package com.ckb.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * @ClassNAME RetryLister
 * @Description TODO  失败用例重跑
 * @Author tangyx
 * @Date 2022/7/25 8:07 PM
 * @Version 1.0
 */
public class Retry implements IRetryAnalyzer {
    private int retryCount=0;

    @Override
    public boolean retry(ITestResult iTestResult) {
//        boolean invalid = iTestResult.getThrowable().getMessage().contains("invalid");
//        if(invalid){
        int maxRetryCount = 2;
        if (retryCount < maxRetryCount) {
                retryCount++;
                return true;
            }
//            ITestinvokeListener.testResultFailed=true;
            return false;
//        }else {
//        return false;
//        }
    }

}
