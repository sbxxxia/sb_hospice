package com.sbxxxia.web.facilities;

import com.sbxxxia.web.mappers.FacilityMapper;
import com.sbxxxia.web.proxy.Box;
import com.sbxxxia.web.proxy.IFunction;
import com.sbxxxia.web.proxy.Pager;
import com.sbxxxia.web.proxy.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/facility")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FacilityController {
    @Autowired Pager pager;
    @Autowired Proxy pxy;
    @Autowired FacilityMapper facilityMapper;
    @Autowired Box<Object> box;

    @GetMapping("/search/{pageNumber}/{searchword}")
    public Map<?,?> list(@PathVariable("pageNumber") String pageNumber,
                         @PathVariable("searchword") String searchWord){
        if(searchWord.equals("")){
            pxy.print("검색어가 없음");
        } else {
            pxy.print("검색어가 "+searchWord);
        }
        pager.paging();
        pager.setNowPage(5);
        pager.setPageSize(5);
        IFunction<Pager, List<FacilityDTO>> f = p -> facilityMapper.selectFacilities(p);
        List<FacilityDTO> l = f.apply(pager);
        pxy.print("*******************");
        for(FacilityDTO facilityDTO : l){
            pxy.print(facilityDTO.toString());
        }
        box.clear();
        box.put("pager",pager);
        box.put("list",1);
        return box.get();
    }

//    @GetMapping("/search/{searchword}")
//    public Map<?,?> list(@PathVariable String searchword){
//        File file = new File();
//    }
}
