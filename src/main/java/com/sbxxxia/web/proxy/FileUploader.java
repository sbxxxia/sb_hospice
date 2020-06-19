package com.sbxxxia.web.proxy;

import com.sbxxxia.web.facilities.Facility;
import com.sbxxxia.web.facilities.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service("uploader") @Lazy
public class FileUploader extends Proxy {
    @Autowired Inventory<String> inventory;
    @Autowired FacilityRepository facilityRepository;
//    @Autowired Facility facility;
    public void listUploader(ArrayList<HashMap<String,String>> list){
        print("\n*******************");
        print(list.get(0).toString());
        Facility f = new Facility();
        f.setFacilitySeq(list.get(0).get("facilitySeq"));
        f.setFName(list.get(0).get("fName"));
        f.setFType(list.get(0).get("fType"));
        f.setFRegion(list.get(0).get("fRegion"));
        f.setFPostalCode(list.get(0).get("fPostalCode"));
        f.setFAddress(list.get(0).get("fAddress"));
        f.setFDetailedAddress(list.get(0).get("fDetailedAddress"));
        f.setFPhoneNumber(list.get(0).get("fPhoneNumber"));
        facilityRepository.save(f);
    }
}
