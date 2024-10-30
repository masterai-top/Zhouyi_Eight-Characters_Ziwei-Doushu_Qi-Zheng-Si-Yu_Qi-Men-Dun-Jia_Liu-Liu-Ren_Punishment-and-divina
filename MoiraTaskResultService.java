package com.msld.wujibazi.service;

import com.msld.wujibazi.domain.MoiraTaskResult;

import java.util.List;

public interface MoiraTaskResultService {

    public int insertMoiraTaskResult(MoiraTaskResult moiraTaskResult);

    public List<MoiraTaskResult> selectMoiraTaskResultList(MoiraTaskResult moiraTaskResult);

    public int deleteMoiraTaskResultByTaskId(Integer taskId);
}
