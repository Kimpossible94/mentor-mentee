package com.mm.kim.mentormentee.mentoring;

import com.mm.kim.mentormentee.member.Mentee;
import com.mm.kim.mentormentee.member.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplyHistoryRepository extends JpaRepository<ApplyHistory, String> {
   List<ApplyHistory> findAllByMentee(Mentee mentee);

   List<ApplyHistory> findAllByMentor(Mentor mentor);

   ApplyHistory findByAhIdx(Long ahIdx);
}
