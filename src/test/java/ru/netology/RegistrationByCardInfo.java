package ru.netology;

import com.github.javafaker.PhoneNumber;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RegistrationByCardInfo {
    private final String city;
    private  final String name;
    private  final PhoneNumber phone;






}
