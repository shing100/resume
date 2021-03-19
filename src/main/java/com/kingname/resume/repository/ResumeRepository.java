package com.kingname.resume.repository;

import com.kingname.resume.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Account, Long> {

}
