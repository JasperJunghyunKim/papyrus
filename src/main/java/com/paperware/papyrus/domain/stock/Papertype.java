package com.paperware.papyrus.domain.stock;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Papertype {
    /**
     * fields
     */
    @Id
    @GeneratedValue
    @Column(name = "papertype_id")
    private Long id;
    private String name;

    /**
     * constructor
     */

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
