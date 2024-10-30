package com.msld.wujibazi.service;

import com.msld.wujibazi.domain.MemberRecord;

public interface MemberRecordService {

    int insertMemberRecord(MemberRecord memberRecord);

    MemberRecord queryByUserId(Integer userId);
}
