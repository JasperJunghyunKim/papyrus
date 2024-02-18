package com.paperware.papyrus.domain.stock;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import com.paperware.papyrus.domain.enumerator.SheetsPerReam;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("Ream")
public class Ream extends Stock{


    /**
     * fields
     */
    private SheetsPerReam sheetsPerReam;
    private int initialSheets;

    /**
     * constructor
     */
    public Ream(Papertype papertype, int gsm, Manufacturer manufacturer, int paperWidth, int paperLength, SheetsPerReam sheetsPerReam, int initialSheets) {
        super(papertype, gsm, manufacturer, paperWidth, paperLength);
        this.sheetsPerReam = sheetsPerReam;
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
