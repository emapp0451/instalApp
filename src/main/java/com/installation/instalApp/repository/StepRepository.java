package com.installation.instalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.installation.instalApp.model.Step;
@Repository
public interface StepRepository extends JpaRepository<Step, Integer>{

}
