package com.msld.wujibazi.service;

import com.msld.wujibazi.domain.MoiraRecord;
import com.msld.wujibazi.domain.vo.MoiraVO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface MoiraRecordService {

    public int insertMoiraRecord(MoiraRecord moiraRecord);

    public List<MoiraRecord> selectMoiraRecordList(MoiraRecord moiraRecord);

    public int deleteMoiraRecordById(Integer id);

    public Map<String, Object> getMoiraData(MoiraVO moiraVO);

    public Map<String, Object> getQzsyData(MoiraVO moiraVO);

    public Map<String, Object> getZhanXingData(MoiraVO moiraVO);

    public void export(HttpServletResponse response, MoiraVO moiraVO) throws IOException;

    public Map<String, Object> getTableData(MoiraVO moiraVO);

    public Map<String, Object> getZxTableData(MoiraVO moiraVO);
}
