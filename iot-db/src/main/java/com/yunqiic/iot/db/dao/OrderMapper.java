package com.yunqiic.iot.db.dao;

import org.apache.ibatis.annotations.Param;
import com.yunqiic.iot.db.domain.IotOrder;

import java.time.LocalDateTime;

public interface OrderMapper {
    int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime, @Param("order") IotOrder order);
}