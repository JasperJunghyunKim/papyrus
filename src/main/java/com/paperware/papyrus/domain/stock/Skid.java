package com.paperware.papyrus.domain.stock;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("Skid")
public class Skid extends Stock{

    /**
     * fields
     */
    private int initialSheets;

    /**
     * constructor
     */
    public Skid(Papertype papertype, int gsm, Manufacturer manufacturer, int paperWidth, int paperLength, int initialSheets) {
        super(papertype, gsm, manufacturer, paperWidth, paperLength);
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
