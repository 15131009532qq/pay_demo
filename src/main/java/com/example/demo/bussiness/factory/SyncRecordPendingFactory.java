package com.example.demo.bussiness.factory;

import com.example.demo.bussiness.model.ResultModel;

public interface SyncRecordPendingFactory {

  ResultModel executor(String... code);
}
