package com.paperware.papyrus.domain.stock;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.DiscriminatorType.STRING;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = STRING, name = "packaging")
public class Stock {
    /**
     * fields
     */
    @Id
    @GeneratedValue
    @Column(name = "stock_id")
    private Long id;
    // @Enumerated(EnumType.STRING)
    // private Packaging packaging;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "papertype_id")
    private Papertype papertype;
    private int gsm;
    @Enumerated(EnumType.STRING)
    private Manufacturer manufacturer;
    private int paperWidth;
    private int paperLength;

    /**
     * constructor
     */
    public Stock(Papertype papertype, int gsm, Manufacturer manufacturer, int paperWidth, int paperLength) {
        // this.packaging = packaging;
        this.papertype = papertype;
        this.gsm = gsm;
        this.manufacturer = manufacturer;
        this.paperWidth = paperWidth;
        this.paperLength = paperLength;
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

