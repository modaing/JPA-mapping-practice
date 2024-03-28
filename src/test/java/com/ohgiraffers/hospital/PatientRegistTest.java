package com.ohgiraffers.hospital;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class PatientRegistTest {

    @Autowired
    private PatientRegistService patientRegistService;

    private static Stream<Arguments> getPatientInfo() {
        return Stream.of(
                Arguments.of(230301001, 1),
                Arguments.of(190625011, 2),
                Arguments.of(210817006, 1),
                Arguments.of(240910033, 4)
        );
    }

    @ParameterizedTest(name = "{0}번 환자가 {1}번 증상 호소")
    @MethodSource("getPatientInfo")
    void testPatientCC(int patientNo, int chiefComplaintNo) {
        //given
        //when
        //then
        Assertions.assertDoesNotThrow(
                () -> patientRegistService.patientRegistCC(
                        new PatientRegistDTO(patientNo, chiefComplaintNo)
                )
        );
    }

}
