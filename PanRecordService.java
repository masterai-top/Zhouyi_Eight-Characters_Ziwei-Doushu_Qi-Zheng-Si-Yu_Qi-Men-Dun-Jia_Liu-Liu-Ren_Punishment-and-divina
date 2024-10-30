package com.msld.wujibazi.service;

import com.msld.wujibazi.domain.PanRecord;

import java.util.List;

public interface PanRecordService {

    public int insertPanRecord(PanRecord panRecord);

    public List<PanRecord> selectPanRecordList(PanRecord panRecord);

    public int deletePanRecordById(Integer id);
}
