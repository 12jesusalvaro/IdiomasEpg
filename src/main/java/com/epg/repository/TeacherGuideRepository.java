package com.epg.repository;

import com.epg.model.TeacherGuide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherGuideRepository extends JpaRepository<TeacherGuide, Long> {
}
