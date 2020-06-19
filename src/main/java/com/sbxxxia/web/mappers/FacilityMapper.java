package com.sbxxxia.web.mappers;

import com.sbxxxia.web.facilities.FacilityDTO;
import org.springframework.stereotype.Repository;
import com.sbxxxia.web.proxy.Pager;

import java.util.List;

@Repository
public interface FacilityMapper {
    public void insertFacility(FacilityDTO facility);
    public void updateFacility(FacilityDTO facility);
    public void deleteFacility(FacilityDTO facility);
    public int count();
    public List<FacilityDTO> selectFacilities(Pager pager);
    public FacilityDTO selectFacility(String facilitySeq);
}
