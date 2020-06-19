package com.sbxxxia.web.facilities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class FacilityDTO {
    private String fName, fType, fRegion, fPostalCode, fAddress, fDetailedAddress, fPhoneNumber;
}
