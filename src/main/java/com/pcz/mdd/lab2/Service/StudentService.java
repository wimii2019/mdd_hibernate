package com.pcz.mdd.lab2.Service;

import com.pcz.mdd.lab2.Model.Student;
import com.pcz.mdd.lab2.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    private final StudentRepository studentRepository;

    @PostConstruct
    public void test(){
        log.warn("start");
        studentRepository.save(new Student(null,"Jan","Nowak",123465,2019,1));
        studentRepository.save(new Student(null,"Krzysztof","Kowalski",456262,2019,2));
        studentRepository.save(new Student(null,"Maciej","Pawlak",789456,2019,3));
        studentRepository.findAll().forEach(student -> log.warn("Student: {}",student));
        log.warn("stop");
    }
}
