package com.paperware.papyrus.domain.stock;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import com.paperware.papyrus.domain.enumerator.PipeWidthUnit;
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
@DiscriminatorValue("Roll")
public class Roll extends Stock{

    public static final int ROLL_LENGTH = 0;

    /**
     * fields
     */
    private int pipeWidth;
    @Enumerated(EnumType.STRING)
    private PipeWidthUnit pipeWidthUnit;
    private int initialRollLength;

    /**
     * constructor
     */
    public Roll(Papertype papertype, int gsm, Manufacturer manufacturer, int paperWidth, int paperLength, int pipeWidth, PipeWidthUnit pipeWidthUnit, int initialRollLength) {
        super(papertype, gsm, manufacturer, paperWidth, paperLength);
        this.pipeWidth = pipeWidth;
        this.pipeWidthUnit = pipeWidthUnit;
        this.initialRollLength = initialRollLength;
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
