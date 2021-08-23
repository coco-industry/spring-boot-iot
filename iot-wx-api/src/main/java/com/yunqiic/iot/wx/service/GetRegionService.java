package com.yunqiic.iot.wx.service;

import com.yunqiic.iot.db.domain.IotRegion;
import com.yunqiic.iot.db.service.IotRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhy
 * @date 2019-01-17 23:07
 **/
@Component
public class GetRegionService {

	@Autowired
	private IotRegionService regionService;

	private static List<IotRegion> iotRegions;

	protected List<IotRegion> getIotRegions() {
		if(iotRegions==null){
			createRegion();
		}
		return iotRegions;
	}

	private synchronized void createRegion(){
		if (iotRegions == null) {
			iotRegions = regionService.getAll();
		}
	}
}
