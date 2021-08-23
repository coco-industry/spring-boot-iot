package com.yunqiic.iot.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.yunqiic.iot.admin.vo.RegionVo;
import com.yunqiic.iot.core.util.ResponseUtil;
import com.yunqiic.iot.db.domain.IotRegion;
import com.yunqiic.iot.db.service.IotRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/admin/region")
@Validated
public class AdminRegionController {
    private final Log logger = LogFactory.getLog(AdminRegionController.class);

    @Autowired
    private IotRegionService regionService;

    @GetMapping("/clist")
    public Object clist(@NotNull Integer id) {
        List<IotRegion> regionList = regionService.queryByPid(id);
        return ResponseUtil.okList(regionList);
    }

    @GetMapping("/list")
    public Object list() {
        List<RegionVo> regionVoList = new ArrayList<>();

        List<IotRegion> iotRegions = regionService.getAll();
        Map<Byte, List<IotRegion>> collect = iotRegions.stream().collect(Collectors.groupingBy(IotRegion::getType));
        byte provinceType = 1;
        List<IotRegion> provinceList = collect.get(provinceType);
        byte cityType = 2;
        List<IotRegion> city = collect.get(cityType);
        Map<Integer, List<IotRegion>> cityListMap = city.stream().collect(Collectors.groupingBy(IotRegion::getPid));
        byte areaType = 3;
        List<IotRegion> areas = collect.get(areaType);
        Map<Integer, List<IotRegion>> areaListMap = areas.stream().collect(Collectors.groupingBy(IotRegion::getPid));

        for (IotRegion province : provinceList) {
            RegionVo provinceVO = new RegionVo();
            provinceVO.setId(province.getId());
            provinceVO.setName(province.getName());
            provinceVO.setCode(province.getCode());
            provinceVO.setType(province.getType());

            List<IotRegion> cityList = cityListMap.get(province.getId());
            List<RegionVo> cityVOList = new ArrayList<>();
            for (IotRegion cityVo : cityList) {
                RegionVo cityVO = new RegionVo();
                cityVO.setId(cityVo.getId());
                cityVO.setName(cityVo.getName());
                cityVO.setCode(cityVo.getCode());
                cityVO.setType(cityVo.getType());

                List<IotRegion> areaList = areaListMap.get(cityVo.getId());
                List<RegionVo> areaVOList = new ArrayList<>();
                for (IotRegion area : areaList) {
                    RegionVo areaVO = new RegionVo();
                    areaVO.setId(area.getId());
                    areaVO.setName(area.getName());
                    areaVO.setCode(area.getCode());
                    areaVO.setType(area.getType());
                    areaVOList.add(areaVO);
                }

                cityVO.setChildren(areaVOList);
                cityVOList.add(cityVO);
            }
            provinceVO.setChildren(cityVOList);
            regionVoList.add(provinceVO);
        }

        return ResponseUtil.okList(regionVoList);
    }
}
