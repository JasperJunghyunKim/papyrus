package com.paperware.papyrus;

import com.paperware.papyrus.service.PapertypeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class InitDB {

    @Autowired
    PapertypeService papertypeService;

    @PostConstruct
    void insertData(){
        List<String> papertypes = Arrays.asList("네오★아트", "Hi-Q SC", "네오★백상", "브리에", "크린유광지", "뉴백상", "Hi-Q 밀레니엄아트", "GSC", "BW", "KB", "CCP", "SC Manilla", "GS Manilla", "Ivory", "CPW");
        papertypes.forEach(papertypeService::createPapertype);
    }
}
