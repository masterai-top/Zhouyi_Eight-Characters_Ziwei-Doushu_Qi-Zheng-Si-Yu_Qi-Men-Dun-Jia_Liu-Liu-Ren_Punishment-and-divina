package com.msld.wujibazi.service;

import com.msld.wujibazi.domain.MoiraTask;
import com.msld.wujibazi.domain.vo.MoiraTaskVo;

import java.util.List;

public interface MoiraTaskService {

    public int insertMoiraTask(MoiraTask moiraTask);

    public List<MoiraTaskVo> selectMoiraTaskVoList(MoiraTaskVo moiraTaskVo);

    public int execMoiraTask(MoiraTaskVo moiraTaskVo);

    public int updateMoiraTaskStatus(Integer taskId, Integer status);

    public int deleteMoiraTaskByTaskId(Integer taskId);

    public MoiraTask selectMoiraTaskByTaskId(Integer taskId);

    public int move(Integer taskId, Integer type, Integer userId);
}
