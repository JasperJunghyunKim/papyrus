package com.paperware.papyrus.repository;

import com.paperware.papyrus.domain.stock.Papertype;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapertypeRepository extends JpaRepository<Papertype, Long> {
}
