package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.enumerator.*;
import com.paperware.papyrus.domain.stock.*;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class StockDto {
    private Long id;
    private Packaging packaging;
    private Papertype papertype;
    private int gsm;
    private Manufacturer manufacturer;
    private int paperWidth;
    private int paperLength;

    // ROLL properties
    private int pipeWidth;
    private PipeWidthUnit pipeWidthUnit;
    private int initialRollLength;

    // REAM, SKID properties
    private SheetsPerReam sheetsPerReam;

    // BOX properties
    private PacksPerBox packsPerBox;
    private SheetsPerPack sheetsPerPack;

    // REAM, SKID, BOX common properties
    private int initialSheets;

    public StockDto(Stock stock) {
        this.id = stock.getId();
        this.packaging = stock.getPackagingType();
        this.papertype = stock.getPapertype();
        this.gsm = stock.getGsm();
        this.manufacturer = stock.getManufacturer();
        this.paperWidth = stock.getPaperWidth();
        this.paperLength = stock.getPaperLength();
        if (stock.getPackagingType() == Packaging.ROLL){
            Roll roll = (Roll)stock;
            this.pipeWidth = roll.getPipeWidth();
            this.pipeWidthUnit = roll.getPipeWidthUnit();
            this.initialRollLength = roll.getInitialRollLength();
        }
        else if(stock.getPackagingType() == Packaging.REAM){
            Ream ream = (Ream)stock;
            this.sheetsPerReam = ream.getSheetsPerReam();
            this.initialSheets = ream.getInitialSheets();
        }
        else if(stock.getPackagingType() == Packaging.SKID){
            Skid skid = (Skid)stock;
            this.initialSheets = skid.getInitialSheets();
        }
        else if(stock.getPackagingType() == Packaging.BOX){
            Box box = (Box)stock;
            this.packsPerBox = box.getPacksPerBox();
            this.sheetsPerPack = box.getSheetsPerPack();
            this.initialSheets = box.getInitialSheets();
        }
    }
}
