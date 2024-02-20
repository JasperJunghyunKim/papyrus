package com.paperware.papyrus;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import com.paperware.papyrus.domain.enumerator.Packaging;
import com.paperware.papyrus.domain.enumerator.PipeWidthUnit;
import com.paperware.papyrus.domain.stock.Papertype;
import com.paperware.papyrus.domain.stock.Roll;
import com.paperware.papyrus.domain.stock.Stock;
import com.paperware.papyrus.dto.PapertypeDto;
import com.paperware.papyrus.dto.RollCreateResponse;
import com.paperware.papyrus.repository.PapertypeRepository;
import com.paperware.papyrus.repository.StockRepository;
import com.paperware.papyrus.service.PapertypeService;
import com.paperware.papyrus.service.StockService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class InitDB {

    @Autowired
    PapertypeRepository papertypeRepository;
    @Autowired
    StockRepository stockRepository;
    @Autowired
    PapertypeService papertypeService;
    @Autowired
    StockService stockService;

    @PostConstruct
    void insertData(){

        Random random = new Random();

        // Papertype
        List<String> papertypeInput = Arrays.asList("네오★아트", "Hi-Q SC", "네오★백상", "브리에", "크린유광지", "뉴백상", "Hi-Q 밀레니엄아트", "GSC", "BW", "KB", "CCP", "SC Manilla", "GS Manilla", "Ivory", "CPW");
        papertypeInput.forEach(papertypeService::createPapertype);

        // Stock
        for (int i = 0; i < 1000; i++) {

            List<Papertype> papertypeList = papertypeRepository.findAll();
            Papertype papertype = papertypeList.get(random.nextInt(papertypeList.size()));
            Packaging[] packagingList = Packaging.values();
            Packaging packaging = packagingList[random.nextInt(packagingList.length)];
            Manufacturer[] manufacturerList = Manufacturer.values();
            Manufacturer manufacturer = manufacturerList[random.nextInt(packagingList.length)];

            if (packaging == Packaging.ROLL){

                PipeWidthUnit[] pipeWidthUnitList = PipeWidthUnit.values();
                PipeWidthUnit pipeWidthUnit = pipeWidthUnitList[random.nextInt(pipeWidthUnitList.length)];

                Roll roll = new Roll(
                        papertype,
                        random.nextInt(400),
                        manufacturer,
                        random.nextInt(1000),
                        Roll.ROLL_LENGTH,
                        random.nextInt(10),
                        pipeWidthUnit,
                        random.nextInt(10000, 30000)
                );
                stockRepository.save(roll);
            }
        }
    }

}
