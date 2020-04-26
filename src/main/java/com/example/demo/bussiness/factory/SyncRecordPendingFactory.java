package com.example.demo.bussiness.factory;

import com.example.demo.bussiness.model.ResultModel;

/**
 * @Description 补偿任务工厂
 * @ClassName SyncRecordPendingFactory
 * @Autor DZT
 * @Date 2019/8/21 10:21
 * @Version 1.0
 */
public interface SyncRecordPendingFactory {
    ResultModel executor(String... code);
}
