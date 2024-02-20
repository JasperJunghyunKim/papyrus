package com.paperware.papyrus.domain.stock;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import com.paperware.papyrus.domain.enumerator.PacksPerBox;
import com.paperware.papyrus.domain.enumerator.SheetsPerPack;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("Box")
public class Box extends Stock{

    /**
     * fields
     */
    @Enumerated(EnumType.STRING)
    private PacksPerBox packsPerBox;
    @Enumerated(EnumType.STRING)
    private SheetsPerPack sheetsPerPack;
    private int initialSheets;

    /**
     * constructor
     */
    public Box(Papertype papertype, int gsm, Manufacturer manufacturer, int paperWidth, int paperLength, PacksPerBox packsPerBox, SheetsPerPack sheetsPerPack, int initialSheets) {
        super(papertype, gsm, manufacturer, paperWidth, paperLength);
        this.packsPerBox = packsPerBox;
        this.sheetsPerPack = sheetsPerPack;
        this.initialSheets = initialSheets;
    }
    /**
     * atomic relation method
     */

    /**
     * change method (i.e., alternative of @Setter)
     */

    /**
     * static create method
     */

    /**
     * business method
     */
}
